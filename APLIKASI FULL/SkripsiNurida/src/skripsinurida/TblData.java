package skripsinurida;

import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author nury
 */
public final class TblData extends javax.swing.JFrame {
    public TblData() {
        initComponents();
        tampilkandata();
    }

    public KoneksiDB connection = new KoneksiDB();
    private DefaultTableModel tabeldata = new DefaultTableModel();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nama", "Kelas", "Konstanta", "Tipe Data", "Variabel", "Kata", "Soal", "Foto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Tabel Pengetahuan");

        jButton1.setText("Kembali ke Kelola");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 949, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(288, 288, 288)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void tampilkandata() {       
        tabeldata.addColumn("ID");
        tabeldata.addColumn("Nama Program");
        tabeldata.addColumn("Kelas");
        tabeldata.addColumn("Konstanta");
        tabeldata.addColumn("Tipe Data");
        tabeldata.addColumn("Variabel");
        tabeldata.addColumn("Kata");
        tabeldata.addColumn("Soal");
        tabeldata.addColumn("Foto");
        tabeldata.addColumn("Status");
        try {
            String sql = "select * from appdb";
            Statement stat = connection.getKoneksi().createStatement();
            ResultSet res = stat.executeQuery(sql);
            while (res.next()) {
                tabeldata.addRow(new Object[]{
                    res.getString(1),res.getString(2),res.getString(3),
                    res.getString(4),res.getString(5),res.getString(6),
                    res.getString(7),res.getString(8),res.getString(9),
                    res.getString(10)
                });
            }
           jTable1.setModel(tabeldata);
           } catch (Exception e) {
        }
    }
   
    private void transfer(){
        int index = jTable1.getSelectedRow();
        if(index == -1){
            new KelolaApp().show();
            this.dispose();
        }else{
            KelolaApp kel = new KelolaApp();
            TableModel model = jTable1.getModel();
            String id = model.getValueAt(index, 0).toString();
            String nama = model.getValueAt(index, 1).toString();
            String kelas = model.getValueAt(index, 2).toString();
            String konst = model.getValueAt(index, 3).toString();
            String tipe = model.getValueAt(index, 4).toString();
            String var = model.getValueAt(index, 5).toString();
            String soal = model.getValueAt(index, 7).toString();
           
            kel.setVisible(true);
            kel.pack();
            kel.setLocationRelativeTo(null);
            kel.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         
            kel.TFno.setText(id);
            kel.TFNamaKel.setText(nama);
            kel.CBKelas.setSelectedItem(kelas);
            kel.TFKonstKel.setText(konst);
            kel.TFTipeKel.setText(tipe);
            kel.TFVarKel.setText(var);
            kel.TAKel.setText(soal);
           
            try {
                String sql = "select foto from appdb where autoid="+id;
                Statement stat = connection.getKoneksi().createStatement();
                ResultSet res = stat.executeQuery(sql);
                while (res.next()) {
                    byte[] img = res.getBytes("foto");
                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image myimg = im.getScaledInstance(kel.LblFoto.getWidth(), kel.LblFoto.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon newimg = new ImageIcon(myimg);
                    kel.LblFoto.setIcon(newimg);
                }
            } catch (SQLException ex) {
                System.out.print("tidak dapat mengambil gambar");
            }
            this.dispose();
        }
    }
  
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        if (evt.getClickCount() == 2) {
            transfer();
        }
    }//GEN-LAST:event_jTable1MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new KelolaApp().show();
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TblData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TblData().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
