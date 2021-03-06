/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author otton
 */
public class MenuUser extends javax.swing.JFrame {
    ArrayList<Pegawai> pegawais;
    ArrayList<Riwayat> riwayats;
    ArrayList<Perizinan> perizinans;
    int index = -1;
    int keluar = 0;

    /**
     * Creates new form MenuUser
     * @param pegawais
     * @param riwayats
     * @param perizinans
     */
    public MenuUser(ArrayList<Pegawai> pegawais, ArrayList<Riwayat> riwayats, ArrayList<Perizinan> perizinans) {
        this.pegawais = pegawais;
        this.riwayats = riwayats;
        this.perizinans = perizinans;
        initComponents();
        showTanggalJam();
    }
    
    void showTanggalJam(){
        new Timer(0, (ActionEvent e) -> {
            Date tanggal1 = new Date();
            SimpleDateFormat formatTanggal = new SimpleDateFormat ("E, dd MMM yyyy   HH:mm:ss");
            tanggalJamRun.setText(formatTanggal.format(tanggal1));
        }).start();
    }

//    private MenuUser() {
//        initComponents();
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Absensi = new javax.swing.JPanel();
        NIP = new javax.swing.JLabel();
        NIPField = new javax.swing.JTextField();
        buttonMulaiKerja = new javax.swing.JPanel();
        mulaiKerja = new javax.swing.JLabel();
        buttonAkhiriKerja = new javax.swing.JPanel();
        akhiriKerja = new javax.swing.JLabel();
        paneltabLoginToAdmin = new javax.swing.JPanel();
        tabLoginToAdmin = new javax.swing.JLabel();
        tanggalJamRun = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Absensi");
        setFocusTraversalPolicyProvider(true);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/png/icon-logo.png")).getImage());
        setResizable(false);

        Absensi.setBackground(new java.awt.Color(40, 40, 40));
        Absensi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Absensi.setPreferredSize(new java.awt.Dimension(420, 160));

        NIP.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        NIP.setForeground(new java.awt.Color(110, 217, 161));
        NIP.setText("Nomor Induk Pegawai");

        NIPField.setBackground(new java.awt.Color(46, 46, 46));
        NIPField.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        NIPField.setForeground(new java.awt.Color(110, 217, 161));
        NIPField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 217, 161)));

        buttonMulaiKerja.setBackground(new java.awt.Color(59, 59, 59));
        buttonMulaiKerja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 217, 161), 2));
        buttonMulaiKerja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMulaiKerja.setPreferredSize(new java.awt.Dimension(120, 40));
        buttonMulaiKerja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMulaiKerjaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMulaiKerjaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonMulaiKerjaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonMulaiKerjaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonMulaiKerjaMouseReleased(evt);
            }
        });

        mulaiKerja.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        mulaiKerja.setForeground(new java.awt.Color(110, 217, 161));
        mulaiKerja.setText("Mulai Kerja");

        javax.swing.GroupLayout buttonMulaiKerjaLayout = new javax.swing.GroupLayout(buttonMulaiKerja);
        buttonMulaiKerja.setLayout(buttonMulaiKerjaLayout);
        buttonMulaiKerjaLayout.setHorizontalGroup(
            buttonMulaiKerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonMulaiKerjaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(mulaiKerja)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        buttonMulaiKerjaLayout.setVerticalGroup(
            buttonMulaiKerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonMulaiKerjaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mulaiKerja)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        buttonAkhiriKerja.setBackground(new java.awt.Color(59, 59, 59));
        buttonAkhiriKerja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 217, 161), 2));
        buttonAkhiriKerja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAkhiriKerja.setPreferredSize(new java.awt.Dimension(120, 40));
        buttonAkhiriKerja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAkhiriKerjaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAkhiriKerjaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonAkhiriKerjaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonAkhiriKerjaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonAkhiriKerjaMouseReleased(evt);
            }
        });

        akhiriKerja.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        akhiriKerja.setForeground(new java.awt.Color(110, 217, 161));
        akhiriKerja.setText("Akhiri Kerja");

        javax.swing.GroupLayout buttonAkhiriKerjaLayout = new javax.swing.GroupLayout(buttonAkhiriKerja);
        buttonAkhiriKerja.setLayout(buttonAkhiriKerjaLayout);
        buttonAkhiriKerjaLayout.setHorizontalGroup(
            buttonAkhiriKerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonAkhiriKerjaLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(akhiriKerja)
                .addGap(18, 18, 18))
        );
        buttonAkhiriKerjaLayout.setVerticalGroup(
            buttonAkhiriKerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonAkhiriKerjaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(akhiriKerja)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        paneltabLoginToAdmin.setBackground(new java.awt.Color(40, 40, 40));
        paneltabLoginToAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paneltabLoginToAdminMouseClicked(evt);
            }
        });

        tabLoginToAdmin.setBackground(new java.awt.Color(40, 40, 40));
        tabLoginToAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/icon-admin.png"))); // NOI18N
        tabLoginToAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout paneltabLoginToAdminLayout = new javax.swing.GroupLayout(paneltabLoginToAdmin);
        paneltabLoginToAdmin.setLayout(paneltabLoginToAdminLayout);
        paneltabLoginToAdminLayout.setHorizontalGroup(
            paneltabLoginToAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneltabLoginToAdminLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tabLoginToAdmin))
        );
        paneltabLoginToAdminLayout.setVerticalGroup(
            paneltabLoginToAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneltabLoginToAdminLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tabLoginToAdmin))
        );

        tanggalJamRun.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tanggalJamRun.setForeground(new java.awt.Color(110, 217, 161));
        tanggalJamRun.setText("ini tanggal dan jam");

        javax.swing.GroupLayout AbsensiLayout = new javax.swing.GroupLayout(Absensi);
        Absensi.setLayout(AbsensiLayout);
        AbsensiLayout.setHorizontalGroup(
            AbsensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbsensiLayout.createSequentialGroup()
                .addGroup(AbsensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tanggalJamRun)
                    .addGroup(AbsensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(paneltabLoginToAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(AbsensiLayout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(buttonMulaiKerja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(90, 90, 90)
                            .addComponent(buttonAkhiriKerja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(AbsensiLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(NIP)
                            .addGap(19, 19, 19)
                            .addComponent(NIPField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        AbsensiLayout.setVerticalGroup(
            AbsensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AbsensiLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(tanggalJamRun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AbsensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NIPField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(AbsensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonAkhiriKerja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMulaiKerja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(paneltabLoginToAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Absensi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Absensi, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMulaiKerjaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMulaiKerjaMouseEntered
        // TODO add your handling code here:
        buttonMulaiKerja.setBackground(new Color(44,44,44));
        buttonMulaiKerja.setBorder(BorderFactory.createLineBorder(new Color(85,192,136), 2));
    }//GEN-LAST:event_buttonMulaiKerjaMouseEntered

    private void buttonMulaiKerjaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMulaiKerjaMouseExited
        // TODO add your handling code here:
        buttonMulaiKerja.setBackground(new Color(59,59,59));
        buttonMulaiKerja.setBorder(BorderFactory.createLineBorder(new Color(110,217,161), 2));
    }//GEN-LAST:event_buttonMulaiKerjaMouseExited

    private void buttonMulaiKerjaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMulaiKerjaMousePressed
        // TODO add your handling code here:
        buttonMulaiKerja.setBackground(new Color(30,30,30));
        buttonMulaiKerja.setBorder(BorderFactory.createLineBorder(new Color(59,166,110), 2));
    }//GEN-LAST:event_buttonMulaiKerjaMousePressed

    private void buttonMulaiKerjaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMulaiKerjaMouseReleased
        // TODO add your handling code here:
        buttonMulaiKerja.setBackground(new Color(44,44,44));
        buttonMulaiKerja.setBorder(BorderFactory.createLineBorder(new Color(85,192,136), 2));
    }//GEN-LAST:event_buttonMulaiKerjaMouseReleased

    private void buttonMulaiKerjaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMulaiKerjaMouseClicked
        // TODO add your handling code here:
        String NIP = NIPField.getText();
        String nama = "";
        String tanggalRiwayat = "";
        if (NIP.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Silahkan isi NIP!");
        } else {
            for (int i = 0; i< pegawais.size(); i++){
                Pegawai pegawai = pegawais.get(i);
                if(NIP.equalsIgnoreCase(pegawai.getNIP())){
                    index=i;
                    nama = pegawai.getNama();
                    break;
                } else {
                    index=-1;
                }
            }

            for (int r = 0; r< riwayats.size(); r++){
                Riwayat riwayat = riwayats.get(r);
                if (NIP.equalsIgnoreCase(riwayat.getNIP())){
                    if (riwayat.getJamKeluar().equalsIgnoreCase("-")){
                        keluar = -1;
                        break;
                    }
                    tanggalRiwayat = riwayat.getTanggal();
                } else {
                    keluar = r;
                }
            }

            if (index >= 0){
                if (keluar >= 0){
                    LocalDateTime DateTime = LocalDateTime.now();
                    LocalDateTime Keluar = DateTime.plusMinutes(2);
                    DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
                    DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
                    String tanggal = DateTime.format(date);
                    String jamMasuk = DateTime.format(time);
                    String minKeluar = Keluar.format(time);
                    String jamKeluar = "-";
                    if (!tanggal.equalsIgnoreCase(tanggalRiwayat)){
                        riwayats.add(new Riwayat(tanggal, NIP, nama, jamMasuk, minKeluar, jamKeluar));
                        try (PrintWriter out = new PrintWriter("src/TugasBesar/Riwayat.txt")) {
                            for (Riwayat riwayat : riwayats) {
                                out.println(riwayat.getTanggal()+ ";" + riwayat.getNIP()+ ";" + riwayat.getNama()+ ";" + riwayat.getJamMasuk()+ ";" + riwayat.getMinKeluar()+ ";" + riwayat.getJamKeluar());
                            }
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(MenuUser.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        JOptionPane.showMessageDialog(null, "Selamat datang dan selamat bekerja " +nama+ "!");
                        NIPField.setText("");
                        NIPField.requestFocus();
                    } else {
                        JOptionPane.showMessageDialog(null, "Hari ini anda sudah selesai kerja!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Anda sedang bekerja!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "NIP tidak ditemukan");
            }
        }
    }//GEN-LAST:event_buttonMulaiKerjaMouseClicked

    private void buttonAkhiriKerjaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAkhiriKerjaMouseEntered
        // TODO add your handling code here:
        buttonAkhiriKerja.setBackground(new Color(44,44,44));
        buttonAkhiriKerja.setBorder(BorderFactory.createLineBorder(new Color(85,192,136), 2));
    }//GEN-LAST:event_buttonAkhiriKerjaMouseEntered

    private void buttonAkhiriKerjaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAkhiriKerjaMouseExited
        // TODO add your handling code here:
        buttonAkhiriKerja.setBackground(new Color(59,59,59));
        buttonAkhiriKerja.setBorder(BorderFactory.createLineBorder(new Color(110,217,161), 2));
    }//GEN-LAST:event_buttonAkhiriKerjaMouseExited

    private void buttonAkhiriKerjaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAkhiriKerjaMousePressed
        // TODO add your handling code here:
        buttonAkhiriKerja.setBackground(new Color(30,30,30));
        buttonAkhiriKerja.setBorder(BorderFactory.createLineBorder(new Color(59,166,110), 2));
    }//GEN-LAST:event_buttonAkhiriKerjaMousePressed

    private void buttonAkhiriKerjaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAkhiriKerjaMouseReleased
        // TODO add your handling code here:
        buttonAkhiriKerja.setBackground(new Color(44,44,44));
        buttonAkhiriKerja.setBorder(BorderFactory.createLineBorder(new Color(85,192,136), 2));
    }//GEN-LAST:event_buttonAkhiriKerjaMouseReleased

    private void buttonAkhiriKerjaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAkhiriKerjaMouseClicked
        // TODO add your handling code here:
        String NIP = NIPField.getText();
        String nama = "";
        String minKeluar = "";
        String tanggal = "";
        String jamMasuk = "";
        LocalDateTime DateTime = LocalDateTime.now();
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
        String tanggalSekarang = DateTime.format(date);
        if (NIP.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Silahkan isi NIP!");
        } else {
            for (int r = 0; r< riwayats.size(); r++){
                Riwayat riwayat = riwayats.get(r);
                if (NIP.equalsIgnoreCase(riwayat.getNIP())){
                    if (tanggalSekarang.equalsIgnoreCase(riwayat.getTanggal())){
                        keluar = r;
                        index=r;
                        minKeluar = riwayat.getMinKeluar();
                        tanggal = riwayat.getTanggal();
                        jamMasuk = riwayat.getJamMasuk();
                        nama = riwayat.getNama();
                        break;
                    }
                } else {
                    index = -1;
                    keluar = -1;
                }
            }

            if (index >= 0){
                if (keluar >= 0){
                    String jamKeluar = DateTime.format(time);
                    String logic1 = minKeluar.substring(0,2) + minKeluar.substring(3,5) + minKeluar.substring(6,8);
                    String logic2 = jamKeluar.substring(0,2) + jamKeluar.substring(3,5) + jamKeluar.substring(6,8);
                    int logicJamMinKeluar = Integer.parseInt(logic1);
                    int logicJamSekarang = Integer.parseInt(logic2);
                    if (tanggalSekarang.equalsIgnoreCase(tanggal)){
                        if (logicJamSekarang > logicJamMinKeluar){
                            riwayats.set(index, new Riwayat(tanggal, NIP, nama, jamMasuk, minKeluar, jamKeluar));
                            try (PrintWriter out = new PrintWriter("src/TugasBesar/Riwayat.txt")) {
                                for (Riwayat riwayat : riwayats) {
                                    out.println(riwayat.getTanggal()+ ";" + riwayat.getNIP()+ ";" + riwayat.getNama()+ ";" + riwayat.getJamMasuk()+ ";" + riwayat.getMinKeluar()+ ";" + riwayat.getJamKeluar());                            }
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(MenuUser.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            JOptionPane.showMessageDialog(null, "Terimakasih dan sampai jumpa " +nama+ "!");
                            NIPField.setText("");
                            NIPField.requestFocus();
                        } else {
                            JOptionPane.showMessageDialog(null, "Waktu kerja anda belum memenuhi!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Waktu kerja anda belum memenuhi!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Anda belum melakukan absensi!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Anda belum melakukan absensi!");
            }
        }
    }//GEN-LAST:event_buttonAkhiriKerjaMouseClicked

    private void paneltabLoginToAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneltabLoginToAdminMouseClicked
        Login login = new Login(pegawais, riwayats, perizinans);
        login.setVisible(true);
    }//GEN-LAST:event_paneltabLoginToAdminMouseClicked

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
//    public static void main(String args[]) throws FileNotFoundException {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuUser().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Absensi;
    private javax.swing.JLabel NIP;
    private javax.swing.JTextField NIPField;
    private javax.swing.JLabel akhiriKerja;
    private javax.swing.JPanel buttonAkhiriKerja;
    private javax.swing.JPanel buttonMulaiKerja;
    private javax.swing.JLabel mulaiKerja;
    private javax.swing.JPanel paneltabLoginToAdmin;
    private javax.swing.JLabel tabLoginToAdmin;
    private javax.swing.JLabel tanggalJamRun;
    // End of variables declaration//GEN-END:variables
}
