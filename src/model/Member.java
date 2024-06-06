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
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.table.DefaultTableModel;
import service.DatabaseConnection;

/**
 *
 * @author zidan
 */
public class Member extends User {

    // Atribut
    private ArrayList<Peminjaman> totalPinjam;

    // Constructor
    public Member(String username, String password, String alamat, String nama, String telepon, Date tngglLahir) {
        super(username, password, alamat, nama, telepon, tngglLahir);
    }

    public Member(String username, String password) {
        super(username, password);
    }

    public DefaultTableModel lihatDataBuku() {
        DefaultTableModel model = new DefaultTableModel();

        // Add columns to model
        model.addColumn("ID Buku");
        model.addColumn("Judul");
        model.addColumn("Penulis");
        model.addColumn("Kategori");
        model.addColumn("Penerbit");
        model.addColumn("Tahun Terbit");
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
                    resultSet.getString("Kategori"),
                    resultSet.getString("Penerbit"),
                    resultSet.getString("Tahun_terbit"),
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
    
    public DefaultTableModel lihatDataPeminjamanByUsername() {
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
            String query = "SELECT * FROM Peminjaman WHERE username_member=?";
            PreparedStatement preparedStatement = db.conn.prepareStatement(query);
            preparedStatement.setString(1, super.getUsername());
            ResultSet resultSet = preparedStatement.executeQuery();

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
    
    public ArrayList<Buku> getDataBuku(){
        DatabaseConnection db = null;
        ArrayList<Buku> daftarBuku = new ArrayList<>();
        try {
            db = new DatabaseConnection();
            Statement stmt = DatabaseConnection.conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM Buku");
             
            
            while (resultSet.next()){
                String id = resultSet.getString("id_buku");
                String judul = resultSet.getString("Judul");
                String penulis = resultSet.getString("Penulis");
                String kategori = resultSet.getString("Kategori");
                String penerbit = resultSet.getString("Penerbit");
                String tahunTerbit = resultSet.getString("Tahun_terbit");
                String stok = resultSet.getString("Stok");
                
                daftarBuku.add(new Buku(id,judul,penulis,penerbit,tahunTerbit,kategori,stok));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
             if (db != null) {
                db.closeConnection();
            }
        }
        return daftarBuku;
    }
    
    public int getJumlahBuku(){
        DatabaseConnection db = null;
        int jumlahBuku = 0;
        try {
            db = new DatabaseConnection();
            Statement stmt = DatabaseConnection.conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT COUNT(*) FROM Buku");
            if (resultSet.next()) {
                jumlahBuku = resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
             if (db != null) {
                db.closeConnection();
            }
        }
        return jumlahBuku;
    }
    
    public int getJumlahPeminjaman(){
        DatabaseConnection db = null;
        int jumlahPeminjaman = 0;
        try {
            db = new DatabaseConnection();
            String query = "SELECT COUNT(*) FROM Peminjaman WHERE username_member=?";
            PreparedStatement preparedStatement = db.conn.prepareStatement(query);
            preparedStatement.setString(1, super.getUsername());
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
                jumlahPeminjaman = resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
             if (db != null) {
                db.closeConnection();
            }
        }
        return jumlahPeminjaman;
    }
    
    public void tambahDataPeminjaman(Buku buku) {
        DatabaseConnection db = null;
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDate currentDate = currentDateTime.toLocalDate();
        LocalDate dateSevenDaysFromNow = currentDate.plusDays(7);
        Date sqlDate = java.sql.Date.valueOf(currentDate);
        Date sqlDate2 = java.sql.Date.valueOf(dateSevenDaysFromNow);
        
        Random random = new Random();
        int randomNumber = random.nextInt(900) + 100;
        String idPeminjaman = String.valueOf(randomNumber);
        try {
            db = new DatabaseConnection();
            //Menyimpan data peminjaman ke database
            String query = "INSERT INTO Peminjaman (username_member, id_buku, Status, Tenggat_waktu,Tanggal_peminjaman,id_peminjaman) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = db.conn.prepareStatement(query);
            pstmt.setString(1, super.getUsername());
            pstmt.setString(2, buku.getId_buku());
            pstmt.setString(3, "belum dikonfirmasi");
            pstmt.setDate(4, (java.sql.Date) sqlDate2);
            pstmt.setDate(5, (java.sql.Date) sqlDate);
            pstmt.setString(6, idPeminjaman);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (db != null) {
                db.closeConnection();
            }
        }
    }
    
    public boolean kurangStokBuku(String idBuku, String stok) {
        DatabaseConnection db = null;
        String updateSQL = "UPDATE Buku SET Stok = ? WHERE id_buku = ?";
        try {
            int stokInt = Integer.parseInt(stok);
            stokInt--;
            String stringStok = String.valueOf(stokInt);
            PreparedStatement pstmt = DatabaseConnection.conn.prepareStatement(updateSQL);
            // Set the parameters for the update statement
            pstmt.setString(1, stringStok);
            pstmt.setString(2, idBuku);

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

}
