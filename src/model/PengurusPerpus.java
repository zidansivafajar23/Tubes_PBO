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
    public void lihatDataAnggota() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

}
