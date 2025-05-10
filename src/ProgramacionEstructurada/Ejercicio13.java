package ProgramacionEstructurada;//12.Desarrollar un programa que permita ingresar la antigüedad los autos de una
//concesionaria de usados. Finalizar la carga cuando se ingrese 0. Por cada auto
//ingresado mostrar por pantalla un mensaje adecuado con el siguiente criterio: si
//el auto tiene entre 1 y 5 años mostrar el texto “NUEVO”, si tiene entre 6 y 10
//mostrar “POCO USO”, si tiene entre 11 y 20 “MUCHO USO” y si tiene más de 20
//“MUY ANTIGUO”.

//13.Luego de finalizada la carga calcular y mostrar los siguientes resultados:
//• Cantidad total de autos.
//• Cantidad de autos con poco uso.
//• Promedio de antigüedad de los autos que no sean muy antiguos

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anios;
        int cantidadTotalAutos = 0;
        int cantidadPocoUso = 0;
        int cantidadNoMuyAntiguo = 0;
        int sumatoriaNoMuyAntiguo = 0;

        do {
            System.out.println("Ingresar la antigüedad del auto en años. Ingresar 0 para finalizar: ");
            anios = scanner.nextInt();

            if (anios == 0) {
                System.out.println("Carga finalizada.");
                break;
            }

            cantidadTotalAutos++;

            if (anios > 20) {
                System.out.println("MUY ANTIGUO");
            } else {
                cantidadNoMuyAntiguo++;
                sumatoriaNoMuyAntiguo += anios;
                if (anios > 10) {
                    System.out.println("MUCHO USO");
                } else if (anios > 5) {
                    cantidadPocoUso++;
                    System.out.println("POCO USO");
                } else if (anios > 0) {
                    System.out.println("NUEVO");
                }
            }
        } while (anios != 0);

        System.out.println("La cantidad total de autos es de: " + cantidadTotalAutos);
        System.out.println("La cantidad de autos con poco uso es de: " + cantidadPocoUso);
        if (cantidadNoMuyAntiguo > 0) {
            double promedio = (double) sumatoriaNoMuyAntiguo / cantidadNoMuyAntiguo;
            System.out.println("El promedio de antigüedad de los autos que no sean muy antiguos es de: " + promedio);
        } else {
            System.out.println("No se ingresaron autos que no sean muy antiguos.");
        }
    }
}
