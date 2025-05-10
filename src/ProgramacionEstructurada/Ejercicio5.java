package ProgramacionEstructurada;//Ingresar la cantidad de horas trabajadas por un empleado y el sueldo que cobra
//por hora. Indique el total a cobrar teniendo en cuenta que si trabajó más de 180
//horas las excedentes las cobra con un 50 % de aumento

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas trabajadas por el empleado: ");
        int horas = sc.nextInt();

        System.out.println("Ingrese el sueldo que cobra por hora: ");
        double sueldo = sc.nextDouble();

        double total;

        if (horas > 180) {
            int excedente = horas - 180;
            total = sueldo * 180 + excedente * sueldo * 1.5;
        } else {
            total = horas * sueldo;
        }

        System.out.println("El sueldo total a cobrar es de: " + total);
    }
}
