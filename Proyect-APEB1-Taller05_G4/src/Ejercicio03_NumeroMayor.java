
import java.util.Scanner;

/**
 * Ejercicio 03: Mayor de tres números: Dados tres números distintos, determinar
 * cuál es el mayor
 * @author Jennifer Yunga , John Jimenez
 * @version 1.0
 */
public class Ejercicio03_NumeroMayor {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n1, n2, n3, mayor;
        System.out.println("Ingresar 3 numeros:");
        n1 = tcl.nextInt();
        n2 = tcl.nextInt();
        n3 = tcl.nextInt();
        if (n1 >= n2 && n1 >= n3) {
            System.out.println("El mayor es:" + n1);
        } else if (n2 >= n3) {
            System.out.println("El mayor es:" + n2);
        } else {
            System.out.println("El mayor es:" + n3);
        }
    }
}
/***
 * EVIDENCIA DEL RUN: run:
 *run:
Ingresar 3 numeros:
67
54
34
El mayor es:67
BUILD SUCCESSFUL (total time: 10 seconds)
 */
