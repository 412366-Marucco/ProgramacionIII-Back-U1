//12.Desarrollar un programa que permita ingresar la antigüedad los autos de una
//concesionaria de usados. Finalizar la carga cuando se ingrese 0. Por cada auto
//ingresado mostrar por pantalla un mensaje adecuado con el siguiente criterio: si
//el auto tiene entre 1 y 5 años mostrar el texto “NUEVO”, si tiene entre 6 y 10
//mostrar “POCO USO”, si tiene entre 11 y 20 “MUCHO USO” y si tiene más de 20
//“MUY ANTIGUO”.

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anios;
        do {
            System.out.println("Ingresar la antigüedad del auto en años. Ingresar 0 para finalizar: ");
            anios = scanner.nextInt();

            if (1 <= anios && anios <= 5) {
               System.out.println("NUEVO");
            } else if (6 <= anios && anios <= 10) {
                System.out.println("POCO USO");
            } else if (11 <= anios && anios <= 20) {
                System.out.println("MUCHO USO");
            } else if (20 < anios) {
                System.out.println("MUY ANTIGUO");
            }

        } while (anios != 0);
    }
}
