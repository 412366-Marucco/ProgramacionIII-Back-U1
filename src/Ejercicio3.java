//Hacer un programa que ingrese los datos de una factura en la cual haya tres
//artículos vendidos. De cada artículo ingresar el precio unitario y la cantidad.
//Finalmente imprimir el total de la factura

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el precio unitario del primer articulo: ");
        double precio = sc.nextDouble();
        System.out.println("Ingrese la cantidad del primer articulo: ");
        int cantidad = sc.nextInt();

        System.out.println("Ingrese el precio del segundo articulo: ");
        double precio2 = sc.nextDouble();
        System.out.println("Ingrese la cantidad del segundo articulo: ");
        int cantidad2 = sc.nextInt();

        System.out.println("Ingrese el precio del tercer articulo: ");
        double precio3 = sc.nextDouble();
        System.out.println("Ingrese la cantidad del tercer articulo: ");
        int cantidad3 = sc.nextInt();

        double total = precio * cantidad + precio2 * cantidad2 + precio3 * cantidad3;
        System.out.println("El total de la factura es de: $" + total);

    }
}