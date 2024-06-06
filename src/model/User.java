/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

import service.DatabaseConnection;
import static service.DatabaseConnection.conn;

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
    Date tanggalLahir;
    
    
    // Constructor, Getter, dan Setter
    public User(String username, String password, String alamat, String nama, String telepon, Date tngglLahir) {
        this.username = username;
        this.password = password;
        this.alamat = alamat;
        this.nama = nama;
        this.telepon = telepon;
        this.tanggalLahir = tngglLahir;
        this.umur = calculateAge(tanggalLahir);
    }
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
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
        return tanggalLahir;
    }

    public void setTngglLahir(Date tngglLahir) {
        this.tanggalLahir = tngglLahir;
    }
    
    public User getUser() throws SQLException{
        DatabaseConnection db = new DatabaseConnection();
        String query = "SELECT * FROM pengguna WHERE username=?";
        PreparedStatement preparedStatement = db.conn.prepareStatement(query);
        preparedStatement.setString(1, username);
        ResultSet resultSet = preparedStatement.executeQuery();
        
         if (resultSet.next()) {
            String password = resultSet.getString("Password");
            String alamat = resultSet.getString("Alamat");
            String nama = resultSet.getString("Nama");
            Date tanggalLahir = resultSet.getDate("Tanggal_lahir");
            String telepon = resultSet.getString("No_hp");
            
            this.nama = nama;
            this.alamat = alamat;
            this.tanggalLahir = tanggalLahir;
            this.telepon = telepon;
            
            Member member = new Member(
                username,
                password,
                alamat,
                nama,
                telepon,
                tanggalLahir
            );

            resultSet.close();
            preparedStatement.close();
            conn.close();

            return member;
        } else {
            resultSet.close();
            preparedStatement.close();
            conn.close();
            return null; // Jika user tidak ditemukan
        }
    }
    
    // Abstract Method dan Regular Method
    
    public int calculateAge(Date birthDate) {
        Calendar birthCal = Calendar.getInstance();
        birthCal.setTime(birthDate);

        Calendar todayCal = Calendar.getInstance();

        int age = todayCal.get(Calendar.YEAR) - birthCal.get(Calendar.YEAR);

        if (todayCal.get(Calendar.DAY_OF_YEAR) < birthCal.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }

        return age;
    }
    
    // Method untuk mendaftarkan pengguna baru
    public boolean register() {
        DatabaseConnection db = null;
        try {
            db = new DatabaseConnection();
            // Periksa apakah username sudah digunakan
            String checkQuery = "SELECT * FROM pengguna WHERE username = ?";
            PreparedStatement checkStatement = DatabaseConnection.conn.prepareStatement(checkQuery);
            checkStatement.setString(1, username);
            ResultSet resultSet = checkStatement.executeQuery();

            // Jika username sudah ada, kembalikan false
            if (resultSet.next()) {
                System.out.println("Username sudah digunakan.");
                return false;
            }

            java.util.Date utilDate = this.tanggalLahir; // Mendapatkan java.util.Date
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime()); // Konversi ke java.sql.Date

            // Jika username belum digunakan, lakukan pendaftaran
            
            String insertQuery = "INSERT INTO pengguna (username, password, nama, alamat, tanggal_lahir, no_hp, role) VALUES (?, ?, ?, ?, ?, ?, 'Member')";
            PreparedStatement insertStatement = DatabaseConnection.conn.prepareStatement(insertQuery);
            insertStatement.setString(1, this.username);
            insertStatement.setString(2, this.password);
            insertStatement.setString(3, this.nama);
            insertStatement.setString(4, this.alamat);
            insertStatement.setDate(5, sqlDate);
            insertStatement.setString(6, this.telepon);
            insertStatement.executeUpdate();
            System.out.println("Anggota berhasil terdaftar.");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }   finally {
            if (db != null) {
                db.closeConnection();
            }
        }
    }
    
    // Sign In
    public boolean signIn(String username, String password) {
        DatabaseConnection db = null;
        try {
            db = new DatabaseConnection();
            // Query untuk memeriksa apakah pengguna ada di database
            String query = "SELECT * FROM pengguna WHERE username = ? AND password = ?";
            PreparedStatement statement = DatabaseConnection.conn.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();

            // Jika pengguna ditemukan, update status sign in ke "true"
            if (resultSet.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (db != null) {
                db.closeConnection();
            }
        }
        // Jika pengguna tidak ditemukan, kembalikan false
        return false;
    }
    
     public String getRole(String username) {
    DatabaseConnection db = null;
    String role = null;
    String query = "SELECT Role FROM Pengguna WHERE username = ?";
    
    try {
        db = new DatabaseConnection();
        if (db != null) {
            PreparedStatement stmt = db.conn.prepareStatement(query);
            stmt.setString(1, username);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                role = rs.getString("Role");
            }
            
            // Close resources
            rs.close();
            stmt.close();
        } else {
            System.err.println("Failed to establish a database connection.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        if (db != null) {
            db.closeConnection();  // Assuming DatabaseConnection has a close method to close the connection
        }
    }
         System.out.println(role);
    
    return role;
}

}
