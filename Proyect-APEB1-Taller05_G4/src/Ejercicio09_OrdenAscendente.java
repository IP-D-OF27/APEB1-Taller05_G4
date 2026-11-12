
import java.util.Scanner;

/**
 * Ejercicio 09: Ordenamiento de Tres Números: Dados tres números, ordenarlos en
 * orden ascendente.
 *
 * @author Jennifer Yunga, Jonh Jimenez
 * @version 1.0
 */
public class Ejercicio09_OrdenAscendente {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Ingrese los 3 valores:");
        n1 = tcl.nextInt();
        n2 = tcl.nextInt();
        n3 = tcl.nextInt();
        if (n1 >= n2 && n1 >= n3) {
            if (n2 >= n3) {
                System.out.println(n3 + "," + n2 + "," + n1);
            } else {
                System.out.println(n2 + "," + n3 + "," + n1);
            }
        } else if (n2 >= n1 && n2 >= n3) {
            if (n1 >= n3) {
                System.out.println(n3 + "," + n1 + "," + n2);
            } else {
                System.out.println(n1 + "," + n3 + "," + n2);
            }
        } else {
            if (n1 >= n2) {
                System.out.println(n2 + "," + n1 + "," + n3);
            } else {
                System.out.println(n1 + "," + n2 + "," + n3);
            }

        }
    }
}
    /*** 
     * EVIDENCIA DEL RUN: Pegue aquí la evidencia de la ejecución del .java
     * run:
Ingrese los 3 valores:
23
28
13
13,23,28
BUILD SUCCESSFUL (total time: 10 seconds)
     */
