/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contohkoneksi;

import IndonesianStemmer.IndonesianStemmer;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author nury
 */
public class CariJawabanStemManual extends javax.swing.JFrame {
    private JFileChooser jfc;
    private File file;
    private Image image;
    private Object RegexOptions;
    private String[] Kata;
    private String str;
    private String sCurrentLine;
    int k=0;
    /**
     * Creates new form CariJawaban
     */
    public CariJawabanStemManual() {
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
        BtnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TFCBR = new javax.swing.JTextField();
        TFKNN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BtnLihat = new javax.swing.JButton();
        TFno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Browse = new javax.swing.JButton();
        LblFoto = new javax.swing.JLabel();
        VarAppKel1 = new javax.swing.JLabel();
        TFVarCari = new javax.swing.JTextField();
        CBKelas = new javax.swing.JComboBox();

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
        BtnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNextActionPerformed(evt);
            }
        });

        BtnBack.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        BtnBack.setText("Gbr Sebelumnya");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel4.setText("Akurasi CBR");

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel5.setText("Akurasi KNN");

        TFCBR.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N

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

        Browse.setText("Browse");
        Browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseActionPerformed(evt);
            }
        });

        VarAppKel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        VarAppKel1.setText("Variabel");

        TFVarCari.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        TFVarCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFVarCariActionPerformed(evt);
            }
        });

        CBKelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Runtunan", "Pemilihan", "Pengulangan", "Runtunan & Pemilihan", "Runtunan & Pengulangan", "Pemilihan & Pengulangan", "Runtunan & Pemilihan & Pengulangan" }));

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
                .addGap(32, 32, 32)
                .addComponent(Browse)
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFKNN, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFCBR, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BtnNext, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnBack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnLihat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Browse)))
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
                                .addGap(10, 10, 10)
                                .addComponent(BtnBack)
                                .addGap(10, 10, 10)
                                .addComponent(BtnLihat)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(TFCBR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        tutorialKoneksi connection = new tutorialKoneksi();
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
 
 private void tokenisasi(){
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
                 .replace("~", " ").replace("`", " ").replace("\n", " ")
                 .replace("  ", " ").replace("   ", " ").replace("    ", " ")
                 .replace("     ", " ").replace("      ", " ")
                 .replace("       ", " ").replace("        ", " ")
                 .replace("         ", " ").replace("          ", " ")
                 .replace("           ", " ").replace("            ", " ");
         Kata = Kalimat.split(" ");
 }
 
 public String filter(String str){
     tokenisasi();
     tutorialKoneksi connection = new tutorialKoneksi();
         ArrayList<String> wordsList = new ArrayList<>();
         String[] stopwords = new String[2000];
             FileReader fr = null;
        try {
            fr = new FileReader("D:\\stopwords_id.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CariJawabanStemManual.class.getName()).log(Level.SEVERE, null, ex);
        }
       
             BufferedReader br= new BufferedReader(fr);
        try {       
            while ((sCurrentLine = br.readLine()) != null){
                stopwords[k]=sCurrentLine;
                k++;
            }
        } catch (IOException ex) {
            Logger.getLogger(CariJawabanStemManual.class.getName()).log(Level.SEVERE, null, ex);
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
        for (Iterator<String> it = wordsList.iterator(); it.hasNext();) {
            str = it.next();
          //  System.out.print(str+" ");
            IndonesianStemmer isteam = new IndonesianStemmer();
            if (isteam.findRootWord(str) == null){
                System.out.print(str+" ");
            }
            System.out.println(isteam.findRootWord(str));
        }    
        return str;
 }
 
/* private String stemString(String str) {

     this.filter(null);
     StringBuilder result = new StringBuilder();
    int start = -1;
    for (int j = 0; j < str.length(); j++) {
      char c = str.charAt(j);
      if (Character.isLetterOrDigit(c)) {
	if (start == -1) {
	  start = j;
	}
      } else if (c == '\'') {
	if (start == -1) {
	  result.append(c);
	}
      } else {
	if (start != -1) {
	  result.append(filter(str.substring(start, j)));
	  start = -1;
	}
	result.append(c);
      }
    }
    if (start != -1) {
      result.append(filter(str.substring(start, str.length())));
    }
    return result.toString();  
  }
*/

    private void stem(String str) {
    IndonesianStemmer isteam = new IndonesianStemmer();
    str = "saya memberikan penyampaian sedemikian rupa bagusnya!";
    System.out.println(isteam.findRootWord("rupa"));
  }
 
     private String coba(String cb){
     cb = "nurida";
     System.out.print(cb);
        return null;
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
    //   this.filter(null);
       this.filter(str);
    }//GEN-LAST:event_BtnCariActionPerformed

    private void BtnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnNextActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBackActionPerformed

    private void BtnLihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLihatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnLihatActionPerformed

    private void TFnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFnoActionPerformed

    private void BrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseActionPerformed
        // TODO add your handling code here:
         jfc=new JFileChooser();
        if(jfc.showOpenDialog(LblFoto)==JFileChooser.APPROVE_OPTION){
            
            Toolkit toolkit=Toolkit.getDefaultToolkit();
            Image img=toolkit.getImage(jfc.getSelectedFile().getAbsolutePath());
            Image imagedResized=img.getScaledInstance(200, 250, Image.SCALE_DEFAULT);
            ImageIcon imageIcon=new ImageIcon(imagedResized);
            
            LblFoto.setIcon(imageIcon);
            //TFjudul.setText(jfc.getSelectedFile().getName());
            
            file=new File(jfc.getSelectedFile().getPath()); // file untuk dikopi
        }
    }//GEN-LAST:event_BrowseActionPerformed

    private void TFVarCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFVarCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFVarCariActionPerformed

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
            java.util.logging.Logger.getLogger(CariJawabanStemManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CariJawabanStemManual().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Browse;
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnCari;
    private javax.swing.JButton BtnLihat;
    private javax.swing.JButton BtnNext;
    private javax.swing.JComboBox CBKelas;
    private javax.swing.JLabel KonstAppKel;
    private javax.swing.JLabel LblFoto;
    private javax.swing.JLabel NamaAppKel;
    private javax.swing.JLabel SoalAppKel;
    private java.awt.TextArea TACari;
    private javax.swing.JTextField TFCBR;
    private javax.swing.JTextField TFKNN;
    private javax.swing.JTextField TFKonstCari;
    private javax.swing.JTextField TFNamaCari;
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
