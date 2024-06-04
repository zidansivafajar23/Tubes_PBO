/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import service.DatabaseConnection;

/**
 *
 * @author zidan
 */
public class KepalaPerpus extends User implements Pustakawan {

    //Constructor
    public KepalaPerpus(String username, String password, String alamat, String nama, String telepon, Date tanggalLahir) {
        super(username, password, alamat, nama, telepon, tanggalLahir);
    }

    public KepalaPerpus(String username, String password) {
        super(username, password);
    }

    //Method
    @Override
    public DefaultTableModel lihatDataAnggota() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Username");
        model.addColumn("Password");
        model.addColumn("Role");
        model.addColumn("Nama");
        model.addColumn("Alamat");
        model.addColumn("Tanggal Lahir");
        model.addColumn("No HP");

        DatabaseConnection db = null;
        try {
            db = new DatabaseConnection();
            Statement stmt = DatabaseConnection.conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM Pengguna WHERE Role = 'petugas'");

            while (resultSet.next()) {
                Object[] row = {
                    resultSet.getString("username"),
                    resultSet.getString("Password"),
                    resultSet.getString("Role"),
                    resultSet.getString("Nama"),
                    resultSet.getString("Alamat"),
                    resultSet.getDate("Tanggal_lahir"),
                    resultSet.getString("No_hp")
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (db != null) {
                db.closeConnection();
            }
        }
        return model;
    }

    
    @Override
    public DefaultTableModel lihatDataBuku() {
        DefaultTableModel model = new DefaultTableModel();

        // Add columns to model
        model.addColumn("ID Buku");
        model.addColumn("Judul");
        model.addColumn("Penulis");
        model.addColumn("Penerbit");
        model.addColumn("Tahun Terbit");
        model.addColumn("Kategori");
        model.addColumn("Stok");

        DatabaseConnection db = null;
        try {
            db = new DatabaseConnection();
            Statement stmt = DatabaseConnection.conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM Buku");

            // Iterate through result set and add rows to model
            while (resultSet.next()) {
                Object[] row = {
                    resultSet.getString("id_buku"),
                    resultSet.getString("Judul"),
                    resultSet.getString("Penulis"),
                    resultSet.getString("Penerbit"),
                    resultSet.getString("Tahun_terbit"),
                    resultSet.getString("Kategori"),
                    resultSet.getString("Stok")
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (db != null) {
                db.closeConnection();
            }
        }

        return model;
    }

    @Override
    public boolean editDataBuku(String idBuku, String judul,  String penulis, String penerbit, String tahunTerbit, String stok) {
        DatabaseConnection db = null;
        String updateSQL = "UPDATE Buku SET Judul = ?, Penulis = ?, Penerbit = ?, Tahun_terbit = ?, Stok = ? WHERE id_buku = ?";
        try {
            PreparedStatement pstmt = DatabaseConnection.conn.prepareStatement(updateSQL);
            // Set the parameters for the update statement
            pstmt.setString(1, judul);
            pstmt.setString(2, penulis);
            pstmt.setString(3, penerbit);
            pstmt.setString(4, tahunTerbit);
            pstmt.setString(5, stok);
            pstmt.setString(6, idBuku);

            // Execute the update statement
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (db != null) {
                db.closeConnection();
            }
        }
    }

    @Override
    public void tambahDataBuku(String idBuku, String judul, String penulis, String penerbit, String tahunTerbit, String kategori, String stok) {
        DatabaseConnection db = null;
        String insertSQL = "INSERT INTO Buku (id_buku, Judul, Penulis, Penerbit, Tahun_terbit, Kategori, Stok) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pstmt = DatabaseConnection.conn.prepareStatement(insertSQL);
            // Set the parameters for the insert statement
            pstmt.setString(1, idBuku);
            pstmt.setString(2, judul);
            pstmt.setString(3, penulis);
            pstmt.setString(4, penerbit);
            pstmt.setString(5, tahunTerbit);
            pstmt.setString(6, kategori);
            pstmt.setString(7, stok);
            // Execute the insert statement
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (db != null) {
                db.closeConnection();
            }
        }
    }

    @Override
    public boolean hapusDataBuku(String idBuku) {
        DatabaseConnection db = null;
        String deletePeminjamanSQL = "DELETE FROM peminjaman WHERE id_buku = ?";
        String deleteBukuSQL = "DELETE FROM Buku WHERE id_buku = ?";
        
        try {
             PreparedStatement pstmtPeminjaman = DatabaseConnection.conn.prepareStatement(deletePeminjamanSQL);
             PreparedStatement pstmtBuku = DatabaseConnection.conn.prepareStatement(deleteBukuSQL);
             
             // Hapus data terkait di tabel peminjaman
            pstmtPeminjaman.setString(1, idBuku);
            pstmtPeminjaman.executeUpdate();
            
            // Hapus data di tabel buku
            pstmtBuku.setString(1, idBuku);
            int affectedRows = pstmtBuku.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (db != null) {
            db.closeConnection();
            }
        }
    }

    @Override
    public void ubahDataBuku() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public boolean editDataPetugas(String username, String password, String nama, String alamat, Date tanggalLahir, String noHp) {
        DatabaseConnection db = null;
        String updateSQL = "UPDATE Pengguna SET Password = ?, Nama = ?, Alamat = ?, Tanggal_lahir = ?, No_hp = ? WHERE username = ? AND Role = 'petugas'";
        try {
            db = new DatabaseConnection();
            PreparedStatement pstmt = DatabaseConnection.conn.prepareStatement(updateSQL);
            pstmt.setString(1, password);
            pstmt.setString(2, nama);
            pstmt.setString(3, alamat);
            pstmt.setDate(4, new java.sql.Date(tanggalLahir.getTime()));
            pstmt.setString(5, noHp);
            pstmt.setString(6, username);

            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (db != null) {
                db.closeConnection();
            }
        }
    }
    
    public boolean tambahDataPetugas(String username, String password, String nama, String alamat, Date tanggalLahir, String noHp) {
        DatabaseConnection db = null;
        String insertSQL = "INSERT INTO Pengguna (Username, Password, Nama, Alamat, Tanggal_lahir, No_hp, Role) VALUES (?, ?, ?, ?, ?, ?, 'petugas')";
        try {
            db = new DatabaseConnection();
            PreparedStatement pstmt = DatabaseConnection.conn.prepareStatement(insertSQL);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setString(3, nama);
            pstmt.setString(4, alamat);
            pstmt.setDate(5, new java.sql.Date(tanggalLahir.getTime()));
            pstmt.setString(6, noHp);
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (db != null) {
                db.closeConnection();
            }
        }
    }
}

