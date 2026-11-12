
import java.util.Scanner;

/**
 * Ejercicio 07:  Asignar una letra (A, B, C, D) a una calificación en función 
 * de su rango (A para 90-100, B para 80-89, etc.) .
 * @author Jennifer Yunga, Jonh Jimenez
 * @version 1.0
 */

public class Ejercicio07_RangoNotas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double calificacion = 0;
        System.out.println("Ingrese la calificacion:");
        calificacion = tcl.nextDouble();
        if (calificacion >= 90 )
            System.out.println("Letra asignada: A");
        else if (calificacion >= 80)
             System.out.println("Letra asignada: B");
        else if(calificacion >= 70)
             System.out.println("Letra asignada: C");
        else 
             System.out.println("Letra asignada: D");
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese la calificacion:
90
Letra asignada: A
BUILD SUCCESSFUL (total time: 10 seconds)
* run:
Ingrese la calificacion:
74
Letra asignada: C
BUILD SUCCESSFUL (total time: 6 seconds)
run:
Ingrese la calificacion:
67
Letra asignada: D
BUILD SUCCESSFUL (total time: 4 seconds)
 */