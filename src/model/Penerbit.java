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
public class Penerbit {
    //Attribute
    private int id_penerbit;
    private String namaPenerbit;
    private String alamat;
    
    
    //Constructor, Getter, dan Setter

    public Penerbit(int id_penerbit, String namaPenerbit, String alamat) {
        this.id_penerbit = id_penerbit;
        this.namaPenerbit = namaPenerbit;
        this.alamat = alamat;
    }

    public int getId_penerbit() {
        return id_penerbit;
    }

    public void setId_penerbit(int id_penerbit) {
        this.id_penerbit = id_penerbit;
    }

    public String getNamaPenerbit() {
        return namaPenerbit;
    }

    public void setNamaPenerbit(String namaPenerbit) {
        this.namaPenerbit = namaPenerbit;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
    //Method
}
