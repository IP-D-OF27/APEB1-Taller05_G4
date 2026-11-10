/**
 * Ejercicio 01: "Sistema de reservas hoteleras: 
 * En una hostería de la ciudad de Loja se hace un descuento del 10% si el cliente se hospeda más de 5 días, 
 * del 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15 días. 
 * Elaborar una solución que pida el número de días y el precio diario de la habitación y luego calcule e imprima el subtotal por pagar, 
 * el descuento y el total por pagar."
 * @author John, Jennifer
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio13_ReservaHotel {
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in);
        int dias;
        double preciodia, subtotal, descuento = 0;
        System.out.print("Ingrese el precio diario de la habitacion: ");
        preciodia = tcl.nextDouble();
        System.out.print("Ingrese el numero de dias que uso la habitacion: ");
        dias = tcl.nextInt();
        subtotal = dias * preciodia;
        System.out.println("El subtotal es: " + subtotal);
        if (dias > 15){
            descuento = subtotal * 0.20;
        } else if (dias > 10){
            descuento = subtotal * 0.15;
        } else if (dias > 5){
            descuento = subtotal * 0.10;
        }
        System.out.println("El descuento es: " + descuento);
        System.out.println("El total es: " + (subtotal - descuento));
    } 
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */