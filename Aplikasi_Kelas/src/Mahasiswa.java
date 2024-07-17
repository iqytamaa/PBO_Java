/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class Mahasiswa extends javax.swing.JFrame {
    private Connection con;
    private Statement stat;
    private ResultSet res;
    /**
     * Creates new form Mahasiswa
     */
    public Mahasiswa() {
        initComponents();
        setTitle("FORM MAHASISWA");
        koneksi ();
        kosongkan ();       
    }
    
    private void koneksi (){
     try {
          Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/aplikasikelas?useSSL=false&serverTimezone=UTC", "root", "");
         stat=con.createStatement();
         } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);}   
    }
    private void kosongkan(){
     chika_nim.setText("");
     chika_nama.setText("");
     chika_jk.setSelectedIndex(-1);
     chika_nohp.setText("");
     chika_alamat.setText("");
     chika_nim.requestFocus();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // TODO add your handling code here:
    // TODO add your handling code here:
    // </editor-fold> 
// </editor-fold> 
    
  



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        chika_nama = new javax.swing.JTextField();
        chika_nohp = new javax.swing.JTextField();
        chika_alamat = new javax.swing.JTextField();
        chika_nim = new javax.swing.JTextField();
        chika_jk = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        chika_edit = new javax.swing.JButton();
        chika_simpan = new javax.swing.JButton();
        chika_search = new javax.swing.JButton();
        chika_lihat = new javax.swing.JButton();
        chika_hapus = new javax.swing.JButton();
        chika_menu = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("NIM");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 24, -1, -1));

        jLabel3.setText("NAMA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 64, -1, -1));

        jLabel4.setText("Jenis Kelamin");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 105, -1, -1));

        jLabel5.setText("No Handphone");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 147, -1, -1));

        jLabel6.setText("Alamat");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 187, -1, -1));

        chika_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chika_namaActionPerformed(evt);
            }
        });
        jPanel1.add(chika_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 58, 192, 28));

        chika_nohp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chika_nohpActionPerformed(evt);
            }
        });
        chika_nohp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                chika_nohpKeyTyped(evt);
            }
        });
        jPanel1.add(chika_nohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 141, 192, 28));

        chika_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chika_alamatActionPerformed(evt);
            }
        });
        jPanel1.add(chika_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 181, 192, 28));

        chika_nim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chika_nimActionPerformed(evt);
            }
        });
        chika_nim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                chika_nimKeyTyped(evt);
            }
        });
        jPanel1.add(chika_nim, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 18, 192, 28));

        chika_jk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan", " " }));
        chika_jk.setSelectedIndex(-1);
        jPanel1.add(chika_jk, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 98, 192, 31));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("DATA MAHASISWA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 31, 430, 210));

        chika_edit.setText("EDIT");
        chika_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chika_editActionPerformed(evt);
            }
        });
        getContentPane().add(chika_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 80, 50));

        chika_simpan.setText("SIMPAN");
        chika_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chika_simpanActionPerformed(evt);
            }
        });
        getContentPane().add(chika_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, 45));

        chika_search.setText("SEARCH");
        chika_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chika_searchActionPerformed(evt);
            }
        });
        getContentPane().add(chika_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, 45));

        chika_lihat.setText("LIHAT");
        chika_lihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chika_lihatActionPerformed(evt);
            }
        });
        getContentPane().add(chika_lihat, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 80, 50));

        chika_hapus.setText("HAPUS");
        chika_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chika_hapusActionPerformed(evt);
            }
        });
        getContentPane().add(chika_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, 45));

        chika_menu.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        chika_menu.setText("MENU");
        chika_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chika_menuActionPerformed(evt);
            }
        });
        getContentPane().add(chika_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rizqy\\Downloads\\sekul img.png")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 740, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void chika_nimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chika_nimActionPerformed
        // TODO add your handling code here:
              try{
            res=stat.executeQuery("select * from mahasiswa where "+ "Nim='" + chika_nim.getText()
                +"'" ); while (res.next())
                { chika_nama.setText(res.getString("Nama"));
                chika_jk.setSelectedItem(res.getString("JenisKelamin"));
                chika_nohp.setText(res.getString("NoHp"));
                chika_alamat.setText(res.getString("Alamat"));
                }    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_chika_nimActionPerformed


    private void chika_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chika_editActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
    if (chika_nim.getText().isEmpty() || chika_nama.getText().isEmpty() ||
        chika_jk.getSelectedItem() == null || chika_nohp.getText().isEmpty() ||
        chika_alamat.getText().isEmpty()) {
        
        JOptionPane.showMessageDialog(null, "Semua field harus diisi untuk mengedit data!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int ok = JOptionPane.showConfirmDialog(null, "Apakah yakin ingin mengedit data?", "Confirmation", JOptionPane.YES_NO_OPTION);
    try {
        String sql = "update mahasiswa set Nim=?, Nama=?, JenisKelamin=?, NoHp=?, Alamat=? where Nim='"
                + chika_nim.getText() + "'";
        java.sql.PreparedStatement st = con.prepareStatement(sql);
        if (ok == 0) {
            try {
                st.setString(1, chika_nim.getText());
                st.setString(2, chika_nama.getText());
                st.setString(3, (String) chika_jk.getSelectedItem());
                st.setString(4, chika_nohp.getText());
                st.setString(5, chika_alamat.getText());
                st.executeUpdate();
                kosongkan();
                JOptionPane.showMessageDialog(null, "Edit Data Sukses");
                new Mahasiswa().setVisible(true);
                dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Edit Data Gagal");
            }
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada koneksi atau query SQL", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_chika_editActionPerformed

    private void chika_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chika_hapusActionPerformed
        // TODO add your handling code here:
            // TODO add your handling code here:
    if (chika_nim.getText().isEmpty() || 
        chika_nama.getText().isEmpty() || 
        chika_jk.getSelectedItem() == null || 
        chika_nohp.getText().isEmpty() || 
        chika_alamat.getText().isEmpty()) {
        
        JOptionPane.showMessageDialog(null, "Semua field harus diisi untuk menghapus data!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Cek apakah data ada di tabel
    boolean dataFound = false;
    try {
        String sqlCheck = "SELECT * FROM mahasiswa WHERE Nim = ?";
        java.sql.PreparedStatement stCheck = con.prepareStatement(sqlCheck);
        stCheck.setString(1, chika_nim.getText());
        java.sql.ResultSet rs = stCheck.executeQuery();
        if (rs.next()) {
            dataFound = true;
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Gagal memeriksa data: " + e.getMessage());
    }

    if (!dataFound) {
        JOptionPane.showMessageDialog(null, "Data tidak ditemukan di tabel mahasiswa!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int ok = JOptionPane.showConfirmDialog(null, "Apakah yakin ingin menghapus?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
    if (ok == JOptionPane.YES_OPTION) {
        try {
            String sql = "DELETE FROM mahasiswa WHERE Nim = ?";
            java.sql.PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, chika_nim.getText());
            st.executeUpdate();
            kosongkan();
            JOptionPane.showMessageDialog(null, "Delete Data Sukses");
            new Mahasiswa().setVisible(true);
            dispose();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Delete Data Gagal: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_chika_hapusActionPerformed

    private void chika_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chika_simpanActionPerformed
        // TODO add your handling code here:
   // TODO add your handling code here:
    try {
        // Trim the input to remove leading/trailing whitespace
        String nim = chika_nim.getText().trim();
        String nama = chika_nama.getText().trim();
        String jk = (String) chika_jk.getSelectedItem();
        String nohp = chika_nohp.getText().trim();
        String alamat = chika_alamat.getText().trim();

        // Validate that all fields are filled
        if (nim.isEmpty() || nama.isEmpty() || jk == null || nohp.isEmpty() || alamat.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Semua field harus diisi untuk menyimpan data!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Validate that NIM is a number
        if (!nim.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "NIM harus berupa angka!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Execute the SQL insert statement
        stat.executeUpdate("insert into mahasiswa values ("
            + "'" + nim + "',"
            + "'" + nama + "',"
            + "'" + jk + "',"
            + "'" + nohp + "',"
            + "'" + alamat + "')");

        // Clear the form fields
        kosongkan();
        
        // Show success message
        JOptionPane.showMessageDialog(null, "Berhasil Menyimpan Data");
        new Mahasiswa().setVisible(true);
        dispose();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Gagal Menyimpan Data! : " + e);
    }
    }//GEN-LAST:event_chika_simpanActionPerformed

    private void chika_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chika_searchActionPerformed
        // TODO add your handling code here:
          try {
            res=stat.executeQuery("select * from mahasiswa where "+ "Nim='" +chika_nim.getText()
            +"'" ); while (res.next())
                { chika_nama.setText(res.getString("Nama"));
                chika_jk.setSelectedItem(res.getString("JenisKelamin"));
                chika_nohp.setText(res.getString("NoHp"));
                chika_alamat.setText(res.getString("Alamat"));
    }
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                    }
    }//GEN-LAST:event_chika_searchActionPerformed

    
   
    
    private void chika_lihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chika_lihatActionPerformed
        // TODO add your handling code here:
        new TableMahasiswa().setVisible(true);
        dispose();                            
    }//GEN-LAST:event_chika_lihatActionPerformed

    private void chika_nohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chika_nohpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chika_nohpActionPerformed

    private void chika_nohpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chika_nohpKeyTyped
        // TODO add your handling code here:
             char chika=evt.getKeyChar();
        if(!(Character.isDigit(chika)))
        {
            evt.consume();
        }
    }//GEN-LAST:event_chika_nohpKeyTyped

    private void chika_nimKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chika_nimKeyTyped
        // TODO add your handling code here:
           char chika=evt.getKeyChar();
        if(!(Character.isDigit(chika)))
        {
            evt.consume();
        }
    }//GEN-LAST:event_chika_nimKeyTyped

    private void chika_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chika_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chika_alamatActionPerformed

    private void chika_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chika_menuActionPerformed
        // TODO add your handling code here:
        new MenuUtama().setVisible(true);
        dispose();
    }//GEN-LAST:event_chika_menuActionPerformed

    private void chika_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chika_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chika_namaActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Mahasiswa().setVisible(true);
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField chika_alamat;
    private javax.swing.JButton chika_edit;
    private javax.swing.JButton chika_hapus;
    public javax.swing.JComboBox<String> chika_jk;
    public javax.swing.JButton chika_lihat;
    public javax.swing.JButton chika_menu;
    public javax.swing.JTextField chika_nama;
    public javax.swing.JTextField chika_nim;
    public javax.swing.JTextField chika_nohp;
    private javax.swing.JButton chika_search;
    private javax.swing.JButton chika_simpan;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private static class PreparedStatement {

        public PreparedStatement() {
        }

        private void executeUpdate() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setString(int i, String text) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}