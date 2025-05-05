package u10;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Escribir el método:
Integer leerEntero()
Que pida un entero por consola, lo lea del teclado y lo devuelva.
Si la cadena introducida por consola no tiene el formato correcto, muestra un
mensaje de error y vuelve a pedirlo.
*/

public class U10_A01 {

    public static void main(String[] args) {
        Integer n = leerEntero();
        System.out.println(n);
    }

    static Integer leerEntero() {
        Integer resultado;
        while (true) {
            try {
                System.out.print("Introducir entero: ");
                resultado = new Scanner(System.in).nextInt();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Tipo erróneo");
            }
        }
        return resultado;
    }
}
