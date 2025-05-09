package u10;

import java.io.FileReader;
import java.io.IOException;

/*
Leer el archivo de texto Main.java de uno de los proyectos que hayamos terminado
y mostrarlo por pantalla. (NOTA: utiliza FileReader)
*/

public class U10_A02 {

    public static void main(String[] args) {
        String texto = "";
        FileReader in = null;

        try {
            //Main.java debe estar en la carpeta del proyecto:
            in = new FileReader("Main.java");
            int c = in.read();
            while (c != -1) { 
                texto = texto + (char) c;
                c = in.read();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally { 
            if (in != null) { 
                try {
                    in.close();
                    System.out.println("He terminado -> Cierro el fichero.");
                }
                catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
        System.out.println(texto);
    }
}
