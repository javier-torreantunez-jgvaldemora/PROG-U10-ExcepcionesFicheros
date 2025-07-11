package u10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
Repetir la Actividad 2 usando un flujo de texto con búfer.
*/

public class U10_A03 {

    public static void main(String[] args) {
        String texto = "";
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("Main.java"));
            String linea = in.readLine();
            while (linea != null) { //mientras no llegue al final del archivo
                texto = texto + linea + '\n';
                linea = in.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
        System.out.println(texto);
    }
}
