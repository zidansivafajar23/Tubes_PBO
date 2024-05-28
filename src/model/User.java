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
public abstract class User {
    
    // Atribut
    private String username;
    private String password;
    private String alamat;
    private String nama;
    private int umur;
    private String telepon;
    private Date tngglLahir;
    
    
    // Constructor, Getter, dan Setter
    public User(String username, String password, String alamat, String nama, int umur, String telepon, Date tngglLahir) {
        this.username = username;
        this.password = password;
        this.alamat = alamat;
        this.nama = nama;
        this.umur = umur;
        this.telepon = telepon;
        this.tngglLahir = tngglLahir;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public Date getTngglLahir() {
        return tngglLahir;
    }

    public void setTngglLahir(Date tngglLahir) {
        this.tngglLahir = tngglLahir;
    }
    
    // Abstract Method dan Regular Method
    
    
    
    
}
