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

public class U10_A01_throws {

    public static void main(String[] args) {
        Integer n = null;
        Scanner leer = new Scanner(System.in);

        while (true) {
            try {
                n = leerEntero(leer);
                System.out.println("El numero introducido es el: "+n);
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Tipo erroneo");
                // Consumimos la línea.
                leer.nextLine();
            }
        }
    }

    static Integer leerEntero(Scanner sc) throws InputMismatchException {
        System.out.print("Introducir entero: ");
        Integer resultado = sc.nextInt();
        return resultado;
    }
}
