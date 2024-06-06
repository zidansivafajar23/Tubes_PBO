/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import model.Buku;
import model.Member;

/**
 *
 * @author zidan
 */
public class DataBukuMember extends javax.swing.JPanel {

    /**
     * Creates new form DataBukuMember
     */
    public DataBukuMember(Member member) {
        initComponents();
        akun = member;
        daftarBuku = member.getDataBuku();
        jumlahBuku = daftarBuku.size();
        tampilkanBuku();
    }
    Member akun;
    int halaman = 1;
    ArrayList<Buku> daftarBuku;
    int jumlahBuku;
    
    
    public void pagination(String flag, int halaman){
        if(flag == "next" && jumlahBuku-8 > 0){
            this.halaman += 1;
            jumlahBuku-=8;
            tampilkanBuku();
            lb_halaman.setText(Integer.toString(this.halaman));
        } else if (flag == "prev" && halaman != 1 ) {
            this.halaman -= 1;
            jumlahBuku+=8;
            tampilkanBuku();
            lb_halaman.setText(Integer.toString(this.halaman));
        }
    }
    
    public void setVisibleTampilanBuku(){
        pn_book1.setVisible(false);
        pn_book2.setVisible(false);
        pn_book3.setVisible(false);
        pn_book4.setVisible(false);
        pn_book5.setVisible(false);
        pn_book6.setVisible(false);
        pn_book7.setVisible(false);
        pn_book8.setVisible(false);
    }
    
    public void tampilkanBuku(){
        int start = (halaman-1)*8;
        setVisibleTampilanBuku();
        String judulBuku;
        String penulisBuku;
        String idBuku;
        
        if (jumlahBuku > 0){
            pn_book1.setVisible(true);
            judulBuku = daftarBuku.get(start).getJudul();
            penulisBuku = daftarBuku.get(start).getPenulis();
            idBuku = daftarBuku.get(start).getId_buku();
            
            if (judulBuku.length() > 12){
                judul1.setText(judulBuku.substring(0, 11)+"...");
            } else {
                judul1.setText(judulBuku);
            }
            
            if (penulisBuku.length() > 12){
                penulis1.setText(penulisBuku.substring(0, 11)+"...");
            } else {
                penulis1.setText(penulisBuku);
            }
            
            id1.setText(idBuku);
            start++;
            
        }
        if (jumlahBuku > 1){
            pn_book2.setVisible(true);
            judulBuku = daftarBuku.get(start).getJudul();
            penulisBuku = daftarBuku.get(start).getPenulis();
            idBuku = daftarBuku.get(start).getId_buku();
            
            if (judulBuku.length() > 12){
                judul2.setText(judulBuku.substring(0, 11)+"...");
            } else {
                judul2.setText(judulBuku);
            }
            
            if (penulisBuku.length() > 12){
                penulis2.setText(penulisBuku.substring(0, 11)+"...");
            } else {
                penulis2.setText(penulisBuku);
            }
            
            id2.setText(idBuku);
            start++;
        }
        if (jumlahBuku > 2){
            pn_book3.setVisible(true);
            judulBuku = daftarBuku.get(start).getJudul();
            penulisBuku = daftarBuku.get(start).getPenulis();
            idBuku = daftarBuku.get(start).getId_buku();
            
            if (judulBuku.length() > 12){
                judul3.setText(judulBuku.substring(0, 11)+"...");
            } else {
                judul3.setText(judulBuku);
            }
            
            if (penulisBuku.length() > 12){
                penulis3.setText(penulisBuku.substring(0, 11)+"...");
            } else {
                penulis3.setText(penulisBuku);
            }
            
            id3.setText(idBuku);
            start++;
        }
        if (jumlahBuku > 3){
            pn_book4.setVisible(true);
            judulBuku = daftarBuku.get(start).getJudul();
            penulisBuku = daftarBuku.get(start).getPenulis();
            idBuku = daftarBuku.get(start).getId_buku();
            
            if (judulBuku.length() > 12){
                judul4.setText(judulBuku.substring(0, 11)+"...");
            } else {
                judul4.setText(judulBuku);
            }
            
            if (penulisBuku.length() > 12){
                penulis4.setText(penulisBuku.substring(0, 11)+"...");
            } else {
                penulis4.setText(penulisBuku);
            }
            
            id4.setText(idBuku);
            start++;
        }
        if (jumlahBuku > 4){
            pn_book5.setVisible(true);
            judulBuku = daftarBuku.get(start).getJudul();
            penulisBuku = daftarBuku.get(start).getPenulis();
            idBuku = daftarBuku.get(start).getId_buku();
            
            if (judulBuku.length() > 12){
                judul5.setText(judulBuku.substring(0, 11)+"...");
            } else {
                judul5.setText(judulBuku);
            }
            
            if (penulisBuku.length() > 12){
                penulis5.setText(penulisBuku.substring(0, 11)+"...");
            } else {
                penulis5.setText(penulisBuku);
            }
            
            id5.setText(idBuku);
            start++;
        }
        if (jumlahBuku > 5){
            pn_book6.setVisible(true);
            judulBuku = daftarBuku.get(start).getJudul();
            penulisBuku = daftarBuku.get(start).getPenulis();
            idBuku = daftarBuku.get(start).getId_buku();
            
            if (judulBuku.length() > 12){
                judul6.setText(judulBuku.substring(0, 11)+"...");
            } else {
                judul6.setText(judulBuku);
            }
            
            if (penulisBuku.length() > 12){
                penulis6.setText(penulisBuku.substring(0, 11)+"...");
            } else {
                penulis6.setText(penulisBuku);
            }
            
            id6.setText(idBuku);
            start++;
        }
        if (jumlahBuku > 6){
            pn_book7.setVisible(true);
            judulBuku = daftarBuku.get(start).getJudul();
            penulisBuku = daftarBuku.get(start).getPenulis();
            idBuku = daftarBuku.get(start).getId_buku();
            
            if (judulBuku.length() > 12){
                judul7.setText(judulBuku.substring(0, 11)+"...");
            } else {
                judul7.setText(judulBuku);
            }
            
            if (penulisBuku.length() > 12){
                penulis7.setText(penulisBuku.substring(0, 11)+"...");
            } else {
                penulis7.setText(penulisBuku);
            }
            
            id7.setText(idBuku);
            start++;
        }
        if (jumlahBuku > 7){
            pn_book8.setVisible(true);
            judulBuku = daftarBuku.get(start).getJudul();
            penulisBuku = daftarBuku.get(start).getPenulis();
            idBuku = daftarBuku.get(start).getId_buku();
            
            if (judulBuku.length() > 12){
                judul8.setText(judulBuku.substring(0, 11)+"...");
            } else {
                judul8.setText(judulBuku);
            }
            
            if (penulisBuku.length() > 12){
                penulis8.setText(penulisBuku.substring(0, 11)+"...");
            } else {
                penulis8.setText(penulisBuku);
            }
            
            id8.setText(idBuku);
            start++;
        }
    }
    
    public Buku cariBukuById(ArrayList<Buku> daftarBuku, String idBuku){
        for (Buku buku : daftarBuku){
            if(buku.getId_buku() == idBuku){
                return buku;
            }
        }
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_background = new javax.swing.JPanel();
        pn_book1 = new custom.Custom_JPanelRounded();
        judul1 = new javax.swing.JLabel();
        penulis1 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        pn_book2 = new custom.Custom_JPanelRounded();
        judul2 = new javax.swing.JLabel();
        penulis2 = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        pn_book3 = new custom.Custom_JPanelRounded();
        judul3 = new javax.swing.JLabel();
        penulis3 = new javax.swing.JLabel();
        id3 = new javax.swing.JLabel();
        pn_book8 = new custom.Custom_JPanelRounded();
        judul8 = new javax.swing.JLabel();
        penulis8 = new javax.swing.JLabel();
        id8 = new javax.swing.JLabel();
        pn_book5 = new custom.Custom_JPanelRounded();
        judul5 = new javax.swing.JLabel();
        penulis5 = new javax.swing.JLabel();
        id5 = new javax.swing.JLabel();
        pn_book4 = new custom.Custom_JPanelRounded();
        judul4 = new javax.swing.JLabel();
        penulis4 = new javax.swing.JLabel();
        id4 = new javax.swing.JLabel();
        pn_book6 = new custom.Custom_JPanelRounded();
        judul6 = new javax.swing.JLabel();
        penulis6 = new javax.swing.JLabel();
        id6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pn_book7 = new custom.Custom_JPanelRounded();
        judul7 = new javax.swing.JLabel();
        penulis7 = new javax.swing.JLabel();
        id7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lb_halaman = new javax.swing.JLabel();
        btm_next = new javax.swing.JLabel();
        btn_prev = new javax.swing.JLabel();

        pn_background.setBackground(new java.awt.Color(255, 255, 255));

        pn_book1.setBackground(new java.awt.Color(0, 153, 204));
        pn_book1.setRoundBottomLeft(10);
        pn_book1.setRoundBottomRight(10);
        pn_book1.setRoundTopLeft(10);
        pn_book1.setRoundTopRight(10);
        pn_book1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_book1MouseClicked(evt);
            }
        });

        judul1.setForeground(new java.awt.Color(255, 255, 255));
        judul1.setText("jLabel1");

        penulis1.setForeground(new java.awt.Color(255, 255, 255));
        penulis1.setText("jLabel2");

        id1.setForeground(new java.awt.Color(0, 153, 204));
        id1.setText("jLabel1");

        javax.swing.GroupLayout pn_book1Layout = new javax.swing.GroupLayout(pn_book1);
        pn_book1.setLayout(pn_book1Layout);
        pn_book1Layout.setHorizontalGroup(
            pn_book1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_book1Layout.createSequentialGroup()
                .addGroup(pn_book1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_book1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(id1))
                    .addGroup(pn_book1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(pn_book1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(penulis1)
                            .addComponent(judul1))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        pn_book1Layout.setVerticalGroup(
            pn_book1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_book1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(judul1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(id1)
                .addGap(44, 44, 44)
                .addComponent(penulis1)
                .addGap(21, 21, 21))
        );

        pn_book2.setBackground(new java.awt.Color(0, 153, 204));
        pn_book2.setRoundBottomLeft(10);
        pn_book2.setRoundBottomRight(10);
        pn_book2.setRoundTopLeft(10);
        pn_book2.setRoundTopRight(10);
        pn_book2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_book2MouseClicked(evt);
            }
        });

        judul2.setBackground(new java.awt.Color(255, 255, 255));
        judul2.setForeground(new java.awt.Color(255, 255, 255));
        judul2.setText("jLabel3");

        penulis2.setForeground(new java.awt.Color(255, 255, 255));
        penulis2.setText("jLabel4");

        id2.setForeground(new java.awt.Color(0, 153, 204));
        id2.setText("jLabel1");

        javax.swing.GroupLayout pn_book2Layout = new javax.swing.GroupLayout(pn_book2);
        pn_book2.setLayout(pn_book2Layout);
        pn_book2Layout.setHorizontalGroup(
            pn_book2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_book2Layout.createSequentialGroup()
                .addGroup(pn_book2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_book2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(id2))
                    .addGroup(pn_book2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(pn_book2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(penulis2)
                            .addComponent(judul2))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        pn_book2Layout.setVerticalGroup(
            pn_book2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_book2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(judul2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(id2)
                .addGap(40, 40, 40)
                .addComponent(penulis2)
                .addGap(27, 27, 27))
        );

        pn_book3.setBackground(new java.awt.Color(0, 153, 204));
        pn_book3.setRoundBottomLeft(10);
        pn_book3.setRoundBottomRight(10);
        pn_book3.setRoundTopLeft(10);
        pn_book3.setRoundTopRight(10);
        pn_book3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_book3MouseClicked(evt);
            }
        });

        judul3.setForeground(new java.awt.Color(255, 255, 255));
        judul3.setText("jLabel5");

        penulis3.setForeground(new java.awt.Color(255, 255, 255));
        penulis3.setText("jLabel6");

        id3.setForeground(new java.awt.Color(0, 153, 204));
        id3.setText("jLabel1");

        javax.swing.GroupLayout pn_book3Layout = new javax.swing.GroupLayout(pn_book3);
        pn_book3.setLayout(pn_book3Layout);
        pn_book3Layout.setHorizontalGroup(
            pn_book3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_book3Layout.createSequentialGroup()
                .addGroup(pn_book3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_book3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(id3))
                    .addGroup(pn_book3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pn_book3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(judul3)
                            .addComponent(penulis3))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        pn_book3Layout.setVerticalGroup(
            pn_book3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_book3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(judul3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(id3)
                .addGap(39, 39, 39)
                .addComponent(penulis3)
                .addGap(30, 30, 30))
        );

        pn_book8.setBackground(new java.awt.Color(0, 153, 204));
        pn_book8.setRoundBottomLeft(10);
        pn_book8.setRoundBottomRight(10);
        pn_book8.setRoundTopLeft(10);
        pn_book8.setRoundTopRight(10);
        pn_book8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_book8MouseClicked(evt);
            }
        });

        judul8.setForeground(new java.awt.Color(255, 255, 255));
        judul8.setText("jLabel9");

        penulis8.setForeground(new java.awt.Color(255, 255, 255));
        penulis8.setText("jLabel10");

        id8.setForeground(new java.awt.Color(0, 153, 204));
        id8.setText("jLabel1");

        javax.swing.GroupLayout pn_book8Layout = new javax.swing.GroupLayout(pn_book8);
        pn_book8.setLayout(pn_book8Layout);
        pn_book8Layout.setHorizontalGroup(
            pn_book8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_book8Layout.createSequentialGroup()
                .addGroup(pn_book8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_book8Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(id8))
                    .addGroup(pn_book8Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(penulis8))
                    .addGroup(pn_book8Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(judul8)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        pn_book8Layout.setVerticalGroup(
            pn_book8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_book8Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(judul8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(id8)
                .addGap(42, 42, 42)
                .addComponent(penulis8)
                .addGap(24, 24, 24))
        );

        pn_book5.setBackground(new java.awt.Color(0, 153, 204));
        pn_book5.setRoundBottomLeft(10);
        pn_book5.setRoundBottomRight(10);
        pn_book5.setRoundTopLeft(10);
        pn_book5.setRoundTopRight(10);
        pn_book5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_book5MouseClicked(evt);
            }
        });

        judul5.setForeground(new java.awt.Color(255, 255, 255));
        judul5.setText("jLabel15");

        penulis5.setForeground(new java.awt.Color(255, 255, 255));
        penulis5.setText("jLabel16");

        id5.setForeground(new java.awt.Color(0, 153, 204));
        id5.setText("jLabel1");

        javax.swing.GroupLayout pn_book5Layout = new javax.swing.GroupLayout(pn_book5);
        pn_book5.setLayout(pn_book5Layout);
        pn_book5Layout.setHorizontalGroup(
            pn_book5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_book5Layout.createSequentialGroup()
                .addGroup(pn_book5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_book5Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(id5))
                    .addGroup(pn_book5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(pn_book5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(penulis5)
                            .addComponent(judul5))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_book5Layout.setVerticalGroup(
            pn_book5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_book5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(judul5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(id5)
                .addGap(28, 28, 28)
                .addComponent(penulis5)
                .addGap(30, 30, 30))
        );

        pn_book4.setBackground(new java.awt.Color(0, 153, 204));
        pn_book4.setRoundBottomLeft(10);
        pn_book4.setRoundBottomRight(10);
        pn_book4.setRoundTopLeft(10);
        pn_book4.setRoundTopRight(10);
        pn_book4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_book4MouseClicked(evt);
            }
        });

        judul4.setForeground(new java.awt.Color(255, 255, 255));
        judul4.setText("jLabel7");

        penulis4.setForeground(new java.awt.Color(255, 255, 255));
        penulis4.setText("jLabel8");

        id4.setForeground(new java.awt.Color(0, 153, 204));
        id4.setText("jLabel1");

        javax.swing.GroupLayout pn_book4Layout = new javax.swing.GroupLayout(pn_book4);
        pn_book4.setLayout(pn_book4Layout);
        pn_book4Layout.setHorizontalGroup(
            pn_book4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_book4Layout.createSequentialGroup()
                .addGroup(pn_book4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_book4Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(id4))
                    .addGroup(pn_book4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(pn_book4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(penulis4)
                            .addComponent(judul4))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        pn_book4Layout.setVerticalGroup(
            pn_book4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_book4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(judul4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(id4)
                .addGap(37, 37, 37)
                .addComponent(penulis4)
                .addGap(28, 28, 28))
        );

        pn_book6.setBackground(new java.awt.Color(0, 153, 204));
        pn_book6.setRoundBottomLeft(10);
        pn_book6.setRoundBottomRight(10);
        pn_book6.setRoundTopLeft(10);
        pn_book6.setRoundTopRight(10);
        pn_book6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_book6MouseClicked(evt);
            }
        });

        judul6.setForeground(new java.awt.Color(255, 255, 255));
        judul6.setText("jLabel13");

        penulis6.setForeground(new java.awt.Color(255, 255, 255));
        penulis6.setText("jLabel14");

        id6.setForeground(new java.awt.Color(0, 153, 204));
        id6.setText("jLabel1");

        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout pn_book6Layout = new javax.swing.GroupLayout(pn_book6);
        pn_book6.setLayout(pn_book6Layout);
        pn_book6Layout.setHorizontalGroup(
            pn_book6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_book6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pn_book6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(penulis6)
                    .addComponent(judul6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_book6Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(pn_book6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(id6))
                .addGap(51, 51, 51))
        );
        pn_book6Layout.setVerticalGroup(
            pn_book6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_book6Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(judul6)
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id6)
                .addGap(32, 32, 32)
                .addComponent(penulis6)
                .addGap(32, 32, 32))
        );

        pn_book7.setBackground(new java.awt.Color(0, 153, 204));
        pn_book7.setRoundBottomLeft(10);
        pn_book7.setRoundBottomRight(10);
        pn_book7.setRoundTopLeft(10);
        pn_book7.setRoundTopRight(10);
        pn_book7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_book7MouseClicked(evt);
            }
        });

        judul7.setForeground(new java.awt.Color(255, 255, 255));
        judul7.setText("jLabel11");

        penulis7.setForeground(new java.awt.Color(255, 255, 255));
        penulis7.setText("jLabel12");

        id7.setForeground(new java.awt.Color(0, 153, 204));
        id7.setText("jLabel1");

        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout pn_book7Layout = new javax.swing.GroupLayout(pn_book7);
        pn_book7.setLayout(pn_book7Layout);
        pn_book7Layout.setHorizontalGroup(
            pn_book7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_book7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pn_book7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(penulis7)
                    .addComponent(judul7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_book7Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(pn_book7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(id7))
                .addGap(52, 52, 52))
        );
        pn_book7Layout.setVerticalGroup(
            pn_book7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_book7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(judul7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(id7)
                .addGap(32, 32, 32)
                .addComponent(penulis7)
                .addGap(33, 33, 33))
        );

        jTextField1.setText(" ");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Cari");

        lb_halaman.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb_halaman.setText("1");

        btm_next.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btm_next.setText(">");
        btm_next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btm_nextMouseClicked(evt);
            }
        });

        btn_prev.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_prev.setText("<");
        btn_prev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_prevMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_backgroundLayout = new javax.swing.GroupLayout(pn_background);
        pn_background.setLayout(pn_backgroundLayout);
        pn_backgroundLayout.setHorizontalGroup(
            pn_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_backgroundLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(pn_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_backgroundLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                    .addGroup(pn_backgroundLayout.createSequentialGroup()
                        .addGroup(pn_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_prev)
                            .addGroup(pn_backgroundLayout.createSequentialGroup()
                                .addGroup(pn_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(pn_book5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pn_book1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(106, 106, 106)
                                .addGroup(pn_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pn_book2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pn_book6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(pn_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_backgroundLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(lb_halaman)
                                .addGap(57, 57, 57)
                                .addComponent(btm_next)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pn_backgroundLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(pn_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pn_book3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pn_book7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pn_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pn_book4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pn_book8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)))))
                .addGap(84, 84, 84))
        );
        pn_backgroundLayout.setVerticalGroup(
            pn_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_backgroundLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(pn_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(pn_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_book2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn_book1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn_book3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn_book4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(pn_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_book7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn_book8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn_book6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn_book5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(pn_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_halaman)
                    .addComponent(btm_next)
                    .addComponent(btn_prev))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void pn_book1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_book1MouseClicked
        //new DetailBuku(judul1.getText()).setVisible(true);
        String idBuku = id1.getText();
        new DetailBuku(null,true,cariBukuById(daftarBuku,idBuku),akun).setVisible(true);
    }//GEN-LAST:event_pn_book1MouseClicked

    private void btm_nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btm_nextMouseClicked
        pagination("next",halaman);
    }//GEN-LAST:event_btm_nextMouseClicked

    private void btn_prevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prevMouseClicked
        pagination("prev",halaman);
    }//GEN-LAST:event_btn_prevMouseClicked

    private void pn_book2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_book2MouseClicked
        String idBuku = id2.getText();
        new DetailBuku(null,true,cariBukuById(daftarBuku,idBuku),akun).setVisible(true);
    }//GEN-LAST:event_pn_book2MouseClicked

    private void pn_book3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_book3MouseClicked
        String idBuku = id3.getText();
        new DetailBuku(null,true,cariBukuById(daftarBuku,idBuku),akun).setVisible(true);
    }//GEN-LAST:event_pn_book3MouseClicked

    private void pn_book4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_book4MouseClicked
        String idBuku = id4.getText();
        new DetailBuku(null,true,cariBukuById(daftarBuku,idBuku),akun).setVisible(true);
    }//GEN-LAST:event_pn_book4MouseClicked

    private void pn_book5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_book5MouseClicked
        String idBuku = id5.getText();
        new DetailBuku(null,true,cariBukuById(daftarBuku,idBuku),akun).setVisible(true);
    }//GEN-LAST:event_pn_book5MouseClicked

    private void pn_book6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_book6MouseClicked
        String idBuku = id6.getText();
        new DetailBuku(null,true,cariBukuById(daftarBuku,idBuku),akun).setVisible(true);
    }//GEN-LAST:event_pn_book6MouseClicked

    private void pn_book7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_book7MouseClicked
        String idBuku = id7.getText();
        new DetailBuku(null,true,cariBukuById(daftarBuku,idBuku),akun).setVisible(true);
    }//GEN-LAST:event_pn_book7MouseClicked

    private void pn_book8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_book8MouseClicked
        String idBuku = id8.getText();
        new DetailBuku(null,true,cariBukuById(daftarBuku,idBuku),akun).setVisible(true);
    }//GEN-LAST:event_pn_book8MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btm_next;
    private javax.swing.JLabel btn_prev;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel id3;
    private javax.swing.JLabel id4;
    private javax.swing.JLabel id5;
    private javax.swing.JLabel id6;
    private javax.swing.JLabel id7;
    private javax.swing.JLabel id8;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel judul1;
    private javax.swing.JLabel judul2;
    private javax.swing.JLabel judul3;
    private javax.swing.JLabel judul4;
    private javax.swing.JLabel judul5;
    private javax.swing.JLabel judul6;
    private javax.swing.JLabel judul7;
    private javax.swing.JLabel judul8;
    private javax.swing.JLabel lb_halaman;
    private javax.swing.JLabel penulis1;
    private javax.swing.JLabel penulis2;
    private javax.swing.JLabel penulis3;
    private javax.swing.JLabel penulis4;
    private javax.swing.JLabel penulis5;
    private javax.swing.JLabel penulis6;
    private javax.swing.JLabel penulis7;
    private javax.swing.JLabel penulis8;
    private javax.swing.JPanel pn_background;
    private custom.Custom_JPanelRounded pn_book1;
    private custom.Custom_JPanelRounded pn_book2;
    private custom.Custom_JPanelRounded pn_book3;
    private custom.Custom_JPanelRounded pn_book4;
    private custom.Custom_JPanelRounded pn_book5;
    private custom.Custom_JPanelRounded pn_book6;
    private custom.Custom_JPanelRounded pn_book7;
    private custom.Custom_JPanelRounded pn_book8;
    // End of variables declaration//GEN-END:variables
}
