package u10;

//import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Escribir un programa que duplique el contenido de un fichero cuyo nombre se pide
al usuario. El fichero copia tendrá el mismo nombre con el prefijo «copia_de_».
*/

public class U10_A08 {

    public static void main(String[] args) {
        System.out.println("Nombre del fichero: ");
        String fichOriginal = new Scanner(System.in).nextLine();
        String fichCopia = "copia_de_" + fichOriginal;
        //File fileIn = new File (fichOriginal);
        
        try (BufferedReader in  = new BufferedReader(new FileReader(fichOriginal));  
             BufferedWriter out = new BufferedWriter(new FileWriter(fichCopia)))
        {
            int c = in.read();
            while (c != -1) { 
                out.write(c); 
                c = in.read(); 
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
