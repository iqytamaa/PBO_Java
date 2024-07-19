/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Rizqy
 */
public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked") // Menginstruksikan compiler untuk mengabaikan peringatan unchecked cast (peringatan saat konversi tipe generik)
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        chika_mahasiswa = new javax.swing.JButton();
        chika_uangkas = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        chika_logout = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Mahasiswa");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        chika_mahasiswa.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        chika_mahasiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/image upload.png"))); // NOI18N
        chika_mahasiswa.setText("Mahasiswa");
        chika_mahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chika_mahasiswaActionPerformed(evt);
            }
        });
        jPanel2.add(chika_mahasiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, 30));

        chika_uangkas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        chika_uangkas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/new-icon.png"))); // NOI18N
        chika_uangkas.setText("Uang Kas");
        chika_uangkas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chika_uangkasActionPerformed(evt);
            }
        });
        jPanel2.add(chika_uangkas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 130, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Uang Kas");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("MENU UTAMA");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 430, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 340, 150));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 430, 210));

        chika_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/close-icon.png"))); // NOI18N
        chika_logout.setText("LOGOUT");
        chika_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chika_logoutActionPerformed(evt);
            }
        });
        getContentPane().add(chika_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/sekul img.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chika_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chika_logoutActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true); // Membuat instance baru dari jendela login dan membuatnya terlihat (menampilkan UI login)
        dispose();
        javax.swing.JOptionPane.showMessageDialog(null, "ANDA BERHASIL LOGOUT");
    }//GEN-LAST:event_chika_logoutActionPerformed

    private void chika_uangkasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chika_uangkasActionPerformed
        // TODO add your handling code here:
        new UangKas ().setVisible(true);  //  (menampilkan UI Uangkas)
        dispose();
    }//GEN-LAST:event_chika_uangkasActionPerformed

    private void chika_mahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chika_mahasiswaActionPerformed
        // TODO add your handling code here:
        new Mahasiswa().setVisible(true); // (menampilkan UI Mahasiswa)
        dispose();
    }//GEN-LAST:event_chika_mahasiswaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chika_logout;
    private javax.swing.JButton chika_mahasiswa;
    public javax.swing.JButton chika_uangkas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

}