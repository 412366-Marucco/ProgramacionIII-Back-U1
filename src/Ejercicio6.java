//6. Ingresar un año e indicar si ese año es bisiesto. Un año es bisiesto si es múltiplo
//de 4 y no es múltiplo de 100 o si es múltiplo de 400.

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un año: ");
        int anio = sc.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("Es bisiesto");
        } else{
            System.out.println("No es bisiesto");
        }

    }
}
