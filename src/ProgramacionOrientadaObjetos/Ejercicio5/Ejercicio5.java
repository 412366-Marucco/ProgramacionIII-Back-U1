//5. Programar una clase Auto con datos de un automotor (marca, modelo, precio y
//kilometraje). Incluir un método que retorne la antigüedad del auto.

package ProgramacionOrientadaObjetos.Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el auto: ");
        System.out.println("Ingrese el kilometraje: ");
        int kilometraje = scanner.nextInt();
        System.out.println("Ingrese el precio: ");
        double precio = scanner.nextDouble();
        System.out.println("Ingrese el modelo: ");
        int modelo = scanner.nextInt();
        System.out.println("Ingrese el marca: ");
        scanner.nextLine();
        String marca = scanner.nextLine();

        Auto auto = new Auto(kilometraje, precio, modelo, marca);

        System.out.println("La antiguedad del auto es de: " + auto.antiguedad() + " años.");
    }
}
