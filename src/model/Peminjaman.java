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
import java.util.Date;

public class Peminjaman {
    // Atribut
    private int id_peminjaman;
    private String usernameMember;
    private int id_buku;
    private String usernamePetugasPeminjam;
    private String usernamePetugasPenerima;
    private Status status;
    private Date tanggalPeminjaman;
    private Date tenggatWaktu;
    private Date tanggalPengembalian;
    private double denda;
    
    // Constructor, Getter, dan Setter
    public Peminjaman(int id_peminjaman, String usernameMember, int id_buku, String usernamePetugasPeminjam, String usernamePetugasPenerima, Status status, Date tanggalPeminjaman, Date tenggatWaktu, Date tanggalPengembalian, double denda) {
        this.id_peminjaman = id_peminjaman;
        this.usernameMember = usernameMember;
        this.id_buku = id_buku;
        this.usernamePetugasPeminjam = usernamePetugasPeminjam;
        this.usernamePetugasPenerima = usernamePetugasPenerima;
        this.status = status;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.tenggatWaktu = tenggatWaktu;
        this.tanggalPengembalian = tanggalPengembalian;
        this.denda = denda;
    }

    public int getId_peminjaman() {
        return id_peminjaman;
    }

    public void setId_peminjaman(int id_peminjaman) {
        this.id_peminjaman = id_peminjaman;
    }

    public String getUsernameMember() {
        return usernameMember;
    }

    public void setUsernameMember(String usernameMember) {
        this.usernameMember = usernameMember;
    }

    public int getId_buku() {
        return id_buku;
    }

    public void setId_buku(int id_buku) {
        this.id_buku = id_buku;
    }

    public String getUsernamePetugasPeminjam() {
        return usernamePetugasPeminjam;
    }

    public void setUsernamePetugasPeminjam(String usernamePetugasPeminjam) {
        this.usernamePetugasPeminjam = usernamePetugasPeminjam;
    }

    public String getUsernamePetugasPenerima() {
        return usernamePetugasPenerima;
    }

    public void setUsernamePetugasPenerima(String usernamePetugasPenerima) {
        this.usernamePetugasPenerima = usernamePetugasPenerima;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }

    public void setTanggalPeminjaman(Date tanggalPeminjaman) {
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    public Date getTenggatWaktu() {
        return tenggatWaktu;
    }

    public void setTenggatWaktu(Date tenggatWaktu) {
        this.tenggatWaktu = tenggatWaktu;
    }

    public Date getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public void setTanggalPengembalian(Date tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public double getDenda() {
        return denda;
    }

    public void setDenda(double denda) {
        this.denda = denda;
    }

    // Enum untuk status peminjaman
    public enum Status {
        BELUM_DIKONFIRMASI,
        DIPINJAM,
        TELAT,
        DIKEMBALIKAN,
        DITOLAK
    }
}

