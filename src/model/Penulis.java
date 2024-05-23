/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author zidan
 */
public class Penulis {
    //Attribute
    private int id_penulis;
    private String nama;
    private String alamat;
    private Date tanggalLahir;
    
    
    //Constructor, Getter, dan Setter

    public Penulis(int id_penulis, String nama, String alamat, Date tanggalLahir) {
        this.id_penulis = id_penulis;
        this.nama = nama;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
    }

    public int getId_penulis() {
        return id_penulis;
    }

    public void setId_penulis(int id_penulis) {
        this.id_penulis = id_penulis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    
    
    //Method
    
}
