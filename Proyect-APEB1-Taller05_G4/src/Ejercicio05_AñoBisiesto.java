
import java.util.Scanner;

/**
 * Ejercicio 05:Año Bisiesto: Comprobar si un año ingresado es bisiesto o no.
 * Si es bisiesto, muestra un mensaje especial.
 * @author Jennifer Yunga, Jonh Jimenez
 * @version 1.0
 */

public class Ejercicio05_AñoBisiesto {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int anio;
        System.out.print("Ingrese el año: ");
        anio = tcl.nextInt();
        if (anio % 4 == 0 )
            System.out.println("Año Bisiesto ,un año bisiesto nos regala un día"
                    + " extra: 24 horas más para intentar eso que dejaste"
                    + " pendiente, abrazar más fuerte y creer en ti");
        else 
            System.out.println("No es un año bisiesto");
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese el año: 2029
No es un año bisiesto
BUILD SUCCESSFUL (total time: 4 seconds)
run:
Ingrese el año: 2024
Año Bisiesto ,un año bisiesto nos regala un dia extra: 24 horas mas para 
* intentar eso que dejaste pendiente, y creer en ti
BUILD SUCCESSFUL (total time: 7 seconds)
 */
