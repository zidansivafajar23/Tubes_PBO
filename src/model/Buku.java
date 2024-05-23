/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
    
    
    
}
