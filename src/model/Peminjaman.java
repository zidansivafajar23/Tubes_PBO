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
public class Peminjaman {
    //Attribute
    private int id_peminjaman;
    private Buku bukuDipinjam;
    private Date tanggalPinjam;
    private Date tanggalPengembalian;
    private boolean pengembalian;
    
    //Constructor, Getter, dan Setter

    public Peminjaman(int id_peminjaman, Buku bukuDipinjam, Date tanggalPinjam, Date tanggalPengembalian) {
        this.id_peminjaman = id_peminjaman;
        this.bukuDipinjam = bukuDipinjam;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalPengembalian = tanggalPengembalian;
        pengembalian = false;
    }

    public int getId_peminjaman() {
        return id_peminjaman;
    }

    public void setId_peminjaman(int id_peminjaman) {
        this.id_peminjaman = id_peminjaman;
    }

    public Buku getBukuDipinjam() {
        return bukuDipinjam;
    }

    public void setBukuDipinjam(Buku bukuDipinjam) {
        this.bukuDipinjam = bukuDipinjam;
    }

    public Date getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(Date tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public Date getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public void setTanggalPengembalian(Date tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public boolean isPengembalian() {
        return pengembalian;
    }

    public void setPengembalian(boolean pengembalian) {
        this.pengembalian = pengembalian;
    }
    
    
    //Method
    
}
