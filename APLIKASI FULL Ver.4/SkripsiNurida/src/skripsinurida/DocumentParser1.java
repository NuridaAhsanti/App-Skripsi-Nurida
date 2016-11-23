
package skripsinurida;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author nury
 */

public class DocumentParser1 {
    private List<String[]> termsDocArray = new ArrayList<>();
    private List<String> allTerm = new ArrayList<>();
    private List<double[]> tfidfDocVector = new ArrayList<>();
    private KoneksiDB connection = new KoneksiDB();
    
    public void parseFiles() throws FileNotFoundException, IOException, SQLException {
        Statement st = connection.getKoneksi().createStatement();
        ResultSet rs1 = st.executeQuery("SELECT * FROM appindex");
        int rowCount = rs1.last() ? rs1.getRow() : 0;
        
        for(int a = 1; a<=rowCount; a++){
            ResultSet rs2 = st.executeQuery("SELECT * FROM appindex where autoid = '"+a+"'");
            while(rs2.next()){
                String kata = rs2.getString("Kata");
                String[] token = kata.split(" ");
                for (String term : token) {
                    if (!allTerm.contains(term)) {
                        allTerm.add(term);
                    }
                }
                termsDocArray.add(token);    
            }
        }   
    }
    
        public void tfIdfCalculator() {
        double tf; 
        double idf; 
        double tfidf;       
        for (String[] docTermArray : termsDocArray) {
            double[] tfidfvectors = new double[allTerm.size()];
            int count = 0;
            for (String term : allTerm) {
                tf = new TfIdf().tfCalculator(docTermArray, term);
                idf = new TfIdf().idfCalculator(termsDocArray, term);
                tfidf = tf * idf;
                tfidfvectors[count] = tfidf;
                count++;
            }
            tfidfDocVector.add(tfidfvectors); 
        }
    }
    
    public void getCosineSimilarity() throws SQLException {    
        for (int i = tfidfDocVector.size()-1; i < tfidfDocVector.size(); i++) {
            double array[]= new double[tfidfDocVector.size()];
            
            for (int j = 0; j < tfidfDocVector.size()-1; j++) {
                int a = j+1;
                array[j] = new CosineSimilarity().cosineSimilarity(
                        tfidfDocVector.get(i), tfidfDocVector.get(j));
                
                String query2 = "update appindex set SimDocAkhir=? where autoid= "+a;
                PreparedStatement pS2 = connection.getKoneksi().prepareStatement(query2);
                pS2.setDouble(1, array[j]);
                pS2.executeUpdate();
            }
        }
    }
}
