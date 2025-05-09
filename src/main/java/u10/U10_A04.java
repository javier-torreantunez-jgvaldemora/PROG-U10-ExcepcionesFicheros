package u10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
Crear con un editor el fichero de texto NumerosReales.txt y escribir en él una
serie de números reales separados por espacios simples.
Implementar un programa que acceda a NumerosReales.txt, lea los números y
calcule la suma y la media aritmética, mostrando los resultados por pantalla.
(NOTA: Puedes utilizar String.Split y String.valueOf) 
*/

public class U10_A04 {

    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("NumerosReales.txt"));
            String texto = in.readLine();
            String[] subcadenas = texto.split(" ");
            double suma = 0;
            for (int i = 0; i < subcadenas.length; i++) {
                suma += Double.valueOf(subcadenas[i]);
            }
            System.out.println("suma: " + suma + "\tmedia: " 
                    + suma / subcadenas.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}
