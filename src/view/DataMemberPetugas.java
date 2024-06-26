    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Date;
import javax.swing.JOptionPane;
import model.Member;
import model.PengurusPerpus;
import model.User;

/**
 *
 * @author delll
 */
public class DataMemberPetugas extends javax.swing.JPanel {

    /**
     * Creates new form DataMemberPetugas
     */
     User user;

    public DataMemberPetugas(PengurusPerpus p) {
        user = p;
        initComponents();
        jTable1.setModel(p.lihatDataAnggota());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Tambah = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Rakha Sigma", "19-03-2004", "0812345678"},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Member", "Tanggal Lahir", "No. Telepon"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        Tambah.setText("Tambah");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });

        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });

        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(488, 488, 488)
                .addComponent(Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1025, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 282, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
        PengurusPerpus p = (PengurusPerpus) user;
        new TambahDataMember(null, true, p, null).setVisible(true);
        jTable1.setModel(p.lihatDataAnggota());
    }//GEN-LAST:event_TambahActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            String username = (String) jTable1.getValueAt(selectedRow, 0);
            String password = (String) jTable1.getValueAt(selectedRow, 1);
            String nama = (String) jTable1.getValueAt(selectedRow, 3);
            String alamat = (String) jTable1.getValueAt(selectedRow, 4);
            Date tanggalLahir = (Date) jTable1.getValueAt(selectedRow, 5);
            String noHp = (String) jTable1.getValueAt(selectedRow, 6);
            
            Member member = new Member(username, password, alamat, nama,  noHp, tanggalLahir );

            new EditDataMember(null, true, user, member).show();
            PengurusPerpus p = (PengurusPerpus) user;
            jTable1.setModel(p.lihatDataAnggota());
        } else {
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin diubah.");
        }
    }//GEN-LAST:event_EditActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        PengurusPerpus p = (PengurusPerpus) user;
        jTable1.setModel(p.lihatDataAnggota());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        
        if (selectedRow != -1){
            int input = javax.swing.JOptionPane.showOptionDialog(null, "Apakah anda yakin ingin menghapus akun member ini ini?", "Message", javax.swing.JOptionPane.OK_CANCEL_OPTION, javax.swing.JOptionPane.INFORMATION_MESSAGE, null, null, null);
            if(input == javax.swing.JOptionPane.OK_OPTION){
                String username = (String) jTable1.getValueAt(selectedRow, 0);
                PengurusPerpus pengurus = (PengurusPerpus) user;
                if (pengurus.hapusDataMember(username)){
                    JOptionPane.showMessageDialog(this, "Akun Member berhasil dihapus.");
                    jTable1.setModel(pengurus.lihatDataAnggota());
                } else {
                   JOptionPane.showMessageDialog(this, "Akun Member gagal dihapus."); 
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus.");
        }
    }//GEN-LAST:event_HapusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Edit;
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Tambah;
    private javax.swing.JButton jButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
