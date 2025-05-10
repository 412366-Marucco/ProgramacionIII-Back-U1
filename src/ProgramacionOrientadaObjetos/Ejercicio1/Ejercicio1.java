//1. Programar una clase Persona con atributos suficientes para almacenar nombre,
//apellido y edad de una persona. Crear un programa que permita ingresar los datos
//de algunas personas por teclado y con esos datos cree instancias y muestre por
//pantalla el estado de las mismas.


package ProgramacionOrientadaObjetos.Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
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

            listaPersonas.add(new Persona(nombre, apellido, edad));



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
