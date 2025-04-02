//Hacer un programa que ingrese el precio de un artículo a la venta y calcule el
//precio con IVA.

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del articulo: ");
        double precio = scanner.nextDouble();

        double precioConIva = precio + 21 * precio / 100;

        System.out.println("El precio del articulo con IVA es: $" + precioConIva);
    }
}