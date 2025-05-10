package ProgramacionEstructurada;
//. Una empresa de alquiler de autos cobra $300 por día si no se superan los 200 km
//de uso diario. Por cada km extra hasta los 1000 km cobra $5 adicionales, y a partir
//de los 1000 cobra $10 adicionales. Hacer un programa que solicite la cantidad de
//km realizados por un cliente e indique el importe que se le debe cobrar.

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de km recorridos en el día: ");
        double km = sc.nextDouble();
        sc.close();

        double total = 300;

        if (km > 200 && km <= 1000) {
            total += (km - 200) * 5;
        } else if (km > 1000) {
            total += (1000 - 200) * 5;
            total += (km - 1000) * 10;
        }

        System.out.println("Total a cobrar: $" + total);
    }
}
