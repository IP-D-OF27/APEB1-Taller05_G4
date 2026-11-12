
import java.util.Scanner;

/**
 * Ejercicio 01:Edad para Votar: Determinar si una persona es elegible para
 * votar en función de su edad (mayor o igual a 16 años).
 * @author Jennifer Yunga, John Jimenez
 * @version 1.0
 */

public class Ejercicio01_LegibleVotacion {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad;
        System.out.print("Igrese su edad: ");
        edad = tcl.nextInt();
        if (edad >= 16)
            System.out.println("Es elegible para votar:");
        else
            System.out.println("No es elegible para votar:");
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Igrese su edad: 13
No es elegible para votar:
BUILD SUCCESSFUL (total time: 6 seconds)
* run:
Igrese su edad: 18
Es elegible para votar:
BUILD SUCCESSFUL (total time: 9 seconds)
 */
