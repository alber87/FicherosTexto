
package Ej2;

import java.io.*;
        
public class Ej2 {
    public static void main(String[] args) {
        int c;
        String texto="";
        File f = new File("parrafo.txt");
        
        try{
            FileReader fr = new FileReader(f);
            FileWriter fw = new FileWriter("otroParrafo.txt");
            c = fr.read();
            while(c!=-1){
              if((char)c!='a'&& (char)c!='e' &&(char)c!='i' && (char)c!='o' && (char)c!='u' && (char)c!='E')
                fw.write(c); 
                c = fr.read();
            }
            fr.close();
            fw.close();
            
            //leemos el nuevo fihero y lo imprimimos por pantalla
            fr = new FileReader("otroParrafo.txt");
            BufferedReader br = new BufferedReader(fr);
            texto = br.readLine();
            System.out.println("\n\n-- fichero otroParrafo --");
            while(texto!=null){
                System.out.println(texto);
                texto = br.readLine();
            }
            br.close();
            fr.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
