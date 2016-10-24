/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contohkoneksi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
/**
 *
 * @author nury
 */
public class CariJawabanBobot extends javax.swing.JFrame {
    
    tutorialKoneksi connection = new tutorialKoneksi();
    private JFileChooser jfc;
    private String[] Kata;
    private String str;
    private String sCurrentLine;
    int k=0;
    private ArrayList<String> ListKata = new ArrayList<>();
    private ArrayList<String> wordsList = new ArrayList<>();
    private String[] stopwords = new String[2000];
    
    /**
     * Creates new form CariJawaban
     */
    public CariJawabanBobot() {
        initComponents();

        setExtendedState(JFrame.MAXIMIZED_HORIZ); 
        setVisible(true);
        setResizable(false);
        autonomor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TACari = new java.awt.TextArea();
        SoalAppKel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NamaAppKel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        KonstAppKel = new javax.swing.JLabel();
        TipeAppKel = new javax.swing.JLabel();
        VarAppKel = new javax.swing.JLabel();
        TFTipeCari = new javax.swing.JTextField();
        TFKonstCari = new javax.swing.JTextField();
        TFNamaCari = new javax.swing.JTextField();
        BtnCari = new javax.swing.JButton();
        BtnNext = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TFSim = new javax.swing.JTextField();
        TFKNN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BtnLihat = new javax.swing.JButton();
        TFno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        LblFoto = new javax.swing.JLabel();
        VarAppKel1 = new javax.swing.JLabel();
        TFVarCari = new javax.swing.JTextField();
        CBKelas = new javax.swing.JComboBox();
        BtnBersih = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(750, 550));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Pencari Jawaban Serupa");

        TACari.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
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

        SoalAppKel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        SoalAppKel.setText("Soal Algoritma");

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
        VarAppKel.setText("Klasifikasi");

        TFTipeCari.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        TFTipeCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFTipeCariActionPerformed(evt);
            }
        });

        TFKonstCari.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        TFKonstCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFKonstCariActionPerformed(evt);
            }
        });

        TFNamaCari.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        TFNamaCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNamaCariActionPerformed(evt);
            }
        });

        BtnCari.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        BtnCari.setText("Cari Jawaban");
        BtnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCariActionPerformed(evt);
            }
        });

        BtnNext.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        BtnNext.setText("Gbr Selanjutnya");
        BtnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnNextMouseClicked(evt);
            }
        });
        BtnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNextActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel4.setText("Hitung Similarity");

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel5.setText("Akurasi KNN");

        TFSim.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N

        TFKNN.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel6.setText("%");

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel7.setText("%");

        BtnLihat.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        BtnLihat.setText("Lihat Gambar");
        BtnLihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLihatActionPerformed(evt);
            }
        });

        TFno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFnoActionPerformed(evt);
            }
        });

        jLabel8.setText("ID");

        VarAppKel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        VarAppKel1.setText("Variabel");

        TFVarCari.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        TFVarCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFVarCariActionPerformed(evt);
            }
        });

        CBKelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Runtunan", "Pemilihan", "Pengulangan", "Runtunan & Pemilihan", "Runtunan & Pengulangan", "Pemilihan & Pengulangan", "Runtunan & Pemilihan & Pengulangan" }));
        CBKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBKelasActionPerformed(evt);
            }
        });

        BtnBersih.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        BtnBersih.setText("Bersihkan Laman");
        BtnBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBersihActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TACari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SoalAppKel)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(58, 58, 58))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(BtnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnBersih, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(VarAppKel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TFVarCari, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TFno, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(VarAppKel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CBKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(NamaAppKel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TFNamaCari, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TipeAppKel)
                                            .addComponent(KonstAppKel))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TFKonstCari, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TFTipeCari, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(LblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BtnNext, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                        .addComponent(BtnLihat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFSim)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TFKNN, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))))
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SoalAppKel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TACari, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBersih, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TFno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NamaAppKel)
                                    .addComponent(TFNamaCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(VarAppKel)
                                    .addComponent(CBKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TFKonstCari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(KonstAppKel))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TipeAppKel)
                                    .addComponent(TFTipeCari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(VarAppKel1)
                                    .addComponent(TFVarCari, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(BtnNext)
                                .addGap(18, 18, 18)
                                .addComponent(BtnLihat)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TFSim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(TFKNN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void autonomor(){
     String sql = "select max(id) from appdb";
     try{
         Statement statement = connection.getKoneksi().createStatement();
         ResultSet resultset = statement.executeQuery(sql);
         while (resultset.next()){
             int nmr = resultset.getInt(1);
             TFno.setText(""+ Integer.toString(nmr+1));
         }
     }catch (Exception e){
         System.out.println(""+ e.getMessage());
     }
 }
 
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
             .replace("~", " ").replace("`", " ")
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
         Logger.getLogger(CariJawabanStemManual1.class.getName()).log(Level.SEVERE, null, ex);
     }
     
     BufferedReader br= new BufferedReader(fr);
     try {
         while ((sCurrentLine = br.readLine()) != null){
             stopwords[k]=sCurrentLine;
             k++;
         }
     } catch (IOException ex) {
         Logger.getLogger(CariJawabanStemManual1.class.getName()).log(Level.SEVERE, null, ex);
     }
     
     wordsList.addAll(Arrays.asList(Kata));
     for(int i = 0; i < wordsList.size(); i++){
         for(int j = 0; j < k; j++){
             if(stopwords[j].contains(wordsList.get(i))){
                 wordsList.remove(i);
                 break;
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
             buffer.append(this.Stemming(str));
             processedFirst = true;
         }
         String firstParam = buffer.toString();
         String soal = TACari.getText();
          String query1 = "ALTER TABLE appindex AUTO_INCREMENT = 1";
          PreparedStatement preparedStmt1 = connection.getKoneksi().prepareStatement(query1);
          preparedStmt1.executeUpdate();
     
         String query = " insert into appindex(Kata,soal) values(?,?)";
         PreparedStatement preparedStmt = connection.getKoneksi().prepareStatement(query);
         preparedStmt.setString(1,firstParam);
         preparedStmt.setString(2,soal);
         preparedStmt.executeUpdate();
     return str;
 }
 
 //1. cek kata di db
 private boolean cek(String str) throws SQLException{
     String sql = "select * from tb_katadasar where katadasar='"+ str +"'";
     Statement st = connection.getKoneksi().createStatement();
     ResultSet rs = st.executeQuery(sql);
     while(rs.next()){
         String hsl = rs.getString("katadasar");
         System.out.print(hsl+" ");
         return true;
     }
     return false;
 }
 
// 2. Buang Infection suffixes (-lah, -kah, -ku, mu, -nya, -pun) 
 private String IS(String str) throws SQLException{
     if(this.cek(str)==false){
         if(str.matches("(\\w+)(lah|kah|ku|mu|nya|pun)")){
             Pattern p = Pattern.compile("(\\w+)(lah|kah|ku|mu|nya|pun)");
             Matcher m = p.matcher(str);
             while (m.find()) {
                 String hsl_IS= m.group(1).replace(p.pattern(), "");
                 return hsl_IS;
             }
         } 
     }
     return str;
}
 
//3. Buang Derivation suffix (-kan, -i, an) 
 private String DS(String str) throws SQLException{
     if(this.cek(str)==false){
         if(str.matches("(\\w+)(kan)")){
             Pattern p = Pattern.compile("(\\w+)(kan)");
             Matcher m = p.matcher(str);
             if (m.find()) {
                 String a = m.group(1).replace(p.pattern(), "");
                 return a;
             }
         }else if(str.matches("(\\w+)(i)")){
             Pattern p2 = Pattern.compile("(\\w+)(i)");
             Matcher m2 = p2.matcher(str);
             if (m2.find()) {
                 String b = m2.group(1).replace(p2.pattern(), "");
                 return b;
             }
         }else if(str.matches("(\\w+)(an)")){
             Pattern p3 = Pattern.compile("(\\w+)(an)");
             Matcher m3 = p3.matcher(str);
             if (m3.find()) {
                 String c = m3.group(1).replace(p3.pattern(), "");
                 return c;
             }
         }
     }
     return str;
 }
 
 // 4. Buang Derivation prefix atau awalan1 
 private String DP(String str) throws SQLException{
     if(this.cek(str)==false){
         if(str.matches("(meng|meny|men|mem|peng|peny|pen|pem)(\\w+)")){
         String n = str.substring(0,4);
         String m = str.substring(4,5);
         String o = str.substring(0,3);
         String p = str.substring(3,4);
         String q = str.substring(0,2);
         
         if("meng".equals(n)){
             if("e".equals(m)||"u".equals(m)){
                 String hsl_DP3 = str.replace(n, "k");
                 return hsl_DP3;
            }else{
                String hsl_DP4 = str.replace(n, "");
                return hsl_DP4; 
                }
            }
         
         else if("meny".equals(n)){
             String hsl_DP5 = str.replace(n, "s");
             return hsl_DP5; 
         }
         
         else if("men".equals(o)){
             String hsl_DP6 = str.replace(o, "t");
             return hsl_DP6; 
         }
         
         else if("mem".equals(o)){
             if("a".equals(p)||"i".equals(p)||"u".equals(p)||"e".equals(p)||"o".equals(p)){
                 String hsl_DP7 = str.replace(o, "p");
                 return hsl_DP7; 
             }else{
                 String hsl_DP8 = str.replace(o, "");
                 return hsl_DP8; 
             }
         }
         
         else if("me".equals(q)){
             String hsl_DP9 = str.replace(q, "");
             return hsl_DP9; 
         }
         
         else if("peng".equals(n)){
             if("e".equals(m)||"a".equals(m)){
                  String hsl_DP10 = str.replace(m, "k");
                  return hsl_DP10; 
             }else{
                  String hsl_DP11 = str.replace(n, "");	
                  return hsl_DP11; 
             }
         }
         
         else if("peny".equals(n)){
             String hsl_DP12 = str.replace(n, "s");
             return hsl_DP12; 
         }
         
         else if("pen".equals(o)){
              if("a".equals(p)||"i".equals(p)||"u".equals(p)||"e".equals(p)||"o".equals(p)){
                  String hsl_DP13 = str.replace(o, "t");
                  return hsl_DP13; 
              }else{
                  String hsl_DP14 = str.replace(o, "");
                  return hsl_DP14; 
              }
         }
         
         else if("pem".equals(o)){
             if("a".equals(p)||"i".equals(p)||"u".equals(p)||"e".equals(p)||"o".equals(p)){
                 String hsl_DP15 = str.replace(o, "p");
                 return hsl_DP15; 
             }else{
                 String hsl_DP16 = str.replace(o, "");
                 return hsl_DP16; 
             }
         }
         
         else if("ter".equals(o)){
             String hsl_DP17 = str.replace(o, "");
             return hsl_DP17; 
         }
         }
     }
     return str;
 }
 
 //5. Buang second order prefiks (awalan kedua)
 private String DP2(String str) throws SQLException{
     if(this.cek(str)==false){
         if(str.matches("(me|di|ke|ber|bel|per|pe|pel|se)(\\w+)")){
             String o = str.substring(0,3);
             String q = str.substring(0,2);
             if("me".equals(q)){
                 String hsl_DP9 = str.replace(q, "");
                 return hsl_DP9;
             }
             
             else if("di".equals(q)){
                 String hsl_DP17 = str.replace(q, "");
                 return hsl_DP17;
             }
             
             else if("ke".equals(q)){
                 String hsl_DP18 = str.replace(q, "");
                 return hsl_DP18;
             }
             
             else if("be".equals(q)){
                 String hsl_DP20 = str.replace(q, "");
                     return hsl_DP20;
             }
             
             else if("ber".equals(o)){
                 String hsl_DP18 = str.replace(o, "");
                 if(this.cek(hsl_DP18)==true){
                     return hsl_DP18; 
                 }
             }
        
             else if("bel".equals(o)){
                 String hsl_DP19 = str.replace(o, "");
                 return hsl_DP19; 
             }
             
             else if("per".equals(o) && str.length() > 5){
                 String hsl_DP21 = str.replace(o, "");
                 return hsl_DP21; 
             }
        
             else if("pe".equals(q) && str.length() > 5){
                 String hsl_DP22 = str.replace(q, "");
                 return hsl_DP22; 
             }
         
             else if("pel".equals(o) && str.length() > 5){
                 String hsl_DP23 = str.replace(o, "");
                 return hsl_DP23; 
             }
             else if("se".equals(q) && str.length() > 5){
                 String hsl_DP24 = str.replace(q, "");
                 return hsl_DP24; 
             }
         }
     }
     return str;
 }
 
 //6. Pemanggilan Stemming
 private String Stemming(String str) throws SQLException{
     if(this.cek(str)==true){
        return str;
    } 
    str = this.IS(str);
    str = this.DP(str);
    str = this.DP2(str);
    str = this.DS(str);
    return str;
 }
 
 private String buatIndex() throws SQLException{
     String query0 = "TRUNCATE TABLE appindex";
     PreparedStatement preparedStmt0 = connection.getKoneksi().prepareStatement(query0);
     preparedStmt0.executeUpdate();
     
     String query1 = "ALTER TABLE appindex AUTO_INCREMENT = 1";
     PreparedStatement preparedStmt1 = connection.getKoneksi().prepareStatement(query1);
     preparedStmt1.executeUpdate();
     
     String query2 = "INSERT INTO appindex(Kata,soal) SELECT kata,soal FROM appdb";
     PreparedStatement preparedStmt2 = connection.getKoneksi().prepareStatement(query2);
     preparedStmt2.executeUpdate();
     
     return null;
 }
 
private void tfidfParser(){
    DocumentParser1 dp = new DocumentParser1();
        try {
            dp.parseFiles();
            dp.tfIdfCalculator();
            dp.getCosineSimilarity();
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CariJawabanBobot.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | SQLException ex) {
            Logger.getLogger(CariJawabanBobot.class.getName()).log(Level.SEVERE, null, ex);
        }
} 

    private void TACariTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_TACariTextValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_TACariTextValueChanged

    private void TACariInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_TACariInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_TACariInputMethodTextChanged

    private void TFTipeCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFTipeCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFTipeCariActionPerformed

    private void TFKonstCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFKonstCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFKonstCariActionPerformed

    private void TFNamaCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNamaCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNamaCariActionPerformed

    private void BtnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCariActionPerformed
        try {
            this.buatIndex();
            this.filter(str);
            this.tfidfParser();
            /*Statement st = connection.getKoneksi().createStatement();
            ResultSet rs1 = st.executeQuery("SELECT * FROM appindex ORDER BY SimDocAkhir DESC");
            while(rs1.next()){
               TACari.setText(rs1.getString("kata"));
            }*/
            
            Statement st1 = connection.getKoneksi().createStatement();
            String query ="SELECT id, nama, kelas, konst, tipe, var, SimDocAkhir from appdb inner join appindex on appdb.autoid = appindex.autoid ORDER BY SimDocAkhir";
            ResultSet rs1 = st1.executeQuery(query);
            while (rs1.next()) {
                String nmr = rs1.getString("id");
                String nama = rs1.getString("nama");
                String kelas = rs1.getString("kelas");
                String konst = rs1.getString("konst");
                String tipe = rs1.getString("tipe");
                String var = rs1.getString("var");
                String sim = rs1.getString("SimDocAkhir");
                
                TFno.setText(nmr);
                TFNamaCari.setText(nama);
                CBKelas.setSelectedItem(kelas);
                TFKonstCari.setText(konst);
                TFTipeCari.setText(tipe);
                TFVarCari.setText(var);
                TFSim.setText(sim);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CariJawabanBobot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnCariActionPerformed

    
    private void BtnLihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLihatActionPerformed
        // TODO add your handling code here:
       try{
         Statement st = connection.getKoneksi().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs1 = st.executeQuery("SELECT * FROM appindex ORDER BY SimDocAkhir");
            if(rs1.next()){
                String soal = rs1.getString("Dokumen");
                TFNamaCari.setText(soal);
            }
    } catch (SQLException ex) {
            Logger.getLogger(CariJawabanBobot.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_BtnLihatActionPerformed

    private void TFnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFnoActionPerformed

    private void TFVarCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFVarCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFVarCariActionPerformed

    private void CBKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBKelasActionPerformed

    private void BtnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNextActionPerformed
        Object obj = evt.getSource();
                Connection con;
                ResultSet rs;
                Statement stm;
        try{
            Statement st = connection.getKoneksi().createStatement();
            String sql = "SELECT * FROM appdb";
            st.executeQuery(sql);
            ResultSet rs1 = st.getResultSet();
            if(rs1.next()){
                String nmr = rs1.getString("id");
                String nama = rs1.getString("nama");
                String kelas = rs1.getString("kelas");
                String konst = rs1.getString("konst");
                String tipe = rs1.getString("tipe");
                String var = rs1.getString("var");
                String soal = rs1.getString("soal");
                //java.sql.Blob foto = rs1.getBlob(soal);
                System.out.print(soal);
                TFno.setText(nmr);
                TFNamaCari.setText(nama);
                CBKelas.setSelectedItem(kelas);
                TFKonstCari.setText(konst);
                TFTipeCari.setText(tipe);
                TFVarCari.setText(var);
                TACari.setText(soal);
                //LblFoto.setIcon(foto);
            }else{
                rs1.previous();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_BtnNextActionPerformed
 
    private void BtnNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNextMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_BtnNextMouseClicked

    private void BtnBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBersihActionPerformed
        // TODO add your handling code here:
        new CariJawabanBobot().show();
            this.dispose();
        /*TFno.setText("");
        TFNamaCari.setText("");
        CBKelas.setSelectedItem("");
        TFKonstCari.setText("");
        TFTipeCari.setText("");
        TFVarCari.setText("");
        TACari.setText("");
        TACari.setText("");
        TFSim.setText("");*/
    }//GEN-LAST:event_BtnBersihActionPerformed

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
            java.util.logging.Logger.getLogger(CariJawabanBobot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CariJawabanBobot().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBersih;
    private javax.swing.JButton BtnCari;
    private javax.swing.JButton BtnLihat;
    private javax.swing.JButton BtnNext;
    private javax.swing.JComboBox CBKelas;
    private javax.swing.JLabel KonstAppKel;
    private javax.swing.JLabel LblFoto;
    private javax.swing.JLabel NamaAppKel;
    private javax.swing.JLabel SoalAppKel;
    private java.awt.TextArea TACari;
    private javax.swing.JTextField TFKNN;
    private javax.swing.JTextField TFKonstCari;
    private javax.swing.JTextField TFNamaCari;
    private javax.swing.JTextField TFSim;
    private javax.swing.JTextField TFTipeCari;
    private javax.swing.JTextField TFVarCari;
    private javax.swing.JTextField TFno;
    private javax.swing.JLabel TipeAppKel;
    private javax.swing.JLabel VarAppKel;
    private javax.swing.JLabel VarAppKel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
}
