/**
 * Ejercicio 01: "Valores pares o impares: 
 * Dado un valor entero ingresado por teclado (positivo o negativo), determinar si se trata de un valor par o impar."
 * @author John Jimenez, Jennifer Yunga
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio10_ParesImpares {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int valor;
        System.out.print("Introduzca un valor: ");
        valor = tcl.nextInt();
        valor %= 2;
        if (valor == 1) {
            System.out.println("Su numero es impar");
        } else {
            System.out.println("Su numero es par");
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Introduzca un valor: 8
Su numero es par
BUILD SUCCESSFUL (total time: 1 second)
 */