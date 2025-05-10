package ProgramacionEstructurada;//Ingresar nombre y altura de dos personas, informar el nombre de la más alta.

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la primer persona:");
        String nombre1 = sc.next();
        System.out.println("Ingrese la altura en cm de :" + nombre1);
        int altura1 = sc.nextInt();

        System.out.println("Ingrese el nombre de la segunda persona:");
        String nombre2 = sc.next();

        System.out.println("Ingrese la altura en cm de :" + nombre2);
        int altura2 = sc.nextInt();

        if (altura1 > altura2) {
            System.out.println("La persona mas alta es: " + nombre1);
        }
        else if (altura2 > altura1) {
            System.out.println("La persona mas alta es: " + nombre2);
        }
        else {
            System.out.println("Miden lo mismo");
        }
    }
}