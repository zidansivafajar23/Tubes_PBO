/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author zidan
 */
public class DashboardMember extends javax.swing.JPanel {

    /**
     * Creates new form DashboardMember
     */
    public DashboardMember() {
        initComponents();
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
        card_dataBuku = new custom.Custom_JPanelRounded();
        lb_dataBuku = new javax.swing.JLabel();
        lb_icon = new javax.swing.JLabel();
        card_daftarPinjaman = new custom.Custom_JPanelRounded();
        lb_daftarPinjaman = new javax.swing.JLabel();
        lb_icon4 = new javax.swing.JLabel();
        card_akun = new custom.Custom_JPanelRounded();
        lb_akun = new javax.swing.JLabel();
        lb_icon1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        card_dataBuku.setBackground(new java.awt.Color(0, 153, 204));
        card_dataBuku.setRoundBottomLeft(30);
        card_dataBuku.setRoundBottomRight(30);
        card_dataBuku.setRoundTopLeft(30);
        card_dataBuku.setRoundTopRight(30);

        lb_dataBuku.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lb_dataBuku.setForeground(new java.awt.Color(255, 255, 255));
        lb_dataBuku.setText("DATA BUKU");

        lb_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8_book_70px.png"))); // NOI18N

        javax.swing.GroupLayout card_dataBukuLayout = new javax.swing.GroupLayout(card_dataBuku);
        card_dataBuku.setLayout(card_dataBukuLayout);
        card_dataBukuLayout.setHorizontalGroup(
            card_dataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_dataBukuLayout.createSequentialGroup()
                .addGroup(card_dataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card_dataBukuLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(lb_icon))
                    .addGroup(card_dataBukuLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(lb_dataBuku)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        card_dataBukuLayout.setVerticalGroup(
            card_dataBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_dataBukuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_dataBuku)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        card_daftarPinjaman.setBackground(new java.awt.Color(0, 153, 204));
        card_daftarPinjaman.setPreferredSize(new java.awt.Dimension(310, 150));
        card_daftarPinjaman.setRoundBottomLeft(30);
        card_daftarPinjaman.setRoundBottomRight(30);
        card_daftarPinjaman.setRoundTopLeft(30);
        card_daftarPinjaman.setRoundTopRight(30);

        lb_daftarPinjaman.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lb_daftarPinjaman.setForeground(new java.awt.Color(255, 255, 255));
        lb_daftarPinjaman.setText("DAFTAR PINJAMAN");

        lb_icon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8_list_70px.png"))); // NOI18N

        javax.swing.GroupLayout card_daftarPinjamanLayout = new javax.swing.GroupLayout(card_daftarPinjaman);
        card_daftarPinjaman.setLayout(card_daftarPinjamanLayout);
        card_daftarPinjamanLayout.setHorizontalGroup(
            card_daftarPinjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_daftarPinjamanLayout.createSequentialGroup()
                .addGroup(card_daftarPinjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card_daftarPinjamanLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lb_daftarPinjaman))
                    .addGroup(card_daftarPinjamanLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(lb_icon4)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        card_daftarPinjamanLayout.setVerticalGroup(
            card_daftarPinjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_daftarPinjamanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_daftarPinjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_icon4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        card_akun.setBackground(new java.awt.Color(0, 153, 204));
        card_akun.setPreferredSize(new java.awt.Dimension(310, 150));
        card_akun.setRoundBottomLeft(30);
        card_akun.setRoundBottomRight(30);
        card_akun.setRoundTopLeft(30);
        card_akun.setRoundTopRight(30);

        lb_akun.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lb_akun.setForeground(new java.awt.Color(255, 255, 255));
        lb_akun.setText("AKUN");

        lb_icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8_person_70px.png"))); // NOI18N

        javax.swing.GroupLayout card_akunLayout = new javax.swing.GroupLayout(card_akun);
        card_akun.setLayout(card_akunLayout);
        card_akunLayout.setHorizontalGroup(
            card_akunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_akunLayout.createSequentialGroup()
                .addGroup(card_akunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card_akunLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(lb_akun))
                    .addGroup(card_akunLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(lb_icon1)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        card_akunLayout.setVerticalGroup(
            card_akunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_akunLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_akun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_icon1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Daftar Peminjaman Buku");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(card_dataBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(card_daftarPinjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(card_akun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(card_akun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card_daftarPinjaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card_dataBuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private custom.Custom_JPanelRounded card_akun;
    private custom.Custom_JPanelRounded card_daftarPinjaman;
    private custom.Custom_JPanelRounded card_dataBuku;
    private custom.Custom_JPanelRounded card_dataBuku2;
    private custom.Custom_JPanelRounded card_dataBuku3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lb_akun;
    private javax.swing.JLabel lb_daftarPinjaman;
    private javax.swing.JLabel lb_dataBuku;
    private javax.swing.JLabel lb_dataBuku2;
    private javax.swing.JLabel lb_dataBuku3;
    private javax.swing.JLabel lb_icon;
    private javax.swing.JLabel lb_icon1;
    private javax.swing.JLabel lb_icon2;
    private javax.swing.JLabel lb_icon3;
    private javax.swing.JLabel lb_icon4;
    // End of variables declaration//GEN-END:variables
}
