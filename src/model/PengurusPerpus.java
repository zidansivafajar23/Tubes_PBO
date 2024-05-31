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
import javax.swing.table.TableModel;
import service.DatabaseConnection;

/**
 *
 * @author zidan
 */
public class PengurusPerpus extends User implements Pustakawan {

    //Constructor
    public PengurusPerpus(String username, String password, String alamat, String nama, String telepon, Date tanggalLahir) {
        super(username, password, alamat, nama, telepon, tanggalLahir);
    }

    public PengurusPerpus(String username, String password) {
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
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM Pengguna WHERE Role = 'member'");

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
    public void tambahDataBuku() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void hapusDataBuku() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ubahDataBuku() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public boolean editDataMember(String username, String password, String nama, String alamat, Date tanggalLahir, String noHp) {
        DatabaseConnection db = null;
        String updateSQL = "UPDATE Pengguna SET Password = ?, Nama = ?, Alamat = ?, Tanggal_lahir = ?, No_hp = ? WHERE username = ? AND Role = 'member'";
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
    
    public void setPetugasPeminjam(int id_peminjaman, String usernamePetugasPeminjam) {
        DatabaseConnection db = null;
        try {
            db = new DatabaseConnection();
            String query = "UPDATE Peminjaman SET username_petugas_peminjam=? WHERE id_peminjaman=?";
            PreparedStatement preparedStatement = db.conn.prepareStatement(query);
            preparedStatement.setString(1, usernamePetugasPeminjam);
            preparedStatement.setInt(2, id_peminjaman);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (db != null) {
                db.closeConnection();
            }
        }
    }
    
    public void setPetugasPenerima(int id_peminjaman, String usernamePetugasPenerima) {
        DatabaseConnection db = null;
        try {
            db = new DatabaseConnection();
            String query = "UPDATE Peminjaman SET username_petugas_penerima=? WHERE id_peminjaman=?";
            PreparedStatement preparedStatement = db.conn.prepareStatement(query);
            preparedStatement.setString(1, usernamePetugasPenerima);
            preparedStatement.setInt(2, id_peminjaman);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (db != null) {
                db.closeConnection();
            }
        }
    }
    
    public DefaultTableModel lihatDataPeminjaman() {
        DefaultTableModel model = new DefaultTableModel();

        // Add columns to model
        model.addColumn("ID Peminjaman");
        model.addColumn("Username Member");
        model.addColumn("ID Buku");
        model.addColumn("Username Petugas Peminjam");
        model.addColumn("Username Petugas Penerima");
        model.addColumn("Status");
        model.addColumn("Tanggal Peminjaman");
        model.addColumn("Tenggat Waktu");
        model.addColumn("Tanggal Pengembalian");
        model.addColumn("Denda");

        DatabaseConnection db = null;
        try {
            db = new DatabaseConnection();
            Statement stmt = db.conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM Peminjaman");

            // Iterate through result set and add rows to model
            while (resultSet.next()) {
                Object[] row = {
                    resultSet.getInt("id_peminjaman"),
                    resultSet.getString("username_member"),
                    resultSet.getInt("id_buku"),
                    resultSet.getString("username_petugas_peminjam"),
                    resultSet.getString("username_petugas_penerima"),
                    resultSet.getString("Status"),
                    resultSet.getDate("Tanggal_peminjaman"),
                    resultSet.getDate("Tenggat_waktu"),
                    resultSet.getDate("Tanggal_pengembalian"),
                    resultSet.getDouble("Denda")
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
    
    public void updateStatusPeminjaman(int id_peminjaman, String newStatus) {
        DatabaseConnection db = null;
        try {
            db = new DatabaseConnection();
            String query = "UPDATE Peminjaman SET Status=? WHERE id_peminjaman=?";
            PreparedStatement preparedStatement = db.conn.prepareStatement(query);
            preparedStatement.setString(1, newStatus);
            preparedStatement.setInt(2, id_peminjaman);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (db != null) {
                db.closeConnection();
            }
        }
    }
}
