/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author zidan
 */
public class Member extends User {
    
    // Atribut
    private ArrayList<Peminjaman> totalPinjam;
    
    
    // Constructor
    public Member(String username, String password, String alamat, String nama, String telepon, Date tngglLahir) {
        super(username, password, alamat, nama, telepon, tngglLahir);
    }
    
}
