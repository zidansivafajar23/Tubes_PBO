/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zidan
 */
public interface Pustakawan {
    public abstract void lihatDataAnggota();
    public abstract DefaultTableModel lihatDataBuku();
    public abstract void tambahDataBuku();
    public abstract void hapusDataBuku();
    public abstract void ubahDataBuku();
    public abstract boolean editDataBuku(String idBuku, String judul, String penulis, String penerbit, String tahunTerbit, String stok);
}
