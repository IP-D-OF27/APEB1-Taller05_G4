/**
 * Ejercicio 01: "Sistema de reservas hoteleras: 
 * En una hostería de la ciudad de Loja se hace un descuento del 10% si el
 * cliente se hospeda más de 5 días, del 15% si se hospeda más de 10 días y 
 * del 20% si se hospeda más de 15 días. Elaborar una solución que pida el 
 * número de días y el precio diario de la habitación y luego calcule e 
 * imprima el subtotal por pagar,el descuento y el total por pagar."
 * @author John, Jennifer
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio13_ReservaHotel {
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in);
        int dias;
        double preciodia, subtotal, descuento = 0;
        System.out.print("Ingrese el precio diario de la habitacion: $");
        preciodia = tcl.nextDouble();
        System.out.print("Ingrese el numero de dias de hospedaje: ");
        dias = tcl.nextInt();
        subtotal = dias * preciodia;
        System.out.printf("El subtotal es: $%.2f%n" , subtotal);
        if (dias > 15){
            descuento = subtotal * 0.20;
        } else if (dias > 10){
            descuento = subtotal * 0.15;
        } else if (dias > 5){
            descuento = subtotal * 0.10;
        }
        System.out.printf("El descuento es: $%.2f%n" , descuento);
        System.out.printf("El total es: $%.2f%n" , (subtotal - descuento));
    } 
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese el precio diario de la habitacion: $12
Ingrese el numero de dias de hospedaje: 12
El subtotal es: $144,00
El descuento es: $21,60
El total es: $122,40
BUILD SUCCESSFUL (total time: 4 seconds)
* run:
Ingrese el precio diario de la habitacion: $12
Ingrese el numero de dias de hospedaje: 18
El subtotal es: $216,00
El descuento es: $43,20
El total es: $172,80
BUILD SUCCESSFUL (total time: 8 seconds)
 */