package view;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import service.DatabaseConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Member;
import model.User;
import service.Parsing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author zidan
 */
public class FormDaftar extends javax.swing.JFrame {

    int xx, xy;

    /**
     * Creates new form from_login
     */
    public FormDaftar() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
    }

    

    private void register(String username, String password, String name, String address, Date dob, String contact) {
        // Implementation of registration process
        try {
            Member member = new Member(username, password, address, name,  contact, dob );
            if(member.register()){
                JOptionPane.showMessageDialog(this, "Registration successful!");
                openFormLogin();
            } else {
                JOptionPane.showMessageDialog(this, "Registration successful!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Registration failed! Because " + e);
        }

    }

   

    private void openFormLogin() {
        FormLogin login = new FormLogin();
        login.setVisible(true);
        this.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        daftarButton = new custom.Custom_ButonRounded();
        pn_kiri = new custom.Custom_JPanelRounded();
        jLabel3 = new javax.swing.JLabel();
        noTelpTextField = new custom.Custom_TextField();
        passwordTextField = new custom.Custom_PasswordField();
        usernameTextField = new custom.Custom_TextField();
        namaTextField = new custom.Custom_TextField();
        alamatTextField = new custom.Custom_TextField();
        tanggalLahirTextField = new custom.Custom_TextField();
        kembaliButton = new custom.Custom_ButonRounded();
        daftarButton2 = new custom.Custom_ButonRounded();
        pn_kanan = new custom.Custom_JPanelRounded();
        tombol_close = new javax.swing.JLabel();
        gambar = new javax.swing.JLabel();

        daftarButton.setForeground(new java.awt.Color(255, 255, 255));
        daftarButton.setText("DAFTAR");
        daftarButton.setBorderColor(new java.awt.Color(0, 153, 204));
        daftarButton.setColor(new java.awt.Color(0, 153, 204));
        daftarButton.setColorClick(new java.awt.Color(0, 102, 153));
        daftarButton.setColorOver(new java.awt.Color(0, 153, 204));
        daftarButton.setRadius(10);
        daftarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarButtonActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_kiri.setBackground(new java.awt.Color(255, 255, 255));
        pn_kiri.setRoundBottomLeft(50);
        pn_kiri.setRoundTopLeft(50);
        pn_kiri.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel3.setText("Daftar");
        pn_kiri.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        noTelpTextField.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        noTelpTextField.setLabelText("No. Telepon");
        noTelpTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noTelpTextFieldActionPerformed(evt);
            }
        });
        pn_kiri.add(noTelpTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 220, -1));

        passwordTextField.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        passwordTextField.setLabelText("Password");
        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });
        pn_kiri.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 220, -1));

        usernameTextField.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        usernameTextField.setLabelText("Username");
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });
        pn_kiri.add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 220, -1));

        namaTextField.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        namaTextField.setLabelText("Nama");
        namaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaTextFieldActionPerformed(evt);
            }
        });
        pn_kiri.add(namaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 220, -1));

        alamatTextField.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        alamatTextField.setLabelText("Alamat");
        alamatTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatTextFieldActionPerformed(evt);
            }
        });
        pn_kiri.add(alamatTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 220, -1));

        tanggalLahirTextField.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        tanggalLahirTextField.setLabelText("Tanggal Lahir");
        tanggalLahirTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalLahirTextFieldActionPerformed(evt);
            }
        });
        pn_kiri.add(tanggalLahirTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 220, -1));

        kembaliButton.setForeground(new java.awt.Color(255, 255, 255));
        kembaliButton.setText("KEMBALI");
        kembaliButton.setBorderColor(new java.awt.Color(0, 153, 204));
        kembaliButton.setColor(new java.awt.Color(0, 153, 204));
        kembaliButton.setColorClick(new java.awt.Color(0, 102, 153));
        kembaliButton.setColorOver(new java.awt.Color(0, 153, 204));
        kembaliButton.setRadius(10);
        kembaliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliButtonActionPerformed(evt);
            }
        });
        pn_kiri.add(kembaliButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 220, 40));

        daftarButton2.setForeground(new java.awt.Color(255, 255, 255));
        daftarButton2.setText("DAFTAR");
        daftarButton2.setBorderColor(new java.awt.Color(0, 153, 204));
        daftarButton2.setColor(new java.awt.Color(0, 153, 204));
        daftarButton2.setColorClick(new java.awt.Color(0, 102, 153));
        daftarButton2.setColorOver(new java.awt.Color(0, 153, 204));
        daftarButton2.setRadius(10);
        daftarButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarButton2ActionPerformed(evt);
            }
        });
        pn_kiri.add(daftarButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 220, 40));

        getContentPane().add(pn_kiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 480));

        pn_kanan.setBackground(new java.awt.Color(255, 255, 255));
        pn_kanan.setRoundBottomRight(50);
        pn_kanan.setRoundTopRight(50);
        pn_kanan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tombol_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8_close_30px.png"))); // NOI18N
        tombol_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombol_closeMouseClicked(evt);
            }
        });
        pn_kanan.add(tombol_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 21, -1, -1));

        gambar.setBackground(new java.awt.Color(255, 255, 255));
        gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/gambarLogin.jpg"))); // NOI18N
        pn_kanan.add(gambar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 95, -1, -1));

        getContentPane().add(pn_kanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 330, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void tombol_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol_closeMouseClicked
        dispose();
    }//GEN-LAST:event_tombol_closeMouseClicked

    private void noTelpTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noTelpTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noTelpTextFieldActionPerformed

    private void daftarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_daftarButtonActionPerformed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void namaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaTextFieldActionPerformed

    private void alamatTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatTextFieldActionPerformed

    private void tanggalLahirTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalLahirTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalLahirTextFieldActionPerformed

    private void kembaliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliButtonActionPerformed
        // TODO add your handling code here:
        // Open registration form
        dispose(); // Close the current form
        openFormLogin();
    }//GEN-LAST:event_kembaliButtonActionPerformed

    private void daftarButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarButton2ActionPerformed
        // TODO add your handling code here:
        String username = usernameTextField.getText();
        String password = new String(passwordTextField.getPassword());
        String name = namaTextField.getText();
        String address = alamatTextField.getText();
        Date dob = Parsing.getDateFromString(tanggalLahirTextField.getText(), this);
        String contact = noTelpTextField.getText();
        // Perform registration process here
        register(username, password, name, address, dob, contact);
    }//GEN-LAST:event_daftarButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormDaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDaftar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private custom.Custom_TextField alamatTextField;
    private custom.Custom_ButonRounded daftarButton;
    private custom.Custom_ButonRounded daftarButton2;
    private javax.swing.JLabel gambar;
    private javax.swing.JLabel jLabel3;
    private custom.Custom_ButonRounded kembaliButton;
    private custom.Custom_TextField namaTextField;
    private custom.Custom_TextField noTelpTextField;
    private custom.Custom_PasswordField passwordTextField;
    private custom.Custom_JPanelRounded pn_kanan;
    private custom.Custom_JPanelRounded pn_kiri;
    private custom.Custom_TextField tanggalLahirTextField;
    private javax.swing.JLabel tombol_close;
    private custom.Custom_TextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
