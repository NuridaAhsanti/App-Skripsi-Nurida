
package contohkoneksi;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author nury
 */
public class TfIdf_1 {
    private tutorialKoneksi connection = new tutorialKoneksi();
    
    public double tfCalculator(String[] totalterms, String termToCheck) throws SQLException {
        double count = 0; 
        for (String s : totalterms) {
            if (s.equalsIgnoreCase(termToCheck)) {
                count++;
                /*String query = " UPDATE apptfidf SET jumlah = ? WHERE Term = ?";
                PreparedStatement preparedStmt = connection.getKoneksi().prepareStatement(query);
                preparedStmt.setDouble(1,count);
                preparedStmt.setString(2,s);
                preparedStmt.executeUpdate();*/
            }
        }
        return count / totalterms.length;
    }
   
    public double idfCalculator(List<String[]> allTerms, String termToCheck) throws SQLException {
        double count = 0;
        for (String[] ss : allTerms) {
            for (String s : ss) {
                if (s.equalsIgnoreCase(termToCheck)) {
                    count++;
                    break;
                }
            }
        }
        return Math.log(allTerms.size() / count);
    }
}
