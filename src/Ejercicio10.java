//10.Ingresar un número y validar que sea positivo. Si no lo es continuar solicitándolo
//al usuario hasta que ingrese un número correcto

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Ingresar un número positivo: ");
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("El número no es positivo. Intentá de nuevo.");
            }
        } while (number < 0);

        System.out.println("El número positivo ingresado es: " + number);
    }
}
