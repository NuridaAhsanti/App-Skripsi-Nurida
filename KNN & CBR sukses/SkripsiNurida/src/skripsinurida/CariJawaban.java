package skripsinurida;

import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author nury
 */
public class CariJawaban extends javax.swing.JFrame {
    KoneksiDB connection = new KoneksiDB();
    private String[] Kata;
    private String str;
    private String sCurrentLine;
    int k=0;
    private ArrayList<String> wordsList = new ArrayList<>();
    private String[] stopwords = new String[2000];
    
public CariJawaban() {
    initComponents();
    setExtendedState(JFrame.MAXIMIZED_HORIZ);
    setVisible(true);
    setResizable(false);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TACari = new java.awt.TextArea();
        SoalAppKel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NamaAppKel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        KonstAppKel = new javax.swing.JLabel();
        TipeAppKel = new javax.swing.JLabel();
        TFNamaCari = new javax.swing.JTextField();
        BtnCari = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BtnLihat = new javax.swing.JButton();
        LblFoto = new javax.swing.JLabel();
        VarAppKel1 = new javax.swing.JLabel();
        TFVarCari = new javax.swing.JTextField();
        BtnBersih = new javax.swing.JButton();
        TFKelas = new javax.swing.JTextField();
        RBRek1 = new javax.swing.JRadioButton();
        LblSim = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TFKonstCari = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        TFTipeCari = new javax.swing.JTextArea();
        RBRek2 = new javax.swing.JRadioButton();
        RBRek3 = new javax.swing.JRadioButton();
        RBRek4 = new javax.swing.JRadioButton();
        RBRek5 = new javax.swing.JRadioButton();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 550));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Pencari Jawaban Serupa");

        TACari.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TACari.setName(""); // NOI18N
        TACari.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                TACariTextValueChanged(evt);
            }
        });
        TACari.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                TACariInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        SoalAppKel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SoalAppKel.setText("Soal Algoritma");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Identitas Jawaban");

        NamaAppKel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NamaAppKel.setText("Nama Program");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Deklarasi");

        KonstAppKel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        KonstAppKel.setText("Konstanta");

        TipeAppKel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TipeAppKel.setText("Tipe Data");

        TFNamaCari.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TFNamaCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNamaCariActionPerformed(evt);
            }
        });

        BtnCari.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnCari.setText("Cari Jawaban");
        BtnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCariActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Kemiripan");

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel6.setText("%");

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N

        BtnLihat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnLihat.setText("Ukuran Penuh");
        BtnLihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLihatActionPerformed(evt);
            }
        });

        LblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LblFoto.setMaximumSize(new java.awt.Dimension(150, 150));
        LblFoto.setMinimumSize(new java.awt.Dimension(150, 150));

        VarAppKel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VarAppKel1.setText("Variabel");

        TFVarCari.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TFVarCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFVarCariActionPerformed(evt);
            }
        });

        BtnBersih.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnBersih.setText("Bersihkan Laman");
        BtnBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBersihActionPerformed(evt);
            }
        });

        TFKelas.setEditable(false);
        TFKelas.setBackground(new java.awt.Color(153, 153, 255));
        TFKelas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TFKelas.setText("Klasifikasi");
        TFKelas.setBorder(null);
        TFKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFKelasActionPerformed(evt);
            }
        });

        RBRek1.setBackground(new java.awt.Color(153, 153, 255));
        RBRek1.setText("Rekomendasi 1");
        RBRek1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBRek1ActionPerformed(evt);
            }
        });

        LblSim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblSim.setText("0");

        TFKonstCari.setColumns(3);
        TFKonstCari.setRows(5);
        jScrollPane2.setViewportView(TFKonstCari);

        TFTipeCari.setColumns(3);
        TFTipeCari.setRows(5);
        jScrollPane4.setViewportView(TFTipeCari);

        RBRek2.setBackground(new java.awt.Color(153, 153, 255));
        RBRek2.setText("Rekomendasi 2");
        RBRek2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBRek2ActionPerformed(evt);
            }
        });

        RBRek3.setBackground(new java.awt.Color(153, 153, 255));
        RBRek3.setText("Rekomendasi 3");
        RBRek3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBRek3ActionPerformed(evt);
            }
        });

        RBRek4.setBackground(new java.awt.Color(153, 153, 255));
        RBRek4.setText("Rekomendasi 4");
        RBRek4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBRek4ActionPerformed(evt);
            }
        });

        RBRek5.setBackground(new java.awt.Color(153, 153, 255));
        RBRek5.setText("Rekomendasi 5");
        RBRek5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBRek5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(199, 199, 199))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TFKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(BtnBersih, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SoalAppKel)
                            .addComponent(TACari, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NamaAppKel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFNamaCari))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(VarAppKel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFVarCari, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(KonstAppKel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TipeAppKel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LblSim, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addComponent(RBRek1)
                            .addComponent(RBRek2)
                            .addComponent(RBRek3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(RBRek5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RBRek4, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(BtnLihat, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SoalAppKel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TACari, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBersih, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(239, 239, 239)
                                .addComponent(jLabel7)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(LblSim, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RBRek1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RBRek2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RBRek3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RBRek4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RBRek5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BtnLihat)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(LblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(20, 20, 20))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(TFKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TFNamaCari, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NamaAppKel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(KonstAppKel)
                                    .addComponent(TipeAppKel)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFVarCari, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VarAppKel1))
                        .addGap(20, 20, 20))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RBRek1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBRek1ActionPerformed
        RBRek2.setSelected(false);
        RBRek3.setSelected(false);
        RBRek4.setSelected(false);
        RBRek5.setSelected(false);
        try {
            tampil();
            klasifikasi();
            initListener();
        } catch (SQLException ex) {
            Logger.getLogger(CariJawaban.class.getName()).log(Level.SEVERE, null, ex);
        }           
    }//GEN-LAST:event_RBRek1ActionPerformed

    private void TFKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFKelasActionPerformed

    private void BtnBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBersihActionPerformed
        new CariJawaban().show();
        this.dispose();
    }//GEN-LAST:event_BtnBersihActionPerformed

    private void TFVarCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFVarCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFVarCariActionPerformed

    private void BtnLihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLihatActionPerformed
       
    }//GEN-LAST:event_BtnLihatActionPerformed

    private void BtnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCariActionPerformed
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        try {
            buatIndex();
            filter(str);
            tfidfParser();
            tampil();
            klasifikasi();
            initListener();
            
        } catch (SQLException ex) {
            Logger.getLogger(CariJawaban.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnCariActionPerformed

    private void TFNamaCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNamaCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNamaCariActionPerformed

    private void TACariInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_TACariInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_TACariInputMethodTextChanged

    private void TACariTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_TACariTextValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_TACariTextValueChanged

    private void RBRek2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBRek2ActionPerformed
        RBRek1.setSelected(false);
        RBRek3.setSelected(false);
        RBRek4.setSelected(false);
        RBRek5.setSelected(false);
         try {
             Statement st1 = connection.getKoneksi().createStatement();
             String query1 = "SELECT nama, konst, tipe, var, foto, SimDocAkhir from appdb "
                + "inner join appindex on appdb.autoid = appindex.autoid ORDER BY SimDocAkhir";
             ResultSet rs1;
             rs1 = st1.executeQuery(query1);
             
             while (rs1.next()) {
                 String nama = rs1.getString("nama");
                 String konst = rs1.getString("konst");
                 String tipe = rs1.getString("tipe");
                 String var = rs1.getString("var");
                 Double sim = rs1.getDouble("SimDocAkhir");
                 Double percent = sim*100;
                 DecimalFormat df = new DecimalFormat("#.###");
                 byte[] img = rs1.getBytes("foto");
                 ImageIcon image = new ImageIcon(img);
                 Image im = image.getImage();
                 Image myimg = im.getScaledInstance(LblFoto.getWidth(), LblFoto.getHeight(), Image.SCALE_SMOOTH);
                 ImageIcon newimg = new ImageIcon(myimg);
                 
                 TFNamaCari.setText(nama);
                 TFKonstCari.setText(konst);
                 TFTipeCari.setText(tipe);
                 TFVarCari.setText(var);
                 LblSim.setText(df.format(percent).toString());
                 LblFoto.setIcon(newimg);
             }
         } catch (SQLException ex) {}
           
    }//GEN-LAST:event_RBRek2ActionPerformed

    private void RBRek3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBRek3ActionPerformed
        RBRek1.setSelected(false);
        RBRek2.setSelected(false);
        RBRek4.setSelected(false);
        RBRek5.setSelected(false);
    }//GEN-LAST:event_RBRek3ActionPerformed

    private void RBRek4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBRek4ActionPerformed
        RBRek1.setSelected(false);
        RBRek3.setSelected(false);
        RBRek3.setSelected(false);
        RBRek5.setSelected(false);
    }//GEN-LAST:event_RBRek4ActionPerformed

    private void RBRek5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBRek5ActionPerformed
        RBRek1.setSelected(false);
        RBRek2.setSelected(false);
        RBRek3.setSelected(false);
        RBRek4.setSelected(false);
    }//GEN-LAST:event_RBRek5ActionPerformed
    
    public void tokenisasi(){
        String Kalimat = TACari.getText().toLowerCase()
                .replace("!", " ").replace("@", " ").replace("#", " ")
                .replace("$", " ").replace("%", " ").replace("^", " ")
                .replace("&", " ").replace("*", " ").replace("(", " ")
                .replace(")", " ").replace("-", " ").replace("_", " ")
                .replace("=", " ").replace("+", " ").replace("{", " ")
                .replace("[", " ").replace("}", " ").replace("]", " ")
                .replace(";", " ").replace(":", " ").replace("'", " ")
                .replace(",", " ").replace("<", " ").replace(".", " ")
                .replace(">", " ").replace("/", " ").replace("?", " ")
                .replace("~", " ").replace("`", " ").replace("\"", " ")
                .replaceAll("0", " ").replaceAll("1", " ")
                .replaceAll("2", " ").replaceAll("3", " ")
                .replaceAll("4", " ").replaceAll("5", " ")
                .replaceAll("6", " ").replaceAll("7", " ")
                .replaceAll("8", " ").replaceAll("9", " ")
                .replaceAll("\\n+", " ").replaceAll("\\s+", " ");
       Kata = Kalimat.split(" ");
    }
       
    public String filter(String str) throws SQLException{
       tokenisasi();
       FileReader fr = null;
       try {
           fr = new FileReader("D:\\stopwords_id.txt");
       } catch (FileNotFoundException ex) {
       }

       BufferedReader br= new BufferedReader(fr);
       try {
           while ((sCurrentLine = br.readLine()) != null){
               stopwords[k]=sCurrentLine;
               k++;
           }
       } catch (IOException ex) {
       }

       wordsList.addAll(Arrays.asList(Kata));
       for(int i = 0; i < wordsList.size(); i++){
           for(int j = 0; j < k; j++){
               if(wordsList.contains(stopwords[j])){
                    wordsList.remove(stopwords[j]);
               }
           }
       }

       StringBuilder buffer = new StringBuilder();
           boolean processedFirst = false;
           for (Iterator<String> it = wordsList.iterator(); it.hasNext();) {
               str = it.next();
               if(processedFirst) {
                   buffer.append(" ");
               }
               buffer.append(Stemming(str));
               processedFirst = true;
           }
           
           String firstParam = buffer.toString();
           String query1 = "ALTER TABLE appindex AUTO_INCREMENT = 1";
           PreparedStatement preparedStmt1 = connection.getKoneksi().prepareStatement(query1);
           preparedStmt1.executeUpdate();

           String query = "insert into appindex(Kata) values(?)";
           PreparedStatement preparedStmt = connection.getKoneksi().prepareStatement(query);
           preparedStmt.setString(1,firstParam);
           preparedStmt.executeUpdate();
           return str;
    }

    //cek kata di db
    private boolean cek(String str) throws SQLException{
         String sql = "select * from tb_katadasar where katadasar='"+ str +"'";
         Statement st = connection.getKoneksi().createStatement();
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
             rs.getString("katadasar");
             return true;
         }
         return false;
     }
    
    //langkah 1 - hapus partikel
    private String hapusPartikel(String str) throws SQLException{
        if(this.cek(str)==false){
            if(str.matches("(\\w+)(lah|kah|tah|pun)")){
                if (str.endsWith("lah") || str.endsWith("kah") || str.endsWith("tah") || str.endsWith("pun")) {
                    str = str.substring(0, str.length() - 3);
                }
            }
        }
        return str;
    }
    
    //langkah 2 - hapus possesive pronoun
    private String hapusPossesivePronoun(String str) throws SQLException{
        if(this.cek(str)==false){
            if(str.matches("(\\w+)(ku|mu|nya)")){
                if(str.endsWith("ku") || str.endsWith("mu")){
                    str = str.substring(0, str.length() - 2);
                }
                if(str.endsWith("nya")){
                 str = str.substring(0, str.length() - 3);
                }
            }
        }
        return str;
    }
    
   //langkah 3 hapus first order prefiks (awalan pertama)
    private String hapusFirstOrderPrefiks(String str) throws SQLException{
        if(this.cek(str)==false){
            if(str.matches("(meng|meny|men|mem|me|peng|peny|pen|pem|di|ter|ke)(\\w+)")){
                String n = str.substring(0,4);
                String m = str.substring(4,5);
                String o = str.substring(0,3);
                String p = str.substring(3,4);
                String DP;
                if("meng".equals(n)){
                    if("a".equals(m)||"i".equals(m)||"u".equals(m)||"e".equals(m)||"o".equals(m)){
                        DP = str.replace(n, "k");
                        return DP;
                    }else{
                        DP = str.replace(n, "");
                        return DP;
                    }
                }

                else if("meny".equals(n)){
                    DP = str.replace(n, "s");
                    return DP;
                }

                else if("men".equals(o)){
                    DP = str.replace(o, "t");
                    if(cek(DP)==true){
                        return DP;
                    }else{
                        DP = str.replace(o, "");
                        return DP;
                    }
                }

                else if("mem".equals(o)){
                    if("a".equals(p)||"i".equals(p)||"u".equals(p)||"e".equals(p)||"o".equals(p)){
                        DP = str.replace(o, "p");
                        return DP;
                    }else{
                        DP = str.replace(o, "");
                        return DP;
                    }
                }

                else if (str.startsWith("me")){
                    DP = str.substring(2, str.length());
                    return DP;
                }

                else if("peng".equals(n)){
                    if("e".equals(m)||"a".equals(m)){
                        DP = str.replace(m, "k");
                        return DP;
                    }else{
                         DP = str.replace(n, "");	
                         return DP;
                    }
                }

                else if("peny".equals(n)){
                    DP = str.replace(n, "s");
                    return DP;
                }

                else if("pen".equals(o)){
                     if("a".equals(p)||"i".equals(p)||"u".equals(p)||"e".equals(p)||"o".equals(p)){
                         DP = str.replace(o, "t");
                         return DP;
                     }else{
                         DP = str.replace(o, "");
                         return DP;
                     }
                }

                else if("pem".equals(o)){
                    if("a".equals(p)||"i".equals(p)||"u".equals(p)||"e".equals(p)||"o".equals(p)){
                        DP = str.replace(o, "p");
                        return DP;
                    }else{
                        DP = str.replace(o, "");
                        return DP;
                    }
                }

                else if (str.startsWith("di")){
                    DP = str.substring(2, str.length());
                    return DP;
                }

                else if (str.startsWith("ter")){
                    DP = str.substring(3, str.length());
                    return DP;
                }

                else if (str.startsWith("ke")){
                    DP = str.substring(2, str.length());
                    return DP;
                }
            }
        }
        return str;
    }

    //langkah 4 hapus second order prefiks (awalan kedua)
    private String hapusSecondOrderPrefiks(String str) throws SQLException{
        if(this.cek(str)==false){
            if(str.matches("(ber|bel|be|per|pe|pel|se)(\\w+)")){
                String DP2;
                if (str.startsWith("ber")){
                    DP2 = str.substring(3, str.length());
                    return DP2;
                }

                else if (str.startsWith("bel")){
                    DP2 = str.substring(3, str.length());
                    return DP2;
                }

                else if (str.startsWith("be")){
                    DP2 = str.substring(2, str.length());
                    return DP2;
                }

                else if (str.startsWith("per") && str.length()>5){
                    DP2 = str.substring(3, str.length());
                    return DP2;
                }

                else if (str.startsWith("pe") && str.length()>5){
                    DP2 = str.substring(2, str.length());
                    return DP2;
                }

                 else if (str.startsWith("pel") && str.length()>5){
                    DP2 = str.substring(3, str.length());
                    return DP2;
                }

                else if (str.startsWith("se") && str.length()>5){
                    DP2 = str.substring(2, str.length());
                    return DP2;
                }
            }
        }
        return str;
    }

    //langkah 5 hapus suffiks
    private String hapusSuffiks(String str) throws SQLException{
        if(this.cek(str)==false){
            if(str.endsWith("kan")){
                str = str.substring(0, str.length() - 3);
            }else if(str.endsWith("i")){
                str = str.substring(0, str.length() - 1);
            }else if(str.endsWith("an")){
                str = str.substring(0, str.length() - 2);
            }
        }
        return str;
    }

    //6. Pemanggilan Stemming
    private String Stemming(String str) throws SQLException{
         if(cek(str)==true){
             return str;
         }else{
            str = hapusPartikel(str);
            str = hapusPossesivePronoun(hapusPartikel(str));
            if(cek(hapusSuffiks(hapusSecondOrderPrefiks(hapusFirstOrderPrefiks(hapusPossesivePronoun(hapusPartikel(str))))))==true){
                str = hapusSuffiks(hapusSecondOrderPrefiks(hapusFirstOrderPrefiks(hapusPossesivePronoun(hapusPartikel(str)))));
            }else if(cek(hapusSecondOrderPrefiks(hapusSuffiks(hapusFirstOrderPrefiks(hapusPossesivePronoun(hapusPartikel(str))))))==true){
                str = hapusSecondOrderPrefiks(hapusSuffiks(hapusFirstOrderPrefiks(hapusPossesivePronoun(hapusPartikel(str)))));
            }
         }
         return str;
     }

    private void buatIndex() throws SQLException{
         String query0 = "TRUNCATE TABLE appindex";
         PreparedStatement preparedStmt0 = connection.getKoneksi().prepareStatement(query0);
         preparedStmt0.executeUpdate();

         String query1 = "ALTER TABLE appindex AUTO_INCREMENT = 1";
         PreparedStatement preparedStmt1 = connection.getKoneksi().prepareStatement(query1);
         preparedStmt1.executeUpdate();

         String query2 = "INSERT INTO appindex(Kata,kelas) SELECT kata,kelas FROM appdb where status = 'Valid'";
         PreparedStatement preparedStmt2 = connection.getKoneksi().prepareStatement(query2);
         preparedStmt2.executeUpdate();

         String query3 = "TRUNCATE TABLE apptfidf";
         PreparedStatement preparedStmt3 = connection.getKoneksi().prepareStatement(query3);
         preparedStmt3.executeUpdate();

     }

    private void tfidfParser(){
        DocumentParser dp = new DocumentParser();
        try {
            dp.parseFiles();
            dp.tfIdfCalculator();
            dp.getCosineSimilarity();
        } catch (FileNotFoundException ex) {
        } catch (IOException | SQLException ex) {
        }
    } 

    private void tampil() throws SQLException{
        Statement st1 = connection.getKoneksi().createStatement();
        String query1 = "SELECT nama, konst, tipe, var, foto, SimDocAkhir from appdb "
                + "inner join appindex on appdb.autoid = appindex.autoid ORDER BY SimDocAkhir";
        ResultSet rs1 = st1.executeQuery(query1);
        while (rs1.next()) {
            String nama = rs1.getString("nama");
            String konst = rs1.getString("konst");
            String tipe = rs1.getString("tipe");
            String var = rs1.getString("var");
            Double sim = rs1.getDouble("SimDocAkhir");
            Double percent = sim*100;
            DecimalFormat df = new DecimalFormat("#.###");
            byte[] img = rs1.getBytes("foto");
            ImageIcon image = new ImageIcon(img);
            Image im = image.getImage();
            Image myimg = im.getScaledInstance(LblFoto.getWidth(), LblFoto.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon newimg = new ImageIcon(myimg);
            
            TFNamaCari.setText(nama);
            TFKonstCari.setText(konst);
            TFTipeCari.setText(tipe);
            TFVarCari.setText(var);
            LblSim.setText(df.format(percent).toString());
            LblFoto.setIcon(newimg);
        }
    }
   
    private void klasifikasi(){
        try {
            int K = 5;
            String query2 = "select autoid, Kelas, count(kelas) as jum from"
                + "(select autoid, Kelas  from  appindex order by SimDocAkhir desc limit " + K + ")"
                + "as a group by Kelas order by jum";
            Statement st2 = connection.getKoneksi().createStatement();
            ResultSet rs2 = st2.executeQuery(query2);
            while (rs2.next()) {
                String kelas = rs2.getString("Kelas");
                TFKelas.setText(kelas);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CariJawaban.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    private void initListener() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                doExit();
            }
        });
    }

    public void doExit() {
       int konf = JOptionPane.showConfirmDialog(null,"Simpan jawaban sebagai pengetahuan baru?", "Confirmation",JOptionPane.YES_NO_OPTION);
            if(konf==0){
                try {
                    Statement st1 = connection.getKoneksi().createStatement();
                    String query1 = "SELECT nama, konst, tipe, var, foto, SimDocAkhir from appdb "
                            + "inner join appindex on appdb.autoid = appindex.autoid ORDER BY SimDocAkhir";
                    ResultSet rs1 = st1.executeQuery(query1);
                    if (rs1.next()) {
                        byte[] img = rs1.getBytes("foto");
                        String query = "ALTER TABLE appdb AUTO_INCREMENT = 1";
                        PreparedStatement preparedStmt = connection.getKoneksi().prepareStatement(query);
                        preparedStmt.executeUpdate();
                        
                        String query2 = "INSERT INTO appdb(nama, kelas, konst, tipe, var, kata, soal, foto, status) VALUES (?,?,?,?,?,?,?,?,?)";
                        PreparedStatement preparedStmt2 = connection.getKoneksi().prepareStatement(query2);
                        preparedStmt2.setString(1,TFNamaCari.getText());
                        preparedStmt2.setString(2,TFKelas.getText());
                        preparedStmt2.setString(3,TFKonstCari.getText());
                        preparedStmt2.setString(4,TFTipeCari.getText());
                        preparedStmt2.setString(5,TFVarCari.getText());
                        preparedStmt2.setString(6,null);
                        preparedStmt2.setString(7,TACari.getText());
                        //preparedStmt2.setString(8,LblSim.getText());
                        preparedStmt2.setBytes(8,img);
                        preparedStmt2.setString(9,"Belum Validasi");
                        preparedStmt2.executeUpdate();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(CariJawaban.class.getName()).log(Level.SEVERE, null, ex);
                }
              
                System.exit(0);
            }else{
                System.exit(0);
            }
    }
    
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
            java.util.logging.Logger.getLogger(CariJawaban.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CariJawaban().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBersih;
    private javax.swing.JButton BtnCari;
    private javax.swing.JButton BtnLihat;
    private javax.swing.JLabel KonstAppKel;
    private javax.swing.JLabel LblFoto;
    private javax.swing.JLabel LblSim;
    private javax.swing.JLabel NamaAppKel;
    private javax.swing.JRadioButton RBRek1;
    private javax.swing.JRadioButton RBRek2;
    private javax.swing.JRadioButton RBRek3;
    private javax.swing.JRadioButton RBRek4;
    private javax.swing.JRadioButton RBRek5;
    private javax.swing.JLabel SoalAppKel;
    private java.awt.TextArea TACari;
    private javax.swing.JTextField TFKelas;
    private javax.swing.JTextArea TFKonstCari;
    private javax.swing.JTextField TFNamaCari;
    private javax.swing.JTextArea TFTipeCari;
    private javax.swing.JTextField TFVarCari;
    private javax.swing.JLabel TipeAppKel;
    private javax.swing.JLabel VarAppKel1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables

    
}
