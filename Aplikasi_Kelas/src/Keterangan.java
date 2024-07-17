/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rizqy
 */

public class Keterangan extends javax.swing.JFrame { // Deklarasi kelas Keterangan yang merupakan turunan dari JFrame
    private Connection con; // Deklarasi variabel untuk koneksi database
    private Statement stat; // Deklarasi variabel untuk pernyataan SQL
    private ResultSet res; // Deklarasi variabel untuk menyimpan hasil query SQL

    /**
     * Creates new form uangkas
     */
    public Keterangan() { // Konstruktor untuk kelas Keterangan
        initComponents(); // Memanggil metode untuk menginisialisasi komponen GUI
        setTitle("LAPORAN UANGKAS"); // Mengatur judul jendela
        koneksi(); // Memanggil metode untuk koneksi ke database
        tabel(); // Memanggil metode untuk mengisi tabel
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // Mendapatkan ukuran layar
        Dimension frameSize = getSize(); // Mendapatkan ukuran frame
        setLocation(
            (screenSize.width - frameSize.width) / 3, // Mengatur lokasi frame secara horizontal
            (screenSize.height - frameSize.height) / 4); // Mengatur lokasi frame secara vertikal
    }

    private void koneksi() { // Metode untuk koneksi ke database
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Memuat driver JDBC MySQL
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/aplikasikelas?useSSL=false&serverTimezone=UTC", "root", ""); // Membuat koneksi ke database
            stat = con.createStatement(); // Membuat statement untuk eksekusi query SQL
        } catch (Exception e) { // Menangkap jika terjadi kesalahan
            JOptionPane.showMessageDialog(null, e); // Menampilkan pesan kesalahan
        }
    }


    
    private void tabel (){ // Metode untuk mengatur tabel
    DefaultTableModel t= new DefaultTableModel(); // Membuat model tabel baru
    t.addColumn("No"); // Menambahkan kolom "No" ke model tabel
    t.addColumn("Tanggal"); // Menambahkan kolom "Tanggal" ke model tabel
    t.addColumn("Nama"); // Menambahkan kolom "Nama" ke model tabel
    t.addColumn("Pemasukan"); // Menambahkan kolom "Pemasukan" ke model tabel
    t.addColumn("Pengeluaran"); // Menambahkan kolom "Pengeluaran" ke model tabel
    t.addColumn("SaldoAkhir"); // Menambahkan kolom "SaldoAkhir" ke model tabel
    t.addColumn("Keterangan"); // Menambahkan kolom "Keterangan" ke model tabel
    chika_table.setModel(t); // Mengatur model tabel ke komponen tabel (chika_table)
    try {
        res = stat.executeQuery("select * from uangkas"); // Mengeksekusi query SQL untuk mengambil semua data dari tabel 'uangkas'
        while (res.next()) { // Melakukan iterasi pada hasil query
            t.addRow(new Object[]{ 
                res.getString("No"), // Menambahkan data dari kolom "No" ke baris baru tabel
                res.getString("Tanggal"), // Menambahkan data dari kolom "Tanggal" ke baris baru tabel
                res.getString("Nama"), // Menambahkan data dari kolom "Nama" ke baris baru tabel
                res.getString("Pemasukan"), // Menambahkan data dari kolom "Pemasukan" ke baris baru tabel
                res.getString("Pengeluaran"), // Menambahkan data dari kolom "Pengeluaran" ke baris baru tabel
                res.getString("SaldoAkhir"), // Menambahkan data dari kolom "SaldoAkhir" ke baris baru tabel
                res.getString("Keterangan") // Menambahkan data dari kolom "Keterangan" ke baris baru tabel
            });
        }
    } catch (Exception e) { // Menangkap jika terjadi kesalahan
        JOptionPane.showMessageDialog(rootPane, e); // Menampilkan pesan kesalahan
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        chika_table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        chika_logout = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chika_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        chika_table.setShowHorizontalLines(true);
        chika_table.setShowVerticalLines(true);
        chika_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chika_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(chika_table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 560, 160));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("PEMBAYARAN");
        jPanel3.add(jLabel2);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 360, 40));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, -20, 90, -1));

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("KETERANGAN");
        jPanel5.add(jLabel1);

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 20, 630, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 560, 280));

        chika_logout.setText("LOGOUT");
        chika_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chika_logoutActionPerformed(evt);
            }
        });
        getContentPane().add(chika_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rizqy\\Downloads\\sekul img.png")); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 740, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chika_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chika_logoutActionPerformed
        // TODO add your handling code here:
         new Login().setVisible(true);
        dispose();
        javax.swing.JOptionPane.showMessageDialog(null, "ANDA BERHASIL LOGOUT");
    }//GEN-LAST:event_chika_logoutActionPerformed

    private void chika_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chika_tableMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_chika_tableMouseClicked

    
    
    
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
            java.util.logging.Logger.getLogger(UangKas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UangKas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UangKas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UangKas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Keterangan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chika_logout;
    private javax.swing.JTable chika_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
