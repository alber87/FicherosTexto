
package Ej2;

import java.io.*;
        
public class Ej2 {
    public static void main(String[] args) {
        int c;
        String cadena="", texto="";
        File f = new File("parrafo.txt");
        try{
            FileReader fr = new FileReader(f);
            c = fr.read();
            while(c!=-1){
                System.out.println((char)c);
                if(!"a".equals((char)c) || !"e".equals((char)c) || !"i".equals((char)c) || !"o".equals((char)c) || !"u".equals((char)c))
                    cadena = cadena + (char)c;
                c = fr.read();
            }
            fr.close();
            
            //creamos nuevo fichero
            FileWriter fw = new FileWriter("nuevoParrafo.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write(cadena);
            
            bw.close();
            fw.close();
            
            //leemos el nuevo fihero y lo imprimimos por pantalla
            fr = new FileReader("nuevoParrafo.txt");
            BufferedReader br = new BufferedReader(fr);
            texto = br.readLine();
            System.out.println("-- fichero nuevoParrafo --");
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
