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
import java.util.ArrayList;
import java.util.Date;
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

}
