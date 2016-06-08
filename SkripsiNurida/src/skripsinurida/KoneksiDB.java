/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package skripsinurida;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author nury
 */
public class KoneksiDB {
    private Connection con;
    private String driverName = "com.mysql.jdbc.Driver";
    private String jdbc = "jdbc:mysql://";
    private String host = "localhost:";
    private String port = "3306/";
    private String database = "skripsidb";
    private String url = jdbc  + host + port + database;
    private String username = "root";
    private String passwaord = "";
    
    public Connection getKoneksi() throws SQLException{
        if (con == null){
        try{
            Class.forName(driverName);
            System.out.println("Driver Ditemukan");
            try{
                con = DriverManager.getConnection(url, username, passwaord);
                System.out.println("Koneksi Database Sukses");
            } catch (SQLException se){
                System.out.println("Koneksi Database Gagal" + se);
            }
        } catch (ClassNotFoundException cnfe){
            System.out.println("Driver tidak ditemukan, terjadi kesalahan pada:" + cnfe);
            System.exit(0);
        }
        }
    return con;
}
}