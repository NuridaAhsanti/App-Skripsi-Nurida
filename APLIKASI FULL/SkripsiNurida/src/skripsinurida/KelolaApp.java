package skripsinurida;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author nury
 */
public class KelolaApp extends javax.swing.JFrame {

    public TblData dat = null;
    private JFileChooser jfc;
    private File file;
    private String[] Kata;
    private String str;
    private String sCurrentLine;
    int k = 0;
    private KoneksiDB connection = new KoneksiDB();

    public KelolaApp() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        autonomor();
    }

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
        TFVarKel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CBKelas = new javax.swing.JComboBox();
        BtnEdit = new javax.swing.JButton();
        BtnBatal = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();
        BtnData = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TFKonstKel = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TFTipeKel = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 550));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Kelola Soal & Jawaban");

        LblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblFoto.setText("Klik Untuk Cari Gambar");
        LblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LblFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblFotoMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Identitas Jawaban");

        NamaAppKel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NamaAppKel1.setText("ID");

        NamaAppKel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NamaAppKel.setText("Nama Program");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Deklarasi");

        KonstAppKel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        KonstAppKel.setText("Konstanta");

        TipeAppKel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TipeAppKel.setText("Tipe Data");

        VarAppKel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VarAppKel.setText("Variabel");

        BtnSimpan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnSimpan.setText("Simpan");
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });

        SoalAppKel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SoalAppKel.setText("Soal Algoritma");

        TAKel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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

        TFno.setEditable(false);
        TFno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TFno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFnoActionPerformed(evt);
            }
        });

        TFNamaKel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TFNamaKel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNamaKelActionPerformed(evt);
            }
        });

        TFVarKel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TFVarKel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFVarKelActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Klasifikasi");

        CBKelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Runtunan", "Pemilihan", "Pengulangan" }));
        CBKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBKelasActionPerformed(evt);
            }
        });

        BtnEdit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnEdit.setText("Edit");
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });

        BtnBatal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnBatal.setText("Batal");
        BtnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBatalActionPerformed(evt);
            }
        });

        BtnHapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnHapus.setText("Hapus");
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });

        BtnData.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnData.setText("Lihat Data");
        BtnData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDataActionPerformed(evt);
            }
        });

        TFKonstKel.setColumns(5);
        TFKonstKel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        TFKonstKel.setRows(5);
        TFKonstKel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TFKonstKel.setName(""); // NOI18N
        jScrollPane1.setViewportView(TFKonstKel);

        TFTipeKel.setColumns(5);
        TFTipeKel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        TFTipeKel.setRows(5);
        jScrollPane2.setViewportView(TFTipeKel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(BtnData)
                        .addGap(52, 52, 52)
                        .addComponent(BtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(BtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TAKel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(LblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(SoalAppKel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(KonstAppKel)
                                            .addComponent(VarAppKel)
                                            .addComponent(jLabel5))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addComponent(CBKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(TFVarKel)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(TipeAppKel)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(NamaAppKel)
                                            .addComponent(NamaAppKel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TFno, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TFNamaKel)))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SoalAppKel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(KonstAppKel)
                            .addComponent(TipeAppKel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(VarAppKel)
                                    .addComponent(TFVarKel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TAKel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnHapus)
                    .addComponent(BtnSimpan)
                    .addComponent(BtnEdit)
                    .addComponent(BtnBatal)
                    .addComponent(BtnData))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDataActionPerformed
        new TblData().show();
        this.dispose();
    }//GEN-LAST:event_BtnDataActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        int konf = JOptionPane.showConfirmDialog(null, "Menghapus data ini?", "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
        if (konf == 0) {
            try {
                String sql = "delete from appdb where autoid='" + TFno.getText() + "'";
                PreparedStatement preparedStmt = connection.getKoneksi().prepareStatement(sql);
                preparedStmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Hapus Data Sukses!");
                TFNamaKel.setText("");
                TFKonstKel.setText("");
                TFTipeKel.setText("");
                TFVarKel.setText("");
                TAKel.setText("");
                LblFoto.setIcon(null);
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Hapus Data Gagal!");
            }
        }
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void BtnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBatalActionPerformed
        autonomor();
        TFNamaKel.setText("");
        TFKonstKel.setText("");
        TFTipeKel.setText("");
        TFVarKel.setText("");
        LblFoto.setIcon(null);
    }//GEN-LAST:event_BtnBatalActionPerformed

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
        try {
            tokenisasi();
            filterEdit(str);
            JOptionPane.showMessageDialog(null, "Perubahan Sukses!");
            new KelolaApp().show();
            this.dispose();
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_BtnEditActionPerformed

    private void CBKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBKelasActionPerformed

    private void TFVarKelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFVarKelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFVarKelActionPerformed

    private void TFNamaKelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNamaKelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNamaKelActionPerformed

    private void TFnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFnoActionPerformed

    private void TAKelInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_TAKelInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_TAKelInputMethodTextChanged

    private void TAKelTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_TAKelTextValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_TAKelTextValueChanged

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        try {
            tokenisasi();
            filterInsert(str);
            JOptionPane.showMessageDialog(null, "Data disimpan!");
            new KelolaApp().show();
            this.dispose();
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void LblFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblFotoMouseClicked
        jfc = new JFileChooser();
        if (jfc.showOpenDialog(LblFoto) == JFileChooser.APPROVE_OPTION) {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Image img = toolkit.getImage(jfc.getSelectedFile().getAbsolutePath());
            Image imagedResized = img.getScaledInstance(220, 243, Image.SCALE_DEFAULT);
            ImageIcon imageIcon = new ImageIcon(imagedResized);

            LblFoto.setIcon(imageIcon);
            file = new File(jfc.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_LblFotoMouseClicked

    private void autonomor() {
        String sql = "select max(autoid) from appdb";
        try {
            Statement statement = connection.getKoneksi().createStatement();
            ResultSet resultset = statement.executeQuery(sql);
            while (resultset.next()) {
                int nmr = resultset.getInt(1);
                TFno.setText("" + Integer.toString(nmr + 1));
            }
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
    }

    public void tokenisasi() {
        String Kalimat;
        Kalimat = TAKel.getText().toLowerCase()
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
                .replace("\'", " ").replaceAll("[0-9]", " ")
                .replaceAll("\\n+", " ").replaceAll("\\s+", " ").replaceAll("\\t+", " ");
        Kata = Kalimat.split(" ");
    }

    public String filterInsert(String str) throws SQLException {
        ArrayList<String> wordsList = new ArrayList<>();
        String[] stopwords = new String[2000];
        FileReader fr = null;
        try {
            fr = new FileReader("D:\\stopwords_id.txt");
        } catch (FileNotFoundException ex) {
        }
        BufferedReader br = new BufferedReader(fr);
        try {
            while ((sCurrentLine = br.readLine()) != null) {
                stopwords[k] = sCurrentLine;
                k++;
            }
        } catch (IOException ex) {
        }

        wordsList.addAll(Arrays.asList(Kata));
        for (int i = 0; i < wordsList.size(); i++) {
            for (int j = 0; j < k; j++) {
                if (wordsList.contains(stopwords[j])) {
                    wordsList.remove(stopwords[j]);
                }
            }
        }

        StringBuilder buffer = new StringBuilder();
        boolean processedFirst = false;
        for (String word : wordsList) {
            if (processedFirst) {
                buffer.append(" ");
            }
            buffer.append(Stemming(word));
            processedFirst = true;
        }
        String firstParam = buffer.toString();
        String query1 = "ALTER TABLE appdb AUTO_INCREMENT = 1";
        PreparedStatement preparedStmt1 = connection.getKoneksi().prepareStatement(query1);
        preparedStmt1.executeUpdate();

        FileInputStream fis = null;
        try {
            File img = new File(jfc.getSelectedFile().getPath());
            fis = new FileInputStream(img);

            String nama = TFNamaKel.getText();
            String kelas = CBKelas.getSelectedItem().toString();
            String konst = TFKonstKel.getText();
            String tipe = TFTipeKel.getText();
            String var = TFVarKel.getText();
            String soal = TAKel.getText();

            String query = "INSERT INTO appdb(nama, kelas, konst, tipe, var, kata, soal, foto, status) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStmt = connection.getKoneksi().prepareStatement(query);
            preparedStmt.setString(1, nama);
            preparedStmt.setString(2, kelas);
            preparedStmt.setString(3, konst);
            preparedStmt.setString(4, tipe);
            preparedStmt.setString(5, var);
            preparedStmt.setString(6, firstParam);
            preparedStmt.setString(7, soal);
            preparedStmt.setBinaryStream(8, fis, (long) img.length());
            preparedStmt.setString(9, "Valid");
            preparedStmt.executeUpdate();
        } catch (FileNotFoundException ex) {
        }
        try {
            fis.close();
        } catch (IOException ex) {
        }
        return str;
    }

    public String filterEdit(String str) throws SQLException {
        ArrayList<String> wordsList = new ArrayList<>();
        String[] stopwords = new String[2000];
        FileReader fr = null;
        try {
            fr = new FileReader("D:\\stopwords_id.txt");
        } catch (FileNotFoundException ex) {
        }

        BufferedReader br = new BufferedReader(fr);
        try {
            while ((sCurrentLine = br.readLine()) != null) {
                stopwords[k] = sCurrentLine;
                k++;
            }
        } catch (IOException ex) {
        }

        wordsList.addAll(Arrays.asList(Kata));
        for (int i = 0; i < wordsList.size(); i++) {
            for (int j = 0; j < k; j++) {
                if (wordsList.contains(stopwords[j])) {
                    wordsList.remove(stopwords[j]);
                }
            }
        }
        StringBuilder buffer = new StringBuilder();
        boolean processedFirst = false;
        for (Iterator<String> it = wordsList.iterator(); it.hasNext();) {
            str = it.next();
            if (processedFirst) {
                buffer.append(" ");
            }
            buffer.append(Stemming(str));
            processedFirst = true;
        }
        String firstParam = buffer.toString();

        String id = TFno.getText();
        String nama = TFNamaKel.getText();
        String kelas = CBKelas.getSelectedItem().toString();
        String konst = TFKonstKel.getText();
        String tipe = TFTipeKel.getText();
        String var = TFVarKel.getText();
        String soal = TAKel.getText();

        try {
            File img = new File(jfc.getSelectedFile().getPath());
            if (img.canExecute() == false) {
                throw new NullPointerException();
            } else {
                FileInputStream fis = new FileInputStream(img);
                String query2 = "UPDATE appdb SET nama=?, kelas=?, konst=?, tipe=?, var=?, kata=?, soal=?, foto=?, status=? where autoid=?";
                PreparedStatement preparedStmt = connection.getKoneksi().prepareStatement(query2);
                preparedStmt.setString(1, nama);
                preparedStmt.setString(2, kelas);
                preparedStmt.setString(3, konst);
                preparedStmt.setString(4, tipe);
                preparedStmt.setString(5, var);
                preparedStmt.setString(6, firstParam);
                preparedStmt.setString(7, soal);
                preparedStmt.setBinaryStream(8, fis, (int) img.length());
                preparedStmt.setString(9, "Valid");
                preparedStmt.setString(10, id);
                preparedStmt.executeUpdate();
            }
        } catch (NullPointerException ne) {
            String sql = "select foto from appdb where autoid=" + id;
            Statement stat = connection.getKoneksi().createStatement();
            ResultSet res = stat.executeQuery(sql);
            while (res.next()) {
                InputStream imgku = res.getBinaryStream("foto");
                String query2 = "UPDATE appdb SET nama=?, kelas=?, konst=?, tipe=?, var=?, kata=?, soal=?, foto=?, status=? where autoid=?";
                PreparedStatement preparedStmt = connection.getKoneksi().prepareStatement(query2);
                preparedStmt.setString(1, nama);
                preparedStmt.setString(2, kelas);
                preparedStmt.setString(3, konst);
                preparedStmt.setString(4, tipe);
                preparedStmt.setString(5, var);
                preparedStmt.setString(6, firstParam);
                preparedStmt.setString(7, soal);
                preparedStmt.setBinaryStream(8, imgku);
                preparedStmt.setString(9, "Valid");
                preparedStmt.setString(10, id);
                preparedStmt.executeUpdate();
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showConfirmDialog(null, "Gambar tidak ditemukan!", "Confirmation", JOptionPane.YES_NO_OPTION);
        }
        return str;
    }

    //cek kata di db
    private boolean cek(String str) throws SQLException {
        String sql = "select * from tb_katadasar where katadasar='" + str + "'";
        Statement st = connection.getKoneksi().createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            rs.getString("katadasar");
            return true;
        }
        return false;
    }

    //langkah 1 - hapus partikel
    private String hapusPartikel(String str) throws SQLException {
        if (this.cek(str) == false) {
            if (str.matches("(\\w+)(lah|kah|tah|pun)")) {
                if (str.endsWith("lah") || str.endsWith("kah") || str.endsWith("tah") || str.endsWith("pun")) {
                    str = str.substring(0, str.length() - 3);
                }
            }
        }
        return str;
    }

    //langkah 2 - hapus possesive pronoun
    private String hapusPossesivePronoun(String str) throws SQLException {
        if (this.cek(str) == false) {
            if (str.matches("(\\w+)(ku|mu|nya)")) {
                if (str.endsWith("ku") || str.endsWith("mu")) {
                    str = str.substring(0, str.length() - 2);
                } else if (str.endsWith("nya")) {
                    str = str.substring(0, str.length() - 3);
                }
            }
        }
        return str;
    }

    //langkah 3 hapus first order prefiks (awalan pertama)
    private String hapusFirstOrderPrefiks(String str) throws SQLException {
        if (this.cek(str) == false) {
            if (str.matches("(meng|meny|men|mem|me|peng|peny|pen|pem|di|ter|ke)(\\w+)")) {
                String n = str.substring(0, 4);
                String m = str.substring(4, 5);
                String o = str.substring(0, 3);
                String p = str.substring(3, 4);
                String DP;
                if ("meng".equals(n)) {
                    if ("a".equals(m) || "i".equals(m) || "u".equals(m) || "e".equals(m) || "o".equals(m)) {
                        DP = str.replace(n, "k");
                        return DP;
                    } else {
                        DP = str.replace(n, "");
                        return DP;
                    }
                } else if ("meny".equals(n)) {
                    DP = str.replace(n, "s");
                    return DP;
                } else if ("men".equals(o)) {
                    DP = str.replace(o, "t");
                    if (cek(DP) == true) {
                        return DP;
                    } else {
                        DP = str.replace(o, "");
                        return DP;
                    }
                } else if ("mem".equals(o)) {
                    if ("a".equals(p) || "i".equals(p) || "u".equals(p) || "e".equals(p) || "o".equals(p)) {
                        DP = str.replace(o, "p");
                        return DP;
                    } else {
                        DP = str.replace(o, "");
                        return DP;
                    }
                } else if (str.startsWith("me")) {
                    DP = str.substring(2, str.length());
                    return DP;
                } else if ("peng".equals(n)) {
                    if ("e".equals(m) || "a".equals(m)) {
                        DP = str.replace(m, "k");
                        return DP;
                    } else {
                        DP = str.replace(n, "");
                        return DP;
                    }
                } else if ("peny".equals(n)) {
                    DP = str.replace(n, "s");
                    return DP;
                } else if ("pen".equals(o)) {
                    if ("a".equals(p) || "i".equals(p) || "u".equals(p) || "e".equals(p) || "o".equals(p)) {
                        DP = str.replace(o, "t");
                        return DP;
                    } else {
                        DP = str.replace(o, "");
                        return DP;
                    }
                } else if ("pem".equals(o)) {
                    if ("a".equals(p) || "i".equals(p) || "u".equals(p) || "e".equals(p) || "o".equals(p)) {
                        DP = str.replace(o, "p");
                        return DP;
                    } else {
                        DP = str.replace(o, "");
                        return DP;
                    }
                } else if (str.startsWith("di")) {
                    DP = str.substring(2, str.length());
                    return DP;
                } else if (str.startsWith("ter")) {
                    DP = str.substring(3, str.length());
                    return DP;
                } else if (str.startsWith("ke")) {
                    DP = str.substring(2, str.length());
                    return DP;
                }
            }
        }
        return str;
    }

    //langkah 4 hapus second order prefiks (awalan kedua)
    private String hapusSecondOrderPrefiks(String str) throws SQLException {
        if (this.cek(str) == false) {
            if (str.matches("(ber|bel|be|per|pe|pel|se)(\\w+)")) {
                String DP2;
                if (str.startsWith("ber")) {
                    DP2 = str.substring(3, str.length());
                    return DP2;
                } else if (str.startsWith("bel")) {
                    DP2 = str.substring(3, str.length());
                    return DP2;
                } else if (str.startsWith("be")) {
                    DP2 = str.substring(2, str.length());
                    return DP2;
                } else if (str.startsWith("per") && str.length() > 5) {
                    DP2 = str.substring(3, str.length());
                    return DP2;
                } else if (str.startsWith("pe") && str.length() > 5) {
                    DP2 = str.substring(2, str.length());
                    return DP2;
                } else if (str.startsWith("pel") && str.length() > 5) {
                    DP2 = str.substring(3, str.length());
                    return DP2;
                } else if (str.startsWith("se") && str.length() > 5) {
                    DP2 = str.substring(2, str.length());
                    return DP2;
                }
            }
        }
        return str;
    }

    //langkah 5 hapus suffiks
    private String hapusSuffiks(String str) throws SQLException {
        if (this.cek(str) == false) {
            if (str.endsWith("kan")) {
                str = str.substring(0, str.length() - 3);
            } else if (str.endsWith("i")) {
                str = str.substring(0, str.length() - 1);
            } else if (str.endsWith("an")) {
                str = str.substring(0, str.length() - 2);
            }
        }
        return str;
    }

    //6. Pemanggilan Stemming
    private String Stemming(String str) throws SQLException {
        if (cek(str) == true) {
            return str;
        } else {
            str = hapusPartikel(str);
            str = hapusPossesivePronoun(hapusPartikel(str));
            if (cek(hapusSuffiks(hapusSecondOrderPrefiks(hapusFirstOrderPrefiks(hapusPossesivePronoun(hapusPartikel(str)))))) == true) {

                str = hapusSuffiks(hapusSecondOrderPrefiks(hapusFirstOrderPrefiks(hapusPossesivePronoun(hapusPartikel(str)))));

            } else if (cek(hapusSecondOrderPrefiks(hapusSuffiks(hapusFirstOrderPrefiks(hapusPossesivePronoun(hapusPartikel(str)))))) == true) {

                str = hapusSecondOrderPrefiks(hapusSuffiks(hapusFirstOrderPrefiks(hapusPossesivePronoun(hapusPartikel(str)))));
            }
        }
        return str;
    }

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new KelolaApp().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBatal;
    private javax.swing.JButton BtnData;
    private javax.swing.JButton BtnEdit;
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnSimpan;
    public javax.swing.JComboBox CBKelas;
    private javax.swing.JLabel KonstAppKel;
    public javax.swing.JLabel LblFoto;
    private javax.swing.JLabel NamaAppKel;
    private javax.swing.JLabel NamaAppKel1;
    private javax.swing.JLabel SoalAppKel;
    public java.awt.TextArea TAKel;
    public javax.swing.JTextArea TFKonstKel;
    public javax.swing.JTextField TFNamaKel;
    public javax.swing.JTextArea TFTipeKel;
    public javax.swing.JTextField TFVarKel;
    public javax.swing.JTextField TFno;
    private javax.swing.JLabel TipeAppKel;
    private javax.swing.JLabel VarAppKel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
