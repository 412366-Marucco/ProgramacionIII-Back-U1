import java.util.Scanner;

//Ingresar 10 números por teclado, informar su suma y promedio.
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        int num6 = scanner.nextInt();
        int num7 = scanner.nextInt();
        int num8 = scanner.nextInt();
        int num9 = scanner.nextInt();
        int num10 = scanner.nextInt();

        scanner.close();

        int suma = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
        double promedio = (double)suma / 10;
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("El promedio de los numeros es: " + promedio);
    }
}
