/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rakha
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class DatabaseConnection {

    private static final String DB_URL = "jdbc:mysql://localhost:3308/perpustakaan";
    private static final String USER = "root"; // Default username di XAMPP
    private static final String PASSWORD = ""; // Default password di XAMPP
    public static Connection conn;
    public static Statement stmt;
    public static ResultSet rs;

    public DatabaseConnection() throws SQLException {
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            stmt = conn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage(),"Connection Error",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public ResultSet getData(String SQLString){
        try {
            rs = stmt.executeQuery(SQLString);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error :" + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }
    
    public void query (String SQLString){
        try {
            stmt.executeUpdate(SQLString);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error :" + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void closeConnection(){
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    

    // Metode untuk mengambil data dari database dan mengisi tabel
    public static DefaultTableModel fetchDataTabelBuku() {

        // Membuat model tabel default untuk menyimpan data yang diambil
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Title");
        model.addColumn("Author");
        model.addColumn("Pages");
        model.addColumn("Publication Date");

        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            String selectQuery = "SELECT * FROM buku";
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                int pages = resultSet.getInt("pages");
                Date publicationDate = resultSet.getDate("publication_date");

                model.addRow(new Object[]{id, title, author, pages, publicationDate});
            }

            System.out.println("Data diambil dari database dan diisi ke dalam tabel dengan sukses.");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return model;
    }

    // Metode untuk menyimpan perubahan ke database
    public static void updateBookData(String id, String title, String author, int pages, Date publicationDate) {

        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            java.util.Date utilDate = publicationDate; // Mendapatkan java.util.Date
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime()); // Konversi ke java.sql.Date

            String updateQuery = "UPDATE buku SET title = ?, author = ?, pages = ?, publication_date = ? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, author);
            preparedStatement.setInt(3, pages);
            preparedStatement.setDate(4, sqlDate);
            preparedStatement.setString(5, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method untuk menghapus buku dari database
    public static void deleteBook(String id) {

        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            String deleteQuery = "DELETE FROM buku WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method untuk mendaftarkan pengguna baru
    public static boolean registerUser(String username, String password, String nama, String alamat, Date tanggal_lahir, String kontak) {
        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            // Periksa apakah username sudah digunakan
            String checkQuery = "SELECT * FROM member WHERE username = ?";
            PreparedStatement checkStatement = connection.prepareStatement(checkQuery);
            checkStatement.setString(1, username);
            ResultSet resultSet = checkStatement.executeQuery();

            // Jika username sudah ada, kembalikan false
            if (resultSet.next()) {
                System.out.println("Username sudah digunakan.");
                return false;
            }
            
            java.util.Date utilDate = tanggal_lahir; // Mendapatkan java.util.Date
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime()); // Konversi ke java.sql.Date

            // Jika username belum digunakan, lakukan pendaftaran
            String insertQuery = "INSERT INTO member (username, password, nama, alamat, tanggal_lahir, kontak) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
            insertStatement.setString(1, username);
            insertStatement.setString(2, password);
            insertStatement.setString(3, nama);
            insertStatement.setString(4, alamat);
            insertStatement.setDate(5, sqlDate);
            insertStatement.setString(6, kontak);
            insertStatement.executeUpdate();
            System.out.println("Anggota berhasil terdaftar.");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Sign In
    public static boolean signIn(String username, String password) {
        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            // Query untuk memeriksa apakah pengguna ada di database
            String query = "SELECT * FROM member WHERE username = ? AND password = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();

            // Jika pengguna ditemukan, update status sign in ke "true"
            if (resultSet.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Jika pengguna tidak ditemukan, kembalikan false
        return false;
    }

    // Sign Out
    public static void signOut(String username) {
        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            // Update status sign in ke "false"
            String updateQuery = "UPDATE member SET signed_in = false WHERE username = ?";
            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
            updateStatement.setString(1, username);
            updateStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
