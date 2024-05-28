/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import service.DatabaseConnection;

/**
 *
 * @author zidan
 */
public class Buku {
    // Attribute
    private int id_buku;
    private String judul;
    private Penulis penulis;
    private Penerbit penerbit;
    private String tahunTerbit;
    private int Stock;
    
    
    // Constructor, Setter dan Getter

    public Buku(int id_buku, String judul, Penulis penulis, Penerbit penerbit, String tahunTerbit, int Stock) {
        this.id_buku = id_buku;
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
        this.Stock = Stock;
    }

    public int getId_buku() {
        return id_buku;
    }

    public void setId_buku(int id_buku) {
        this.id_buku = id_buku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public Penulis getPenulis() {
        return penulis;
    }

    public void setPenulis(Penulis penulis) {
        this.penulis = penulis;
    }

    public Penerbit getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(Penerbit penerbit) {
        this.penerbit = penerbit;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    
    //Method
    public boolean checkAvailabilityByStock() {
        boolean available = false;
        DatabaseConnection dbConnection = null;
        try {
            dbConnection = new DatabaseConnection();
            String query = "SELECT stock FROM buku WHERE id_buku = ?";
            PreparedStatement stmt = dbConnection.conn.prepareStatement(query);
            stmt.setInt(1, getId_buku()); // Gunakan method getter
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int stock = rs.getInt("stock");
                if (stock > 0) {
                    available = true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (dbConnection != null) {
                dbConnection.closeConnection();
            }
        }
        return available;
    }
    
    
}
