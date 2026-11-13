/**
 * Ejercicio 01: "Día de la semana: 
 * Mostrar el nombre del día de la semana en función del número ingresado (1 para lunes, 2 para martes, etc.)."
 * @author John Jimenez, Jennifer Yunga
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio02_Dias {
    public static void main(String[] args) {
        Scanner tcl =  new Scanner(System.in);
        int dia;
        System.out.print("Ingrese el numero del dia: ");
        dia = tcl.nextInt();
        switch (dia){
            case 1:
                System.out.println("El dia  es: Lunes");
                break;
            case 2:
                System.out.println("El dia  es: Martes");
                break;
            case 3:
                System.out.println("El dia  es: Miercoles");
                break;
            case 4:
                System.out.println("El dia  es: Jueves");
                break;
            case 5:
                System.out.println("El dia  es: Viernes");
                break;
            case 6:
                System.out.println("El dia  es: Sabado");
                break;
            case 7:
                System.out.println("El dia  es: Domingo");
                break;
            default:
                System.out.println("Dia no valido");
                break;
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese el numero del dia: 9
Dia no valido
BUILD SUCCESSFUL (total time: 1 second)
 */