package skripsinurida;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author nury
 */
public class DocumentParser {

    private List<String[]> termsDocArray = new ArrayList<>();
    private List<String> allTerm = new ArrayList<>();
    private List<double[]> tfidfDocVector = new ArrayList<>();
    private KoneksiDB connection = new KoneksiDB();

    public void parseFiles() throws FileNotFoundException, IOException, SQLException {
        Statement st = connection.getKoneksi().createStatement();
        ResultSet rs1 = st.executeQuery("SELECT * FROM appindex");
        int rowCount = rs1.last() ? rs1.getRow() : 0;
         JOptionPane.showMessageDialog(null,"Mengindeks sebanyak " + rowCount +" data");
        

        for (int a = 1; a <= rowCount; a++) {
            ResultSet rs2 = st.executeQuery("SELECT * FROM appindex where autoid = '" + a + "'");
            while (rs2.next()) {
                String kata = rs2.getString("Kata");
                String[] token = kata.split(" ");
                for (String term : token) {
                    if (!allTerm.contains(term)) {
                        allTerm.add(term);
                    }
                    String query11 = "ALTER TABLE apptfidf AUTO_INCREMENT = 1";
                    PreparedStatement preparedStmt11 = connection.getKoneksi().prepareStatement(query11);
                    preparedStmt11.executeUpdate();

                    String query1 = "INSERT INTO apptfidf(Term, docId) VALUES(?,?)";
                    PreparedStatement preparedStmt1 = connection.getKoneksi().prepareStatement(query1);
                    preparedStmt1.setString(1, term);
                    preparedStmt1.setInt(2, rowCount);
                    preparedStmt1.executeUpdate();
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

                //System.out.println(array[j]);
                /*Statement st = connection.getKoneksi().createStatement();
                 ResultSet rs1 = st.executeQuery("SELECT * FROM appindex");
                 int row = rs1.last() ? rs1.getRow() : 0;
                 for (int a = 1; a <= row; a++) {
                 while (rs1.next()) {
                 System.out.println(a + " --> " + array[j]);*/
                String query2 = "UPDATE appindex SET SimDocAkhir = ? WHERE autoid = ?";
                PreparedStatement pS2 = connection.getKoneksi().prepareStatement(query2);
                pS2.setDouble(1, array[j]);
                pS2.setInt(2, a);
                pS2.executeUpdate();
                // }
                // }
            }
        }
    }
}
