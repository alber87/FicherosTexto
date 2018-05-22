
package Ej3;

import java.io.*;

public class Ej3 {
    public static void main(String[] args) {
        File f1 = new File("f1.txt");
        File f2 = new File("f2.txt");
        
        try{
            FileWriter fr = new FileWriter(f1);
            BufferedWriter bw = new BufferedWriter(fr);
            String contenido = "a\nc\ne\ng\ni";
            bw.write(contenido);
            bw.close();
            fr.close();
            
            fr= new FileWriter(f2);
            bw = new BufferedWriter(fr);
            contenido = "";
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
