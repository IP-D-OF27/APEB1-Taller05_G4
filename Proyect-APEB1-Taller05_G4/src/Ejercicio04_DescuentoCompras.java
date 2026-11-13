/**
 * Ejercicio 01: "Descuento en Compras: 
 * Calcular el precio final de un producto con un descuento del 10% si el precio original es mayor de $100; 
 * de lo contrario, no hay descuento."
 * @author John Jimenez, Jennifer Yunga
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio04_DescuentoCompras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double precio, descuento;
        System.out.print("Introduzca el precio del producto: ");
        precio = tcl.nextDouble();
        descuento = 1;
        if (precio > 100) {
            descuento = 0.9;
        }
        System.out.println("El precio final es: " + precio * descuento);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Introduzca el precio del producto: 100
El precio final es: 100.0
BUILD SUCCESSFUL (total time: 4 seconds)
 */