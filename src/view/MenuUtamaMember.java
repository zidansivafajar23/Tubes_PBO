/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Member;
import view.DashboardMember;

/**
 *
 * @author zidan
 */
public class MenuUtamaMember extends javax.swing.JFrame {

    int xx, xy;
    Member member;
    
    public MenuUtamaMember(Member user) {
        member = user;
        initComponents();
        pn_content.removeAll();
        pn_content.add(new DashboardMember(member));
        pn_content.repaint();
        pn_content.revalidate();
    }
    
    public void setTampilanMenu(String namaMenu) throws SQLException{
        if (namaMenu == "menu1"){
            pn_content.removeAll();
            pn_content.add(new DashboardMember(member));
            pn_content.repaint();
            pn_content.revalidate();
        } else if (namaMenu == "menu2"){
            pn_content.removeAll();
            pn_content.add(new DataBukuMember(member));
            pn_content.repaint();
            pn_content.revalidate();
        } else if (namaMenu == "menu3"){
            pn_content.removeAll();
            pn_content.add(new DaftarPinjamanMember(member));
            pn_content.repaint();
            pn_content.revalidate();
        } else if (namaMenu == "menu4"){
            pn_content.removeAll();
            pn_content.add(new DetailMember(member));
            pn_content.repaint();
            pn_content.revalidate();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_sidebar = new javax.swing.JPanel();
        gambarLogo = new javax.swing.JLabel();
        Perpusku = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        menu1 = new javax.swing.JPanel();
        pn_line1 = new javax.swing.JPanel();
        lb_icon = new javax.swing.JLabel();
        lb_Dashboard = new javax.swing.JLabel();
        menu2 = new javax.swing.JPanel();
        pn_line2 = new javax.swing.JPanel();
        lb_icon1 = new javax.swing.JLabel();
        lb_Dashboard1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        menu3 = new javax.swing.JPanel();
        pn_line3 = new javax.swing.JPanel();
        lb_icon2 = new javax.swing.JLabel();
        lb_Dashboard2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        menu4 = new javax.swing.JPanel();
        pn_line4 = new javax.swing.JPanel();
        lb_icon3 = new javax.swing.JLabel();
        lb_Dashboard3 = new javax.swing.JLabel();
        pn_kanan = new javax.swing.JPanel();
        pn_navbar = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pn_content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        pn_sidebar.setBackground(new java.awt.Color(255, 255, 255));
        pn_sidebar.setPreferredSize(new java.awt.Dimension(300, 768));

        gambarLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logoPerpusku_resize.jpg"))); // NOI18N

        Perpusku.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Perpusku.setForeground(new java.awt.Color(0, 153, 204));
        Perpusku.setText("Perpusku");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("TANSAKSI");

        menu1.setBackground(new java.awt.Color(255, 255, 255));
        menu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu1MouseExited(evt);
            }
        });

        pn_line1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line1Layout = new javax.swing.GroupLayout(pn_line1);
        pn_line1.setLayout(pn_line1Layout);
        pn_line1Layout.setHorizontalGroup(
            pn_line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pn_line1Layout.setVerticalGroup(
            pn_line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lb_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8_monitor_30px_3.png"))); // NOI18N

        lb_Dashboard.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lb_Dashboard.setText("Dashboard");

        javax.swing.GroupLayout menu1Layout = new javax.swing.GroupLayout(menu1);
        menu1.setLayout(menu1Layout);
        menu1Layout.setHorizontalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addComponent(pn_line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        menu1Layout.setVerticalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_line1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menu1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_icon)
                    .addComponent(lb_Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu2.setBackground(new java.awt.Color(255, 255, 255));
        menu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu2MouseExited(evt);
            }
        });

        pn_line2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line2Layout = new javax.swing.GroupLayout(pn_line2);
        pn_line2.setLayout(pn_line2Layout);
        pn_line2Layout.setHorizontalGroup(
            pn_line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pn_line2Layout.setVerticalGroup(
            pn_line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lb_icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8_book_30px_2.png"))); // NOI18N

        lb_Dashboard1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lb_Dashboard1.setText("Buku");

        javax.swing.GroupLayout menu2Layout = new javax.swing.GroupLayout(menu2);
        menu2.setLayout(menu2Layout);
        menu2Layout.setHorizontalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu2Layout.createSequentialGroup()
                .addComponent(pn_line2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_icon1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_Dashboard1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        menu2Layout.setVerticalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_line2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menu2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_icon1)
                    .addComponent(lb_Dashboard1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("MASTER DATA ");

        menu3.setBackground(new java.awt.Color(255, 255, 255));
        menu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu3MouseExited(evt);
            }
        });

        pn_line3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line3Layout = new javax.swing.GroupLayout(pn_line3);
        pn_line3.setLayout(pn_line3Layout);
        pn_line3Layout.setHorizontalGroup(
            pn_line3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pn_line3Layout.setVerticalGroup(
            pn_line3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lb_icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8_Books_30px.png"))); // NOI18N

        lb_Dashboard2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lb_Dashboard2.setText("Daftar Pinjaman");

        javax.swing.GroupLayout menu3Layout = new javax.swing.GroupLayout(menu3);
        menu3.setLayout(menu3Layout);
        menu3Layout.setHorizontalGroup(
            menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu3Layout.createSequentialGroup()
                .addComponent(pn_line3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_icon2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_Dashboard2, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        menu3Layout.setVerticalGroup(
            menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_line3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menu3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_icon2)
                    .addComponent(lb_Dashboard2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("LAINNYA");

        menu4.setBackground(new java.awt.Color(255, 255, 255));
        menu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu4MouseExited(evt);
            }
        });

        pn_line4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line4Layout = new javax.swing.GroupLayout(pn_line4);
        pn_line4.setLayout(pn_line4Layout);
        pn_line4Layout.setHorizontalGroup(
            pn_line4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pn_line4Layout.setVerticalGroup(
            pn_line4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lb_icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8_person_30px_1.png"))); // NOI18N

        lb_Dashboard3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lb_Dashboard3.setText("Akun");

        javax.swing.GroupLayout menu4Layout = new javax.swing.GroupLayout(menu4);
        menu4.setLayout(menu4Layout);
        menu4Layout.setHorizontalGroup(
            menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu4Layout.createSequentialGroup()
                .addComponent(pn_line4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_icon3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_Dashboard3, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        menu4Layout.setVerticalGroup(
            menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_line4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menu4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_icon3)
                    .addComponent(lb_Dashboard3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pn_sidebarLayout = new javax.swing.GroupLayout(pn_sidebar);
        pn_sidebar.setLayout(pn_sidebarLayout);
        pn_sidebarLayout.setHorizontalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_sidebarLayout.createSequentialGroup()
                        .addComponent(gambarLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Perpusku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pn_sidebarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(menu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        pn_sidebarLayout.setVerticalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gambarLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Perpusku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(275, Short.MAX_VALUE))
        );

        getContentPane().add(pn_sidebar, java.awt.BorderLayout.LINE_START);

        pn_kanan.setLayout(new java.awt.BorderLayout());

        pn_navbar.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout pn_navbarLayout = new javax.swing.GroupLayout(pn_navbar);
        pn_navbar.setLayout(pn_navbarLayout);
        pn_navbarLayout.setHorizontalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1066, Short.MAX_VALUE)
        );
        pn_navbarLayout.setVerticalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pn_kanan.add(pn_navbar, java.awt.BorderLayout.PAGE_START);

        pn_content.setBackground(new java.awt.Color(255, 255, 255));
        pn_content.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pn_kanan.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(pn_kanan, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu1MouseEntered
        menu1.setBackground(new Color(250,250,250));
        pn_line1.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_menu1MouseEntered

    private void menu1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu1MouseExited
        menu1.setBackground(new Color(255,255,255));
        pn_line1.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_menu1MouseExited

    private void menu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu1MouseClicked
        menu1.setBackground(new Color(240,240,240));
        pn_line1.setBackground(new Color(0,153,204));
        try {
            setTampilanMenu("menu1");
        } catch (SQLException ex) {
            Logger.getLogger(MenuUtamaMember.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menu1MouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void menu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2MouseClicked
        menu2.setBackground(new Color(240,240,240));
        pn_line2.setBackground(new Color(0,153,204));
        try {
            setTampilanMenu("menu2");
        } catch (SQLException ex) {
            Logger.getLogger(MenuUtamaMember.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menu2MouseClicked

    private void menu2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2MouseEntered
        menu2.setBackground(new Color(250,250,250));
        pn_line2.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_menu2MouseEntered

    private void menu2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2MouseExited
        menu2.setBackground(new Color(255,255,255));
        pn_line2.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_menu2MouseExited

    private void menu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu3MouseClicked
        menu3.setBackground(new Color(240,240,240));
        pn_line3.setBackground(new Color(0,153,204));
        try {
            setTampilanMenu("menu3");
        } catch (SQLException ex) {
            Logger.getLogger(MenuUtamaMember.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menu3MouseClicked

    private void menu3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu3MouseEntered
        menu3.setBackground(new Color(250,250,250));
        pn_line3.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_menu3MouseEntered

    private void menu3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu3MouseExited
        menu3.setBackground(new Color(255,255,255));
        pn_line3.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_menu3MouseExited

    private void menu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu4MouseClicked
        menu4.setBackground(new Color(240,240,240));
        pn_line4.setBackground(new Color(0,153,204));
        try {
            setTampilanMenu("menu4");
        } catch (SQLException ex) {
            Logger.getLogger(MenuUtamaMember.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menu4MouseClicked

    private void menu4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu4MouseEntered
        menu4.setBackground(new Color(250,250,250));
        pn_line4.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_menu4MouseEntered

    private void menu4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu4MouseExited
        menu4.setBackground(new Color(255,255,255));
        pn_line4.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_menu4MouseExited

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
            java.util.logging.Logger.getLogger(MenuUtamaMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtamaMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtamaMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtamaMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtamaMember(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Perpusku;
    private javax.swing.JLabel gambarLogo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_Dashboard;
    private javax.swing.JLabel lb_Dashboard1;
    private javax.swing.JLabel lb_Dashboard2;
    private javax.swing.JLabel lb_Dashboard3;
    private javax.swing.JLabel lb_icon;
    private javax.swing.JLabel lb_icon1;
    private javax.swing.JLabel lb_icon2;
    private javax.swing.JLabel lb_icon3;
    private javax.swing.JPanel menu1;
    private javax.swing.JPanel menu2;
    private javax.swing.JPanel menu3;
    private javax.swing.JPanel menu4;
    private javax.swing.JPanel pn_content;
    private javax.swing.JPanel pn_kanan;
    private javax.swing.JPanel pn_line1;
    private javax.swing.JPanel pn_line2;
    private javax.swing.JPanel pn_line3;
    private javax.swing.JPanel pn_line4;
    private javax.swing.JPanel pn_navbar;
    private javax.swing.JPanel pn_sidebar;
    // End of variables declaration//GEN-END:variables
}
