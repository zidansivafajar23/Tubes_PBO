/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import model.Buku;
import model.Member;

/**
 *
 * @author zidan
 */
public class DetailBuku extends javax.swing.JDialog {

    /**
     * Creates new form DetailBuku
     */
    public DetailBuku(java.awt.Frame parent, boolean modal, Buku buku, Member akun) {
        super(parent, modal);
        initComponents();
        this.buku = buku;
        setDetailBuku();
        this.akun = akun;
    }
    Buku buku;
    Member akun;
    
    public void setDetailBuku(){
        id.setText(buku.getId_buku());
        judul.setText(buku.getJudul());
        penulis.setText(buku.getPenulis());
        tahunTerbit.setText(buku.getTahunTerbit());
        penerbit.setText(buku.getPenerbit());
        stok.setText(buku.getStock());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lb_id_buku = new javax.swing.JLabel();
        lb_nama = new javax.swing.JLabel();
        lb_penulis = new javax.swing.JLabel();
        lb_tahun_terbit = new javax.swing.JLabel();
        lb_penerbit = new javax.swing.JLabel();
        lb_stok = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        judul = new javax.swing.JLabel();
        penulis = new javax.swing.JLabel();
        tahunTerbit = new javax.swing.JLabel();
        penerbit = new javax.swing.JLabel();
        stok = new javax.swing.JLabel();
        pinjamBuku = new javax.swing.JButton();
        Close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Detail Buku");

        lb_id_buku.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_id_buku.setText("ID Buku :");

        lb_nama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_nama.setText("Judul :");

        lb_penulis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_penulis.setText("Penulis :");

        lb_tahun_terbit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_tahun_terbit.setText("Tahun Terbit :");

        lb_penerbit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_penerbit.setText("Penerbit :");

        lb_stok.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_stok.setText("Stok Buku :");

        id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        id.setText("----");

        judul.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        judul.setText("----");

        penulis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        penulis.setText("----");

        tahunTerbit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tahunTerbit.setText("----");

        penerbit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        penerbit.setText("----");

        stok.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        stok.setText("----");

        pinjamBuku.setText("Pinjam Buku");
        pinjamBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinjamBukuActionPerformed(evt);
            }
        });

        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_tahun_terbit)
                            .addComponent(lb_id_buku, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_nama, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_penulis, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_penerbit, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_stok, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(177, 177, 177)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(id)
                            .addComponent(judul)
                            .addComponent(penulis)
                            .addComponent(tahunTerbit)
                            .addComponent(penerbit)
                            .addComponent(stok)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(pinjamBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(278, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_id_buku)
                    .addComponent(id))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nama)
                    .addComponent(judul))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_penulis)
                    .addComponent(penulis))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_tahun_terbit)
                    .addComponent(tahunTerbit))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_penerbit)
                    .addComponent(penerbit))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_stok)
                    .addComponent(stok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pinjamBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pinjamBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinjamBukuActionPerformed
       int input = javax.swing.JOptionPane.showOptionDialog(null, "Apakah anda yakin ingin meminjam buku ini?", "Message", javax.swing.JOptionPane.OK_CANCEL_OPTION, javax.swing.JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if(input == javax.swing.JOptionPane.OK_OPTION){
                akun.tambahDataPeminjaman(buku);
                JOptionPane.showMessageDialog(this, "Buku berhasil dipinjam.");
                this.dispose();
            }
    }//GEN-LAST:event_pinjamBukuActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_CloseActionPerformed

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
            java.util.logging.Logger.getLogger(DetailBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DetailBuku dialog = new DetailBuku(new javax.swing.JFrame(), true,null,null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel lb_id_buku;
    private javax.swing.JLabel lb_nama;
    private javax.swing.JLabel lb_penerbit;
    private javax.swing.JLabel lb_penulis;
    private javax.swing.JLabel lb_stok;
    private javax.swing.JLabel lb_tahun_terbit;
    private javax.swing.JLabel penerbit;
    private javax.swing.JLabel penulis;
    private javax.swing.JButton pinjamBuku;
    private javax.swing.JLabel stok;
    private javax.swing.JLabel tahunTerbit;
    // End of variables declaration//GEN-END:variables
}
