package ProgramacionEstructurada;

import java.util.Scanner;

//Declarar dos variables enteras y cargar sus valores por teclado. Informar su suma,
//diferencia, producto y cociente.
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        float num1 = scanner.nextFloat();
        System.out.println("Ingrese el segundo numero: ");
        float num2 = scanner.nextFloat();

        //Suma
        float sum = num1 + num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + sum);

        //Diferencia
        float res = num1 - num2;
        System.out.println("La diferencia de " + num1 + " y " + num2 + " es: " + res);

        //Producto
        float producto = num1 * num2;
        System.out.println("El producto de " + num1 + " y " + num2 + " es: " + producto);

        //Cociente
        float cociente = num1 / num2;
        System.out.println("El cociente es " + cociente);

    }
}