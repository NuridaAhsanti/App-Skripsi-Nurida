/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contohkoneksi;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
/**
 *
 * @author nury
 */
public class TfIdfMain {
     public static void main(String args[]) throws FileNotFoundException, IOException, SQLException{
    DocumentParser dp = new DocumentParser();
        dp.parseFiles();
        dp.tfIdfCalculator(); 
        dp.getCosineSimilarity();   
    }
}
