package view;


import java.awt.Color;
import service.DatabaseConnection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zidan
 */
public class from_login extends javax.swing.JFrame {
    int xx, xy;
    /**
     * Creates new form from_login
     */
    public from_login() {
        initComponents();
        setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_kiri = new custom.Custom_JPanelRounded();
        jLabel3 = new javax.swing.JLabel();
        loginButton = new custom.Custom_ButonRounded();
        usernameTextField = new custom.Custom_TextField();
        passwordField = new custom.Custom_PasswordField();
        custom_ButonRounded2 = new custom.Custom_ButonRounded();
        pn_kanan = new custom.Custom_JPanelRounded();
        tombol_close = new javax.swing.JLabel();
        gambar = new javax.swing.JLabel();

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
        jLabel3.setText(" Welcome ");
        pn_kiri.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 64, -1, -1));

        loginButton.setBackground(new java.awt.Color(0, 153, 204));
        loginButton.setBorder(null);
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("LOGIN");
        loginButton.setBorderColor(new java.awt.Color(0, 153, 204));
        loginButton.setBorderPainted(false);
        loginButton.setColor(new java.awt.Color(0, 153, 204));
        loginButton.setColorClick(new java.awt.Color(0, 102, 153));
        loginButton.setColorOver(new java.awt.Color(0, 153, 204));
        loginButton.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        loginButton.setRadius(10);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        pn_kiri.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 220, 40));

        usernameTextField.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        usernameTextField.setLabelText("Username");
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });
        pn_kiri.add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 220, -1));

        passwordField.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        passwordField.setLabelText("Password");
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        pn_kiri.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 220, -1));

        custom_ButonRounded2.setForeground(new java.awt.Color(255, 255, 255));
        custom_ButonRounded2.setText("DAFTAR");
        custom_ButonRounded2.setBorderColor(new java.awt.Color(0, 153, 204));
        custom_ButonRounded2.setColor(new java.awt.Color(0, 153, 204));
        custom_ButonRounded2.setColorClick(new java.awt.Color(0, 102, 153));
        custom_ButonRounded2.setColorOver(new java.awt.Color(0, 153, 204));
        custom_ButonRounded2.setRadius(10);
        custom_ButonRounded2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custom_ButonRounded2ActionPerformed(evt);
            }
        });
        pn_kiri.add(custom_ButonRounded2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 220, 40));

        getContentPane().add(pn_kiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 400));

        pn_kanan.setBackground(new java.awt.Color(255, 255, 255));
        pn_kanan.setRoundBottomRight(50);
        pn_kanan.setRoundTopRight(50);

        tombol_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8_close_30px.png"))); // NOI18N
        tombol_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombol_closeMouseClicked(evt);
            }
        });

        gambar.setBackground(new java.awt.Color(255, 255, 255));
        gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/gambarLogin.jpg"))); // NOI18N

        javax.swing.GroupLayout pn_kananLayout = new javax.swing.GroupLayout(pn_kanan);
        pn_kanan.setLayout(pn_kananLayout);
        pn_kananLayout.setHorizontalGroup(
            pn_kananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kananLayout.createSequentialGroup()
                .addGroup(pn_kananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_kananLayout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(tombol_close))
                    .addGroup(pn_kananLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gambar)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pn_kananLayout.setVerticalGroup(
            pn_kananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kananLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tombol_close)
                .addGap(44, 44, 44)
                .addComponent(gambar)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        getContentPane().add(pn_kanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 330, 400));

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
                  
    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        String username = usernameTextField.getText();
        String password = new String(passwordField.getPassword());
        // Perform sign in process here
        DatabaseConnection.signIn(username, password);
    }//GEN-LAST:event_loginButtonActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void custom_ButonRounded2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custom_ButonRounded2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custom_ButonRounded2ActionPerformed

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
            java.util.logging.Logger.getLogger(from_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(from_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(from_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(from_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new from_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private custom.Custom_ButonRounded custom_ButonRounded2;
    private javax.swing.JLabel gambar;
    private javax.swing.JLabel jLabel3;
    private custom.Custom_ButonRounded loginButton;
    private custom.Custom_PasswordField passwordField;
    private custom.Custom_JPanelRounded pn_kanan;
    private custom.Custom_JPanelRounded pn_kiri;
    private javax.swing.JLabel tombol_close;
    private custom.Custom_TextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
