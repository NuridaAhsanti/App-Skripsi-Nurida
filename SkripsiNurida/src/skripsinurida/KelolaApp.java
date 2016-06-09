/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package skripsinurida;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nury
 */
public class KelolaApp extends javax.swing.JFrame {

    DefaultTableModel model;
    /**
     * Creates new form KelolaApp
     */
    public KelolaApp() {
        initComponents();
        
        setExtendedState(JFrame.MAXIMIZED_HORIZ); 
        setVisible(true);
        setResizable(false);
        
    

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NamaAppKel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        KonstAppKel = new javax.swing.JLabel();
        TipeAppKel = new javax.swing.JLabel();
        VarAppKel = new javax.swing.JLabel();
        SoalAppKel = new javax.swing.JLabel();
        TFNamaKel = new javax.swing.JTextField();
        TFKonstKel = new javax.swing.JTextField();
        TFTipeKel = new javax.swing.JTextField();
        TFVarKel = new javax.swing.JTextField();
        TAKel = new java.awt.TextArea();
        BtnSimpan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 550));

        jPanel1.setMinimumSize(new java.awt.Dimension(750, 550));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Kelola Soal & Jawaban");

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2.setText("Identitas Jawaban");

        NamaAppKel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        NamaAppKel.setText("Nama Program");

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3.setText("Deklarasi");

        KonstAppKel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        KonstAppKel.setText("Konstanta");

        TipeAppKel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        TipeAppKel.setText("Tipe Data");

        VarAppKel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        VarAppKel.setText("Variabel");

        SoalAppKel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        SoalAppKel.setText("Soal Algoritma");

        TFNamaKel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        TFNamaKel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNamaKelActionPerformed(evt);
            }
        });

        TFKonstKel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        TFKonstKel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFKonstKelActionPerformed(evt);
            }
        });

        TFTipeKel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        TFTipeKel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFTipeKelActionPerformed(evt);
            }
        });

        TFVarKel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        TFVarKel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFVarKelActionPerformed(evt);
            }
        });

        TAKel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        TAKel.setName(""); // NOI18N
        TAKel.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                TAKelTextValueChanged(evt);
            }
        });
        TAKel.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                TAKelInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        BtnSimpan.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        BtnSimpan.setText("Simpan");
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Kata"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel1)))
                .addContainerGap(152, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SoalAppKel)
                        .addGap(92, 92, 92)
                        .addComponent(BtnSimpan)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TAKel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(219, 219, 219))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NamaAppKel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TFNamaKel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TipeAppKel)
                                            .addComponent(KonstAppKel)
                                            .addComponent(VarAppKel))
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TFKonstKel, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(TFTipeKel, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(TFVarKel, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(20, 20, 20))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NamaAppKel)
                            .addComponent(TFNamaKel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFKonstKel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KonstAppKel))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TipeAppKel)
                            .addComponent(TFTipeKel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VarAppKel)
                            .addComponent(TFVarKel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SoalAppKel)
                    .addComponent(BtnSimpan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TAKel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFVarKelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFVarKelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFVarKelActionPerformed

    private void TFTipeKelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFTipeKelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFTipeKelActionPerformed

    private void TFNamaKelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNamaKelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNamaKelActionPerformed

    private void TFKonstKelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFKonstKelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFKonstKelActionPerformed

    private void TAKelTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_TAKelTextValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_TAKelTextValueChanged

    private void TAKelInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_TAKelInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_TAKelInputMethodTextChanged

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        // TODO add your handling code here:
    String Kalimat = TAKel.getText().toLowerCase(); //koding case folding
         String Kata[] = Kalimat.split(" ");  //pengenalan spasi untuk tokenisasi
         String Head[] = {"Kata"};              // array kata untuk tokenisasi
         Object Data[][] = new Object[1000][1]; // koding tokenisasi
         KoneksiDB connection = new KoneksiDB();    //pemanggilan kelas KoneksiDB
         try {
             for (int x=0; x<Kata.length; x++){     // pengulangan untuk tokenisasi
                Data[x][0] = Kata[x];               // koding tokenisasi
                String query = " insert into kata(kata) values(?)";     //query insert data ke db
                PreparedStatement preparedStmt = connection.getKoneksi().prepareStatement(query);   //koding membantu insert data ke db
                preparedStmt.setString(1,Kata[x]);      //membantu query insert data ke db
                preparedStmt.execute();                 //eksekusi insert data ke db
             }
              
            } catch (SQLException ex) {
                Logger.getLogger(CariJawaban.class.getName()).log(Level.SEVERE, null, ex);           
             }
         model = new DefaultTableModel(Data,Head); //definisi untuk memasukkan kata ke tabel
         jTable1.setModel(model);               //struktur tabel
    }//GEN-LAST:event_BtnSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(KelolaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KelolaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KelolaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KelolaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KelolaApp().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JLabel KonstAppKel;
    private javax.swing.JLabel NamaAppKel;
    private javax.swing.JLabel SoalAppKel;
    private java.awt.TextArea TAKel;
    private javax.swing.JTextField TFKonstKel;
    private javax.swing.JTextField TFNamaKel;
    private javax.swing.JTextField TFTipeKel;
    private javax.swing.JTextField TFVarKel;
    private javax.swing.JLabel TipeAppKel;
    private javax.swing.JLabel VarAppKel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
