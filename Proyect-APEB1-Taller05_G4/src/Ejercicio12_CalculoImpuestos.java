
import java.util.Scanner;

/**
 * Ejercicio 12:Desarrollar una solución que permita leer los datos de un
 * automóvil (marca, origen y costo) imprima el impuesto por pagar y el precio
 * de venta (incluido el impuesto) . Si el origen es Alemania el impuesto es 20%
 * , si es de Japón el impuesto es 30% , si es de Italia, 15% , y si es de USA,
 * 8%
 *
 * @author Jennifer Yunga, Jonh Jimenez
 * @version 1.0
 */
public class Ejercicio12_CalculoImpuestos {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String marca, origen;
        double costo, impuesto, precioV;
        System.out.println("Ingrese la marca, origen y costo del automovil:");
        marca = tcl.nextLine();
        origen = tcl.nextLine();
        costo = tcl.nextDouble();
        switch (origen) {
            case "Alemania":
                impuesto = costo * 0.20;
                break;
            case "Japon":
                impuesto = costo * 0.30;
                break;
            case "Italia":
                impuesto = costo * 0.15;
                break;
            case "USA":
                impuesto = costo * 0.08;
                break;
            default:
                System.out.println("Origen no reconocido");
                impuesto = 0;
                break;
        }
        precioV = costo + impuesto;
        System.out.println("--- Informacion del automovil ---");
        System.out.println("Marca:" + marca);
        System.out.println("Origen:" + origen);
        System.out.printf("Costo $%,.2f%n",costo);
        System.out.printf("Impuesto a pagar: $%,.2f%n", impuesto);
        System.out.printf("Precio de venta: $%,.2f%n", precioV);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese la marca, origen y costo del automovil:
Toyota
Japon
14000
--- Informacion del automovil ---
Marca:Toyota
Origen:Japon
Costo $14.000,00
Impuesto a pagar: $4.200,00
Precio de venta: $18.200,00
BUILD SUCCESSFUL (total time: 22 seconds)

 */
