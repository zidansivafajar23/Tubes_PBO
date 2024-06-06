package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import service.DatabaseConnection;

public class Buku {
    // Attributes
    private String id_buku;
    private String judul;
    private String penulis;
    private String penerbit;
    private String tahunTerbit;
    private String kategori;
    private String stock;

    public Buku(String id_buku, String judul, String penulis, String penerbit, String tahunTerbit, String kategori, String stock) {
        this.id_buku = id_buku;
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
        this.kategori = kategori;
        this.stock = stock;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    


    public String getId_buku() {
        return id_buku;
    }

    public void setId_buku(String id_buku) {
        this.id_buku = id_buku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    // Method
    public boolean checkAvailabilityByStock() {
        boolean available = false;
        DatabaseConnection dbConnection = null;
        try {
            dbConnection = new DatabaseConnection();
            String query = "SELECT stok FROM buku WHERE id_buku = ?";
            PreparedStatement stmt = dbConnection.conn.prepareStatement(query);
            stmt.setString(1, getId_buku()); // Use getter method
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int stock = Integer.parseInt(rs.getString("stok"));
                if (stock > 0) {
                    available = true;
                }
            }
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
        } finally {
            if (dbConnection != null) {
                dbConnection.closeConnection();
            }
        }
        return available;
    }
}
