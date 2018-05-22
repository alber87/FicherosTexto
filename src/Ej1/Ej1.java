
package Ej1;

import java.io.*;

public class Ej1 {
    public static void main(String[] args) {
        File f = new File("parrafo.txt");
        try{
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            String frase = "Estamos repasando ficheros";
            bw.newLine();
            bw.write(frase);
            
            bw.close();
            fw.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
