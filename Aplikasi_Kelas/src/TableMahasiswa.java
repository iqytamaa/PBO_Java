import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author Rizqy
 */
    public class TableMahasiswa extends javax.swing.JFrame {
    private Connection con;
    private Statement stat;
    private ResultSet res;
    /**
     * Creates new form TableMahasiswa
     */
    public TableMahasiswa() {
        initComponents();
        setTitle("TABLE DATA MAHASISWA");
        koneksi ();
        tabel ();
        chika_table.setAutoCreateRowSorter(true);
    }
    
    private void koneksi (){
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/aplikasikelas?useSSL=false&serverTimezone=UTC", "root", "");
         stat=con.createStatement();
         } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);}
        }
        
        private void tabel (){
        DefaultTableModel t= new DefaultTableModel();
        t.addColumn("Nim");
        t.addColumn("Nama");
        t.addColumn("Jenis Kelamin");
        t.addColumn("No HP");
        t.addColumn("Alamat");
        chika_table.setModel(t); try{ res= stat.executeQuery("select * from mahasiswa");
    while (res.next()) {
        t.addRow(new Object[]{ res.getString("Nim"),
      res.getString("Nama"),
      res.getString("JenisKelamin"),
      res.getString("NoHp"),
      res.getString("Alamat")
        });
    }
}catch (Exception e) {
    JOptionPane.showMessageDialog(rootPane, e);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        chika_table = new javax.swing.JTable();
        chika_back = new javax.swing.JButton();
        chika_mahasiswa = new javax.swing.JButton();
        chika_uangkas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("TABLE MAHASISWA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        chika_table.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        chika_table.setForeground(new java.awt.Color(204, 204, 204));
        chika_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Jenis Kelamin", "No HP", "Alamat"
            }
        ));
        chika_table.setShowGrid(true);
        jScrollPane2.setViewportView(chika_table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 430, 220));

        chika_back.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        chika_back.setText("BACK");
        chika_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chika_backActionPerformed(evt);
            }
        });
        getContentPane().add(chika_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, -1, -1));

        chika_mahasiswa.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        chika_mahasiswa.setText("Mahasiswa");
        chika_mahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chika_mahasiswaActionPerformed(evt);
            }
        });
        getContentPane().add(chika_mahasiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 140, 30));

        chika_uangkas.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        chika_uangkas.setText("Uang Kas");
        chika_uangkas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chika_uangkasActionPerformed(evt);
            }
        });
        getContentPane().add(chika_uangkas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 140, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/sekul img.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    Mahasiswa data = new Mahasiswa();
    private void chika_mahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chika_mahasiswaActionPerformed
        // TODO add your handling code here:
        int index = chika_table.getSelectedRow();
    if (index == -1) {
        JOptionPane.showMessageDialog(this, "Silakan pilih baris terlebih dahulu.");
        return;
    }
    
    TableModel model = chika_table.getModel();
    
    String nim = model.getValueAt(index, 0).toString();
    String nama = model.getValueAt(index, 1).toString();
    String jk = model.getValueAt(index, 2).toString();
    String nohp = model.getValueAt(index, 3).toString();
    String alamat = model.getValueAt(index, 4).toString();
    
    data.setVisible(true);
    data.pack();
    data.setLocationRelativeTo(null);
    data.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    data.chika_nim.setText(nim);
    data.chika_nama.setText(nama);
    data.chika_jk.setSelectedItem(jk);
    data.chika_nohp.setText(nohp);
    data.chika_alamat.setText(alamat);
    dispose();
    }//GEN-LAST:event_chika_mahasiswaActionPerformed

     UangKas mahasiswa = new UangKas();
    private void chika_uangkasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chika_uangkasActionPerformed
        // TODO add your handling code here:
        int index = chika_table.getSelectedRow();
    if (index == -1) {
        JOptionPane.showMessageDialog(this, "Silakan pilih baris terlebih dahulu.");
        return;
    }
    
    TableModel model = chika_table.getModel();
    
    String nama = model.getValueAt(index, 1).toString();
    
    UangKas mahasiswa = new UangKas();
    mahasiswa.setVisible(true);
    mahasiswa.pack();
    mahasiswa.setLocationRelativeTo(null);
    mahasiswa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    // Mengatur nilai nama di komponen chika_nama di frame mahasiswa
    mahasiswa.chika_nama.setText(nama);
    
    dispose();
    }//GEN-LAST:event_chika_uangkasActionPerformed

    private void chika_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chika_backActionPerformed
        // TODO add your handling code here:
        new Mahasiswa().setVisible(true);
        dispose();
    }//GEN-LAST:event_chika_backActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chika_back;
    public javax.swing.JButton chika_mahasiswa;
    private javax.swing.JTable chika_table;
    public javax.swing.JButton chika_uangkas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
