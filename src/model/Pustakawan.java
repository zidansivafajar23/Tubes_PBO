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
public interface Pustakawan {
    public abstract void lihatDataAnggota();
    public abstract void lihatDataBuku();
    public abstract void tambahDataBuku();
    public abstract void hapusDataBuku();
    public abstract void ubahDataBuku();
}
