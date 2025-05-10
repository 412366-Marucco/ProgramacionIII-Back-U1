//1. Programar una clase Persona con atributos suficientes para almacenar nombre,
//apellido y edad de una persona. Crear un programa que permita ingresar los datos
//de algunas personas por teclado y con esos datos cree instancias y muestre por
//pantalla el estado de las mismas.
//3. Agregar a la clase persona un método que retorne su índice de masa corporal.
//Este último dato se calcula como:
//4. IMC = peso / altura2

package ProgramacionOrientadaObjetos.Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String confirmacion;

        List<Persona> listaPersonas = new ArrayList<>();

        do {
            System.out.println("Desea ingresar una persona? Ingrese n para finalizar carga.");
            confirmacion = scanner.nextLine();

            if (confirmacion.equals("n")) {
                System.out.println("Carga finalizada.");
                break;
            }
            System.out.println("Ingresar nombre: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingresar apellido: ");
            String apellido = scanner.nextLine();
            System.out.println("Ingresar edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingresar altura en metros: ");
            double altura = scanner.nextDouble();
            System.out.println("Ingresar peso: ");
            double peso = scanner.nextDouble();
            scanner.nextLine();

            listaPersonas.add(new Persona(nombre, apellido, edad, altura, peso));



        } while (!confirmacion.equals("n"));

        System.out.println("Lista de personas:");
        int contador = 1;
        for (Persona persona : listaPersonas) {
            System.out.println("Datos persona " + contador++ + ":");
            System.out.println(persona);
            System.out.println("---------------------------------------------");
        }
    }
}
