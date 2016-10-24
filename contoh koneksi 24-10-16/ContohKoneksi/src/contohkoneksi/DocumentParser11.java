
package contohkoneksi;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.Arrays;
/**
 *
 * @author nury
 */

public class DocumentParser11 {
    private List<String[]> termsDocsArray = new ArrayList<>();
    private List<String> allTerms = new ArrayList<>();
    private List<double[]> tfidfDocsVector = new ArrayList<>();
    private tutorialKoneksi connection = new tutorialKoneksi();
    
    public void parseFiles() throws FileNotFoundException, IOException, SQLException {
        Statement st = connection.getKoneksi().createStatement();
        ResultSet rs1 = st.executeQuery("SELECT * FROM appindex");
        int rowCount = rs1.last() ? rs1.getRow() : 0;
        JOptionPane.showMessageDialog(null,"Mengindeks sebanyak " + rowCount +" data");
        
        for(int a = 1; a<=rowCount; a++){
            ResultSet rs2 = st.executeQuery("SELECT * FROM appindex where autoid = '"+a+"'");
            while(rs2.next()){
                String kata = rs2.getString("Kata");
                String[] token = kata.split(" ");
                for (String term : token) {
                    if (!allTerms.contains(term)) {
                        allTerms.add(term);
                    }
                }
                termsDocsArray.add(token);    
            }
        }   
    }
    
        public void tfIdfCalculator() {
        double tf; 
        double idf; 
        double tfidf;       
        for (String[] docTermsArray : termsDocsArray) {
            double[] tfidfvectors = new double[allTerms.size()];
            int count = 0;
            for (String terms : allTerms) {
                tf = new TfIdf().tfCalculator(docTermsArray, terms);
                idf = new TfIdf().idfCalculator(termsDocsArray, terms);
                tfidf = tf * idf;
                tfidfvectors[count] = tfidf;
                count++;
            }
            tfidfDocsVector.add(tfidfvectors); 
        }
    }
    
    public void getCosineSimilarity() throws SQLException {
        for (int i = tfidfDocsVector.size()-1; i < tfidfDocsVector.size(); i++) {
            double array[]= new double[tfidfDocsVector.size()];
            for (int j = 0; j < tfidfDocsVector.size(); j++) {
                 int a = i+1;
                 int b = j+1;
                array[j] = new ConsineSimilarity().cosineSimilarity(
                        tfidfDocsVector.get(i), tfidfDocsVector.get(j));
                String query2 = "insert into appcache(Dokumen,similarity) values(?,?)";
                PreparedStatement pS2 = connection.getKoneksi().prepareStatement(query2);
                pS2.setString(1, "jarak " +a+ " dan " + b );
                pS2.setString(2, null);
                pS2.executeUpdate();
            }
            
                Arrays.sort(array);
           for (int x=0; x<tfidfDocsVector.size();x++){
              
                String query1 = "ALTER TABLE appcache AUTO_INCREMENT = 1";
                PreparedStatement pS1 = connection.getKoneksi().prepareStatement(query1);
                pS1.executeUpdate();
            
                String query2 = "update into appcache similarity=? values(?,?)";
                PreparedStatement pS2 = connection.getKoneksi().prepareStatement(query2);
                pS2.setString(1, "jarak " +i+ " dan " + x );
                pS2.setDouble(2, array[x]);
                pS2.executeUpdate();
                         
           }
        }
    }
}
    // sudah mengurut secara asc tapi no dokumen jadi salah karena diluar for