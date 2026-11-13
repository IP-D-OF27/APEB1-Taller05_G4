/**
 * Ejercicio 01: "Calculadora de IMC: 
 * Calcular el índice de masa corporal (IMC) de una persona y clasificarla en función de su valor 
 * (bajo peso, peso normal, sobrepeso, etc.)."
 * @author John Jimenez, Jennifer Yunga
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio08_IMC {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double altura, peso, imc;
        System.out.print("Introduzca su altura: ");
        altura = tcl.nextDouble();
        System.out.print("Introduzca su peso: ");
        peso = tcl.nextDouble();
        imc = peso / Math.pow(altura, 2);
        if (imc < 18.5) {
            System.out.println("Clasificacion: Bajo peso");
        } else if (imc < 25) {
            System.out.println("Clasificacion: Peso normal");
        } else if (imc < 30) {
            System.out.println("Clasificacion: Sobrepeso");
        } else {
            System.out.println("Clasificacion: Obesidad");
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Introduzca su altura: 1.7
Introduzca su peso: 50
Clasificacion: Bajo peso
BUILD SUCCESSFUL (total time: 5 seconds)
 */