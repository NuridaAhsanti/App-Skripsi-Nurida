/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contohkoneksi;

/**
 *
 * @author nury
 */
public class teks {
   private String soal; 
   private String id; 
   private String nama; 
   private String klas; 
   private String kons; 
   private String tipe;
   private String var;
  
  public teks(String soal_){
       this.soal = soal_;
    }
  
  public void id(String id_){
       this.id = id_;
    }
  
  public String tampilsoal(){
   return soal; 
  }
  
  public String tampilid(){
   return id; 
  }
  
  public String tampilnama(){
   return nama; 
  }
  
  public String tampilklas(){
   return klas; 
  }
  
  public String tampilkons(){
   return kons; 
  }
  
  public String tampiltipe(){
   return tipe;
  }
  
  public String tampilvar(){
   return var;
  }
   
}
