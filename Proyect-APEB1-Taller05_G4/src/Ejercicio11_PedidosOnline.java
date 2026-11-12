
import java.util.Scanner;

/**
 * Ejercicio 11: Desarrollar una solución que imprima el costo de un pedido de
 * un artículo del cual se tiene la descripción, la cantidad que se requiere y 
 * el precio unitario. Si la cantidad pedida excede de 50 unidades, se hace un
 * descuento del 15%.
 * @author Jennifer Yunga, Jonh Jimenez
 * @version 1.0
 */

public class Ejercicio11_PedidosOnline {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String descripcion;
        int cantidad;
        double precioU ,costoP;
        System.out.print("Descripcion del articulo: ");
        descripcion = tcl.nextLine();
        System.out.print("Ingrese la cantidad que requiere: ");
        cantidad  = tcl.nextInt();
        System.out.print("Ingrese el precio unitario del articulo: $");
        precioU = tcl.nextDouble();
        costoP = cantidad * precioU;
        if (cantidad > 50)
            costoP = (costoP * 0.85);
        System.out.printf("Costo total del pedido: $ %.2f%n", costoP);
    }
          
}
/***
 * EVIDENCIA DEL RUN:
 *run:
Descripcion del articulo: camisetas
Ingrese la cantidad que requiere: 23
Ingrese el precio unitario del articulo: $20
Costo total del pedido: $ 460,00
BUILD SUCCESSFUL (total time: 33 seconds)
* run:
Descripcion del articulo: juguetes
Ingrese la cantidad que requiere: 70
Ingrese el precio unitario del articulo: $4,00
Costo total del pedido: $ 238,00
BUILD SUCCESSFUL (total time: 28 seconds)
 */