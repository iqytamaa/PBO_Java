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



public class Mahasiswa extends javax.swing.JFrame { // Mendefinisikan kelas Mahasiswa yang merupakan subclass dari JFrame
    private Connection con; // Deklarasi variabel con untuk koneksi database
    private Statement stat; // Deklarasi variabel stat untuk eksekusi query SQL
    private ResultSet res; // Deklarasi variabel res untuk menyimpan hasil query SQL
    /**
     * Creates new form Mahasiswa
     */
    public Mahasiswa() { // Konstruktor kelas Mahasiswa
        initComponents(); // Memanggil metode untuk inisialisasi komponen GUI
        setTitle("FORM MAHASISWA"); // Mengatur judul jendela
        koneksi ();  // Memanggil metode untuk menginisialisasi koneksi ke database
        kosongkan ();  // Memanggil metode untuk mengosongkan atau mereset form input     
    }
    
    private void koneksi (){
     try {
    Class.forName("com.mysql.cj.jdbc.Driver"); // Memuat driver JDBC MySQL versi terbaru
    con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/aplikasikelas?useSSL=false&serverTimezone=UTC", "root", ""); // Menghubungkan ke database MySQL pada localhost dengan database 'aplikasikelas', user 'root', tanpa password
    stat = con.createStatement(); // Membuat statement untuk eksekusi query SQL
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e); // Menampilkan pesan dialog jika terjadi kesalahan koneksi atau eksekusi
}   
}

private void kosongkan() {
    chika_nim.setText(""); // Mengosongkan field teks untuk NIM
    chika_nama.setText(""); // Mengosongkan field teks untuk nama
    chika_jk.setSelectedIndex(-1); // Mengatur JComboBox jenis kelamin ke indeks -1 (tidak ada yang dipilih)
    chika_nohp.setText(""); // Mengosongkan field teks untuk nomor HP
    chika_alamat.setText(""); // Mengosongkan field teks untuk alamat
    chika_nim.requestFocus(); // Mengatur fokus ke field teks NIM
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

        chika_edit = new javax.swing.JButton();
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
        chika_simpan = new javax.swing.JButton();
        chika_search = new javax.swing.JButton();
        chika_lihat = new javax.swing.JButton();
        chika_hapus = new javax.swing.JButton();
        chika_menu = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chika_edit.setBackground(new java.awt.Color(0, 153, 153));
        chika_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/update.png"))); // NOI18N
        chika_edit.setText("EDIT");
        chika_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chika_editActionPerformed(evt);
            }
        });
        getContentPane().add(chika_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 90, 50));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("NIM");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Nama");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Jenis Kelamin");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("No Handphone");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Alamat");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, 30));

        chika_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chika_namaActionPerformed(evt);
            }
        });
        jPanel1.add(chika_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 192, 28));

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
        jPanel1.add(chika_nohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 192, 28));

        chika_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chika_alamatActionPerformed(evt);
            }
        });
        jPanel1.add(chika_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 192, 28));

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
        jPanel1.add(chika_nim, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 192, 28));

        chika_jk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan", " " }));
        chika_jk.setSelectedIndex(-1);
        jPanel1.add(chika_jk, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 192, 31));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("DATA MAHASISWA");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 480, 260));

        chika_simpan.setBackground(new java.awt.Color(0, 153, 153));
        chika_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Save-icon.png"))); // NOI18N
        chika_simpan.setText("SIMPAN");
        chika_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chika_simpanActionPerformed(evt);
            }
        });
        getContentPane().add(chika_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 280, 100, 45));

        chika_search.setBackground(new java.awt.Color(0, 153, 153));
        chika_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Arrow-next-2-icon.png"))); // NOI18N
        chika_search.setText("SEARCH");
        chika_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chika_searchActionPerformed(evt);
            }
        });
        getContentPane().add(chika_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, 45));

        chika_lihat.setBackground(new java.awt.Color(0, 153, 153));
        chika_lihat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button-round-arrow-right-icon.png"))); // NOI18N
        chika_lihat.setText("LIHAT");
        chika_lihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chika_lihatActionPerformed(evt);
            }
        });
        getContentPane().add(chika_lihat, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, 50));

        chika_hapus.setBackground(new java.awt.Color(0, 153, 153));
        chika_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete.png"))); // NOI18N
        chika_hapus.setText("HAPUS");
        chika_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chika_hapusActionPerformed(evt);
            }
        });
        getContentPane().add(chika_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 280, 110, 45));

        chika_menu.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        chika_menu.setText("MENU");
        chika_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chika_menuActionPerformed(evt);
            }
        });
        getContentPane().add(chika_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/sekul img.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 740, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void chika_nimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chika_nimActionPerformed
        // TODO add your handling code here:
              try {
                res = stat.executeQuery("select * from mahasiswa where " + "Nim='" + chika_nim.getText() + "'"); 
                // Menjalankan query SQL untuk memilih semua kolom dari tabel mahasiswa di mana Nim sesuai dengan input dari chika_nim
                while (res.next()) { // Melakukan iterasi melalui hasil query
                chika_nama.setText(res.getString("Nama")); // Mengisi field teks chika_nama dengan nilai dari kolom "Nama" pada hasil query
                chika_jk.setSelectedItem(res.getString("JenisKelamin")); // Mengatur item yang dipilih pada JComboBox chika_jk sesuai dengan nilai dari kolom "JenisKelamin" pada hasil query
                chika_nohp.setText(res.getString("NoHp")); // Mengisi field teks chika_nohp dengan nilai dari kolom "NoHp" pada hasil query
                chika_alamat.setText(res.getString("Alamat")); // Mengisi field teks chika_alamat dengan nilai dari kolom "Alamat" pada hasil query
                }    
                    } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e); // Menampilkan pesan dialog jika terjadi kesalahan selama eksekusi query
                    }
    }//GEN-LAST:event_chika_nimActionPerformed


    private void chika_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chika_editActionPerformed
        // TODO add your handling code here
         if (chika_nim.getText().isEmpty() || chika_nama.getText().isEmpty() ||
            chika_jk.getSelectedItem() == null || chika_nohp.getText().isEmpty() ||
            chika_alamat.getText().isEmpty()) {
            // Memeriksa apakah ada field yang kosong. Jika ada, tampilkan pesan peringatan dan keluar dari metode.
            JOptionPane.showMessageDialog(null, "Semua field harus diisi untuk mengedit data!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return; // Keluar dari metode jika ada field yang kosong
            }

            int ok = JOptionPane.showConfirmDialog(null, "Apakah yakin ingin mengedit data?", "Confirmation", JOptionPane.YES_NO_OPTION);
            // Menampilkan dialog konfirmasi untuk memastikan apakah pengguna yakin ingin mengedit data

        try {
            String sql = "update mahasiswa set Nim=?, Nama=?, JenisKelamin=?, NoHp=?, Alamat=? where Nim='"
            + chika_nim.getText() + "'"; // Membuat query SQL untuk mengupdate data mahasiswa berdasarkan Nim
            java.sql.PreparedStatement st = con.prepareStatement(sql); // Membuat PreparedStatement untuk eksekusi query

            if (ok == JOptionPane.YES_OPTION) { // Memeriksa apakah pengguna memilih 'Yes' dalam dialog konfirmasi
        try {
            st.setString(1, chika_nim.getText()); // Mengatur parameter pertama (Nim) dalam query
            st.setString(2, chika_nama.getText()); // Mengatur parameter kedua (Nama) dalam query
            st.setString(3, (String) chika_jk.getSelectedItem()); // Mengatur parameter ketiga (JenisKelamin) dalam query
            st.setString(4, chika_nohp.getText()); // Mengatur parameter keempat (NoHp) dalam query
            st.setString(5, chika_alamat.getText()); // Mengatur parameter kelima (Alamat) dalam query
            st.executeUpdate(); // Menjalankan update query
            kosongkan(); // Memanggil metode untuk mengosongkan field input
            JOptionPane.showMessageDialog(null, "Edit Data Sukses"); // Menampilkan pesan sukses
            new Mahasiswa().setVisible(true); // Membuka jendela Mahasiswa yang baru
            dispose(); // Menutup jendela saat ini
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Edit Data Gagal"); // Menampilkan pesan error jika terjadi kesalahan saat mengedit data
                }
            }
        }  catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Terjadi kesalahan pada koneksi atau query SQL", "Error", JOptionPane.ERROR_MESSAGE); 
    // Menampilkan pesan error jika terjadi kesalahan pada koneksi atau query SQL
     }
    }//GEN-LAST:event_chika_editActionPerformed

    private void chika_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chika_hapusActionPerformed
        // TODO add your handling code here:
            if (chika_nim.getText().isEmpty() || 
    chika_nama.getText().isEmpty() || 
    chika_jk.getSelectedItem() == null || 
    chika_nohp.getText().isEmpty() || 
    chika_alamat.getText().isEmpty()) {
    // Memeriksa apakah ada field yang kosong. Jika ada, tampilkan pesan peringatan dan keluar dari metode.
    JOptionPane.showMessageDialog(null, "Semua field harus diisi untuk menghapus data!", "Peringatan", JOptionPane.WARNING_MESSAGE);
    return; // Keluar dari metode jika ada field yang kosong
}

// Cek apakah data ada di tabel
boolean dataFound = false;
try {
    String sqlCheck = "SELECT * FROM mahasiswa WHERE Nim = ?"; // Membuat query SQL untuk memeriksa apakah Nim ada di tabel mahasiswa
    java.sql.PreparedStatement stCheck = con.prepareStatement(sqlCheck); // Membuat PreparedStatement untuk query pengecekan
    stCheck.setString(1, chika_nim.getText()); // Mengatur nilai parameter pertama (Nim)
    java.sql.ResultSet rs = stCheck.executeQuery(); // Menjalankan query pengecekan
    if (rs.next()) {
        dataFound = true; // Jika hasil query ada, berarti data ditemukan
    }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Gagal memeriksa data: " + e.getMessage()); // Menampilkan pesan error jika gagal memeriksa data
}

if (!dataFound) {
    // Jika data tidak ditemukan, tampilkan pesan error dan keluar dari metode
    JOptionPane.showMessageDialog(null, "Data tidak ditemukan di tabel mahasiswa!", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

int ok = JOptionPane.showConfirmDialog(null, "Apakah yakin ingin menghapus?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
// Menampilkan dialog konfirmasi untuk memastikan apakah pengguna yakin ingin menghapus data

if (ok == JOptionPane.YES_OPTION) { // Memeriksa apakah pengguna memilih 'Yes' dalam dialog konfirmasi
    try {
        String sql = "DELETE FROM mahasiswa WHERE Nim = ?"; // Membuat query SQL untuk menghapus data berdasarkan Nim
        java.sql.PreparedStatement st = con.prepareStatement(sql); // Membuat PreparedStatement untuk query penghapusan
        st.setString(1, chika_nim.getText()); // Mengatur nilai parameter pertama (Nim)
        st.executeUpdate(); // Menjalankan query penghapusan
        kosongkan(); // Memanggil metode untuk mengosongkan field input
        JOptionPane.showMessageDialog(null, "Delete Data Sukses"); // Menampilkan pesan sukses
        new Mahasiswa().setVisible(true); // Membuka jendela Mahasiswa yang baru
        dispose(); // Menutup jendela saat ini
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Delete Data Gagal: " + e.getMessage()); // Menampilkan pesan error jika terjadi kesalahan saat menghapus data
    }
}

    
    }//GEN-LAST:event_chika_hapusActionPerformed

    private void chika_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chika_simpanActionPerformed
        // TODO add your handling code here:
    try {
    // Trim the input to remove leading/trailing whitespace
    String nim = chika_nim.getText().trim(); // Menghapus spasi di awal dan akhir dari input NIM
    String nama = chika_nama.getText().trim(); // Menghapus spasi di awal dan akhir dari input Nama
    String jk = (String) chika_jk.getSelectedItem(); // Mendapatkan item yang dipilih dari JComboBox jenis kelamin
    String nohp = chika_nohp.getText().trim(); // Menghapus spasi di awal dan akhir dari input NoHp
    String alamat = chika_alamat.getText().trim(); // Menghapus spasi di awal dan akhir dari input Alamat

    // Validate that all fields are filled
    if (nim.isEmpty() || nama.isEmpty() || jk == null || nohp.isEmpty() || alamat.isEmpty()) {
        // Menampilkan pesan peringatan jika ada field yang kosong
        JOptionPane.showMessageDialog(null, "Semua field harus diisi untuk menyimpan data!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return; // Keluar dari metode jika ada field yang kosong
    }

    // Validate that NIM is a number
    if (!nim.matches("\\d+")) {
        // Menampilkan pesan peringatan jika NIM bukan angka
        JOptionPane.showMessageDialog(null, "NIM harus berupa angka!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return; // Keluar dari metode jika NIM bukan angka
    }

    // Execute the SQL insert statement
    stat.executeUpdate("insert into mahasiswa values ("
        + "'" + nim + "',"
        + "'" + nama + "',"
        + "'" + jk + "',"
        + "'" + nohp + "',"
        + "'" + alamat + "')");
    // Menjalankan pernyataan SQL untuk menyimpan data mahasiswa ke dalam tabel mahasiswa

    // Clear the form fields
    kosongkan(); // Memanggil metode untuk mengosongkan field input
    
    // Show success message
    JOptionPane.showMessageDialog(null, "Berhasil Menyimpan Data"); // Menampilkan pesan sukses
    new Mahasiswa().setVisible(true); // Membuka jendela Mahasiswa yang baru
    dispose(); // Menutup jendela saat ini
} catch (Exception e) {
    // Menampilkan pesan error jika terjadi kesalahan selama penyimpanan data
    JOptionPane.showMessageDialog(null, "Gagal Menyimpan Data! : " + e);
}

    }//GEN-LAST:event_chika_simpanActionPerformed

    private void chika_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chika_searchActionPerformed
        // TODO add your handling code here:
          if (chika_nim.getText().isEmpty()) {
    // Menampilkan pesan peringatan jika field NIM kosong
    JOptionPane.showMessageDialog(null, "Mohon masukkan NIM untuk mencari", "Peringatan", JOptionPane.WARNING_MESSAGE);
    return; // Keluar dari metode jika field NIM kosong
}

try {
    // Menjalankan query SQL untuk mencari data mahasiswa berdasarkan NIM
    res = stat.executeQuery("SELECT * FROM mahasiswa WHERE Nim='" + chika_nim.getText() + "'");
    
    if (res.next()) {
        // Jika data ditemukan, isi field-field dengan data dari database
        chika_nama.setText(res.getString("Nama")); // Mengisi field Nama
        chika_jk.setSelectedItem(res.getString("JenisKelamin")); // Mengatur item yang dipilih di JComboBox jenis kelamin
        chika_nohp.setText(res.getString("NoHp")); // Mengisi field NoHp
        chika_alamat.setText(res.getString("Alamat")); // Mengisi field Alamat
    } else {
        // Jika data tidak ditemukan, tampilkan pesan peringatan dan kosongkan field-field
        JOptionPane.showMessageDialog(null, "Data tidak ditemukan", "Peringatan", JOptionPane.WARNING_MESSAGE);
        kosongkan(); // Memanggil metode untuk mengosongkan field input
    }
} catch (Exception e) {
    // Menampilkan pesan error jika terjadi kesalahan selama eksekusi query
    JOptionPane.showMessageDialog(rootPane, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
             char chika = evt.getKeyChar(); // Mendapatkan karakter yang ditekan oleh pengguna dari event key
                if (!(Character.isDigit(chika))) { // Mengecek apakah karakter tersebut bukan digit (angka)
                evt.consume(); // Jika karakter bukan digit, event key akan dibatalkan sehingga karakter tersebut tidak akan ditampilkan dalam input
}
    }//GEN-LAST:event_chika_nohpKeyTyped

    private void chika_nimKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chika_nimKeyTyped
        // TODO add your handling code here:
          char chika = evt.getKeyChar(); // Mendapatkan karakter yang ditekan dari event keyboard
            if (!(Character.isDigit(chika))) // Memeriksa apakah karakter yang ditekan bukan digit
                {
            evt.consume(); // Mengabaikan karakter yang ditekan jika bukan digit
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

}
