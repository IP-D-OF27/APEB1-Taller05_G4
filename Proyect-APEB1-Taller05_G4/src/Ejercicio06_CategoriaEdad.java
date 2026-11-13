/**
 * Ejercicio 01: "Categoría de Edad: 
 * Clasificar a una persona en una categoría de edad (niño, adolescente, adulto) en función de su edad."
 * @author John Jimenez, Jennifer Yunga
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio06_CategoriaEdad {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad;
        System.out.print("Introduzca su edad: ");
        edad = tcl.nextInt();
        if (edad <= 15) {
            System.out.println("Usted es un ninio");
        } else if (edad <= 18){
            System.out.println("Usted es un adolescente");
        } else {
            System.out.println("Usted es un adulto");
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Introduzca su edad: 16
Usted es un adolescente
BUILD SUCCESSFUL (total time: 7 seconds)
 */