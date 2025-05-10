import java.util.Scanner;

//9. Ingresar un número n y a continuación n números positivos. Informar la cantidad
//de mayores a 5 que se hayan ingresado.
public class Ejercicio9 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar la cantidad de números positivos: ");
        int n = scanner.nextInt();

        int contador = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresar un número positivo: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("El número debe ser positivo. Se ignora.");
                continue;
            }

            if (numero > 5) {
                contador++;
            }
        }

        System.out.println("Se ingresaron " + contador + " números mayores a 5.");
    }
}
