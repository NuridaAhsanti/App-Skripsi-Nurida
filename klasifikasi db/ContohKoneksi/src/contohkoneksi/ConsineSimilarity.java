/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contohkoneksi;

/**
 *
 * @author nury
 */
public class ConsineSimilarity {
    public double cosineSimilarity(double[] docVector1, double[] docVector2) {
        double skalar = 0.0;
        double jarak1 = 0.0;
        double jarak2 = 0.0;
        double cosineSimilarity = 0.0;

        for (int i = 0; i < docVector1.length; i++)
        {
            skalar += docVector1[i] * docVector2[i];  //a.b
            jarak1 += Math.pow(docVector1[i], 2);  //(a^2)
            jarak2 += Math.pow(docVector2[i], 2); //(b^2)
        }
        jarak1 = Math.sqrt(jarak1);//sqrt(a^2)
        jarak2 = Math.sqrt(jarak2);//sqrt(b^2)
        
        if (jarak1 != 0.0 | jarak2 != 0.0) {
           cosineSimilarity = skalar / (jarak1 * jarak2);
        } else {
            return 0.0;
        }
        return cosineSimilarity;
   }
}
