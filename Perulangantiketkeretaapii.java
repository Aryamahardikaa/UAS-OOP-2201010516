
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Perulangantiketkeretaapii extends javax.swing.JFrame {
int vip, economi, harga, beli, total, bayar, kembali;
    /**
     * Creates new form Perulangantiketkeretaapii
     */
    public Perulangantiketkeretaapii() {
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

        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Jurusan = new javax.swing.JComboBox<>();
        rb_vip = new javax.swing.JRadioButton();
        rb_economi = new javax.swing.JRadioButton();
        txt_harga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_input = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        btn_cetak = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area = new javax.swing.JTextArea();
        txt_nomor = new javax.swing.JTextField();
        txt_kembalian = new javax.swing.JTextField();
        txt_jumlah = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        txt_bayar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txt_nama1 = new javax.swing.JTextField();

        jLabel6.setText("jLabel6");

        jTextField5.setText("jTextField5");

        jTextField6.setText("jTextField6");

        jTextField7.setText("jTextField7");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Penjualan Tiket Kereta Api");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Data Kereta"));

        jLabel2.setText("Jurusan");

        jLabel3.setText("Jenis");

        jLabel4.setText("Harga");

        Jurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Palembang", "Kota Bumi", "Baturaja", "Lampung" }));
        Jurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JurusanActionPerformed(evt);
            }
        });

        rb_vip.setText("Vip");
        rb_vip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_vipActionPerformed(evt);
            }
        });

        rb_economi.setText("Economi");
        rb_economi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_economiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(rb_vip, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rb_economi, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_harga)
                                .addContainerGap())))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(rb_vip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_economi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(0, 47, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 210, 180));

        jLabel5.setText("Nomor Kursi");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        jLabel7.setText("Nama Penumpang");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jLabel8.setText("Jumlah Beli");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 100, -1));

        jLabel9.setText("Total Bayar");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        jLabel10.setText("Uang Bayar");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 70, -1));

        jLabel11.setText("Uang Kembali");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        btn_input.setBackground(new java.awt.Color(204, 51, 0));
        btn_input.setForeground(new java.awt.Color(255, 255, 255));
        btn_input.setText("Input Lagi");
        btn_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inputActionPerformed(evt);
            }
        });
        jPanel1.add(btn_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        btn_keluar.setBackground(new java.awt.Color(204, 51, 0));
        btn_keluar.setForeground(new java.awt.Color(255, 255, 255));
        btn_keluar.setText("Keluar");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        btn_cetak.setBackground(new java.awt.Color(255, 51, 51));
        btn_cetak.setText("Cetak");
        btn_cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cetakActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        txt_area.setColumns(20);
        txt_area.setRows(5);
        jScrollPane1.setViewportView(txt_area);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 400, 160));
        jPanel1.add(txt_nomor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 130, -1));
        jPanel1.add(txt_kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 130, -1));

        txt_jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jumlahActionPerformed(evt);
            }
        });
        txt_jumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_jumlahKeyReleased(evt);
            }
        });
        jPanel1.add(txt_jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 130, -1));
        jPanel1.add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 130, -1));

        txt_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bayarActionPerformed(evt);
            }
        });
        txt_bayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_bayarKeyReleased(evt);
            }
        });
        jPanel1.add(txt_bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 130, -1));

        jPanel3.setBackground(new java.awt.Color(204, 0, 51));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 0, 0));
        jLabel12.setText("Penjualan Tiket Kereta Api");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel12)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(txt_nama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb_vipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_vipActionPerformed
        // TODO add your handling code here:
        if(rb_vip.isSelected()){
            txt_harga.setText(String.valueOf(vip));
        }
         if(rb_economi.isSelected()){
            txt_harga.setText(String.valueOf(economi));
        }
    }//GEN-LAST:event_rb_vipActionPerformed

    private void rb_economiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_economiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_economiActionPerformed

    private void btn_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inputActionPerformed
        // TODO add your handling code here:
        buttonGroup1.clearSelection();
        txt_harga.setText("");
        Jurusan.setSelectedItem("Pilih Jurusan");
        txt_nomor.setText("");
        txt_nomor.setText("");
        txt_total.setText("");
        txt_jumlah.setText("");
        txt_bayar.setText("");
        txt_kembalian.setText("");
    }//GEN-LAST:event_btn_inputActionPerformed

    private void JurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JurusanActionPerformed
        // TODO add your handling code here:
        
        if(Jurusan.getSelectedItem().equals("Pilih Jurusan")){
            buttonGroup1.clearSelection();
            txt_harga.setText("");
        }
        else if(Jurusan.getSelectedItem().equals("Palembang")){
            vip=80000;
            economi=40000;
        }
        else if(Jurusan.getSelectedItem().equals("Kota Bumi")){
            vip=50000;
            economi=25000;
        }
        else if(Jurusan.getSelectedItem().equals("Batu Raja")){
            vip=60000;
            economi=30000;
        }
        else if(Jurusan.getSelectedItem().equals("Lampung")){
            vip=40000;
            economi=20000;
        }
    }//GEN-LAST:event_JurusanActionPerformed

    private void txt_jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jumlahActionPerformed
        // TODO add your handling code here:
        beli=Integer.parseInt(txt_jumlah.getText());
        harga=Integer.parseInt(txt_harga.getText());
        total=bayar*harga;
        txt_total.setText(String.valueOf(total));
    }//GEN-LAST:event_txt_jumlahActionPerformed

    private void txt_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bayarActionPerformed
        // TODO add your handling code here:
        bayar=Integer.parseInt(txt_bayar.getText());
        kembali=Integer.parseInt(txt_total.getText());
        total=bayar-kembali;
        txt_kembalian.setText(String.valueOf(total));
    }//GEN-LAST:event_txt_bayarActionPerformed

    private void txt_jumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_jumlahKeyReleased
        // TODO add your handling code here:
        int a, b, c;
        a=Integer.valueOf(txt_harga.getText());
        b=Integer.valueOf(txt_jumlah.getText());
        c=a*b;
        txt_total.setText(""+c);
    }//GEN-LAST:event_txt_jumlahKeyReleased

    private void txt_bayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bayarKeyReleased
        // TODO add your handling code here:
        int a, b, c;
        a=Integer.valueOf(txt_bayar.getText());
        b=Integer.valueOf(txt_total.getText());
        c=a-b;
        txt_kembalian.setText(""+c);
    }//GEN-LAST:event_txt_bayarKeyReleased

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        // TODO add your handling code here:
        int answer=JOptionPane.showConfirmDialog(null,"Anda Yakin Keluar","Keluar",JOptionPane.OK_OPTION);
        if(answer==JOptionPane.OK_OPTION){
            dispose();
        }
            
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void btn_cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cetakActionPerformed
        // TODO add your handling code here:
        btn_cetak.setText((String)Jurusan.getSelectedItem());
        txt_area.setText(
                "Nomor Kursi         :"+txt_nomor.getText()+"\n"+
                "Nama Penumpang         :"+txt_nomor.getText()+"\n"+
                "Jumlah Beli         :"+txt_jumlah.getText()+"\n"+
                "Total Bayar         :"+txt_total.getText()+"\n"+
                "Uang Bayar        :"+txt_bayar.getText()+"\n"+
                "Uang Kembali         :"+txt_kembalian.getText()+"\n");
    }//GEN-LAST:event_btn_cetakActionPerformed

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
            java.util.logging.Logger.getLogger(Perulangantiketkeretaapii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perulangantiketkeretaapii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perulangantiketkeretaapii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perulangantiketkeretaapii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perulangantiketkeretaapii().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Jurusan;
    private javax.swing.JButton btn_cetak;
    private javax.swing.JButton btn_input;
    private javax.swing.JButton btn_keluar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JRadioButton rb_economi;
    private javax.swing.JRadioButton rb_vip;
    private javax.swing.JTextArea txt_area;
    private javax.swing.JTextField txt_bayar;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_jumlah;
    private javax.swing.JTextField txt_kembalian;
    private javax.swing.JTextField txt_nama1;
    private javax.swing.JTextField txt_nomor;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
