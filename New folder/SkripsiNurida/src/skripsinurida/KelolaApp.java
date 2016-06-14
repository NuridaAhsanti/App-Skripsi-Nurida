/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package skripsinurida;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author nury
 */
public class KelolaApp extends javax.swing.JFrame {

    private JFileChooser jfc;
    private File file;
    private Image image;
    /**
     * Creates new form KelolaApp
     */
    public KelolaApp() {
        initComponents();
        
        setExtendedState(JFrame.MAXIMIZED_HORIZ); 
        setVisible(true);
        setResizable(false);
        autonomor();
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
        LblFoto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NamaAppKel1 = new javax.swing.JLabel();
        NamaAppKel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        KonstAppKel = new javax.swing.JLabel();
        TipeAppKel = new javax.swing.JLabel();
        VarAppKel = new javax.swing.JLabel();
        BtnSimpan = new javax.swing.JButton();
        SoalAppKel = new javax.swing.JLabel();
        TAKel = new java.awt.TextArea();
        TFno = new javax.swing.JTextField();
        TFNamaKel = new javax.swing.JTextField();
        TFKonstKel = new javax.swing.JTextField();
        TFTipeKel = new javax.swing.JTextField();
        TFVarKel = new javax.swing.JTextField();
        BtnImage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 550));

        jPanel1.setMinimumSize(new java.awt.Dimension(750, 550));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Kelola Soal & Jawaban");

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2.setText("Identitas Jawaban");

        NamaAppKel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        NamaAppKel1.setText("ID");

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

        BtnSimpan.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        BtnSimpan.setText("Simpan");
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });

        SoalAppKel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        SoalAppKel.setText("Soal Algoritma");

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

        TFno.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        TFno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFnoActionPerformed(evt);
            }
        });

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

        BtnImage.setText("Browse Img");
        BtnImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(BtnImage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnSimpan))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TAKel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SoalAppKel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(379, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(199, 199, 199))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TipeAppKel)
                                        .addComponent(KonstAppKel)
                                        .addComponent(VarAppKel))
                                    .addGap(31, 31, 31)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TFKonstKel, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(TFTipeKel, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(TFVarKel, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NamaAppKel)
                                        .addComponent(NamaAppKel1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(TFno, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(TFNamaKel, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(LblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(484, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamaAppKel1)
                    .addComponent(TFno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamaAppKel)
                    .addComponent(TFNamaKel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFKonstKel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KonstAppKel))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipeAppKel)
                    .addComponent(TFTipeKel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VarAppKel)
                    .addComponent(TFVarKel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSimpan)
                    .addComponent(BtnImage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SoalAppKel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TAKel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(LblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(248, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void autonomor(){
    KoneksiDB connection = new KoneksiDB();
        String sql = "select max(id) from appdb";
        try{
            Statement statement = connection.getKoneksi().createStatement();
            ResultSet resultset = statement.executeQuery(sql);
            while (resultset.next()){
                int a = resultset.getInt(1);
                TFno.setText(""+ Integer.toString(a+1));
            }
        }catch (Exception e){
            System.out.println(""+ e.getMessage());
        }

 }
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
         
         KoneksiDB connection = new KoneksiDB();    //pemanggilan kelas KoneksiDB
        ArrayList<String> wordsList = new ArrayList<String>();
         String sCurrentLine;
         int k=0;
         String[] stopwords = new String[2000];
         try {
             FileReader fr = null;
            try {
                fr = new FileReader("D:\\stopwords_id.txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(KelolaApp.class.getName()).log(Level.SEVERE, null, ex);
            }
             BufferedReader br= new BufferedReader(fr);
                 try {
                     while ((sCurrentLine = br.readLine()) != null){
                         stopwords[k]=sCurrentLine;
                         k++;
                     }
                 } catch (IOException ex) {
                     Logger.getLogger(KelolaApp.class.getName()).log(Level.SEVERE, null, ex);
                 }
                for(String word : Kata){
                    wordsList.add(word);
                }
                for(int i = 0; i < wordsList.size(); i++){
                    for(int j = 0; j < k; j++){
                        if(stopwords[j].contains(wordsList.get(i))){
                            wordsList.remove(i);
                        break;
                        }
                    }
                }
                for(String str : wordsList){
                    String id = TFno.getText();
                    String nama = TFNamaKel.getText();
                    String konst = TFKonstKel.getText();
                    String tipe = TFTipeKel.getText();
                    String var = TFVarKel.getText();
                    String foto = LblFoto.getIcon().toString();
                    String query = " insert into appdb(id, nama, konst, tipe, var, kata, foto) values(?,?,?,?,?,?,?)";
                    PreparedStatement preparedStmt = connection.getKoneksi().prepareStatement(query);
                    preparedStmt.setString(1,id);
                    preparedStmt.setString(2,nama);
                    preparedStmt.setString(3,konst);
                    preparedStmt.setString(4,tipe);
                    preparedStmt.setString(5,var);
                    preparedStmt.setString(6,str);
                    preparedStmt.setString(7,foto);
                    preparedStmt.execute();
                }
            } catch (SQLException ex) {
                Logger.getLogger(KelolaApp.class.getName()).log(Level.SEVERE, null, ex);           
             }
         
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void TFnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFnoActionPerformed

    private void BtnImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnImageActionPerformed
        // TODO add your handling code here:
        jfc=new JFileChooser();
        if(jfc.showOpenDialog(LblFoto)==JFileChooser.APPROVE_OPTION){
            
            Toolkit toolkit=Toolkit.getDefaultToolkit();
            Image image=toolkit.getImage(jfc.getSelectedFile().getAbsolutePath());
            Image imagedResized=image.getScaledInstance(200, 250, Image.SCALE_DEFAULT);
            ImageIcon imageIcon=new ImageIcon(imagedResized);
            
            LblFoto.setIcon(imageIcon);
            //TFjudul.setText(jfc.getSelectedFile().getName());
            
            file=new File(jfc.getSelectedFile().getPath()); // file untuk dikopi
        }
    }//GEN-LAST:event_BtnImageActionPerformed

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
    private javax.swing.JButton BtnImage;
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JLabel KonstAppKel;
    private javax.swing.JLabel LblFoto;
    private javax.swing.JLabel NamaAppKel;
    private javax.swing.JLabel NamaAppKel1;
    private javax.swing.JLabel SoalAppKel;
    private java.awt.TextArea TAKel;
    private javax.swing.JTextField TFKonstKel;
    private javax.swing.JTextField TFNamaKel;
    private javax.swing.JTextField TFTipeKel;
    private javax.swing.JTextField TFVarKel;
    private javax.swing.JTextField TFno;
    private javax.swing.JLabel TipeAppKel;
    private javax.swing.JLabel VarAppKel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
