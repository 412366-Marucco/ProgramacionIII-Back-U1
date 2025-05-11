//7. Programar una clase Partido que represente a un partido de futbol. La misma debe
//contener dos atributos de tipo Equipo que indiquen los equipos contendientes y
//atributos necesarios para indicar el resultado del mismo.
package ProgramacionOrientadaObjetos.Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del partido:");
        System.out.println("Equipo Local: ");
        System.out.println("Nombre Local: ");
        String nombreLocal = scanner.nextLine();
        System.out.println("Partidos Ganados: ");
        int ganadosLocal = scanner.nextInt();
        System.out.println("Partidos Empatados: ");
        int empatadosLocal = scanner.nextInt();
        System.out.println("Partidos Perdidos: ");
        int perdidosLocal = scanner.nextInt();
        System.out.println("Goles Realizados: ");
        int golesRealizadosLocal = scanner.nextInt();
        System.out.println("Goles Recibidos: ");
        int golesRecibidosLocal = scanner.nextInt();
        System.out.println("Posicion: ");
        int posicionLocal = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Equipo Visitante: ");
        System.out.println("Nombre Visitante: ");
        String nombreVisitante = scanner.nextLine();
        System.out.println("Partidos Ganados: ");
        int ganadosVisitante = scanner.nextInt();
        System.out.println("Partidos Empatados: ");
        int empatadosVisitante = scanner.nextInt();
        System.out.println("Partidos Perdidos: ");
        int perdidosVisitante = scanner.nextInt();
        System.out.println("Goles Realizados: ");
        int golesRealizadosVisitante = scanner.nextInt();
        System.out.println("Goles Recibidos: ");
        int golesRecibidosVisitante = scanner.nextInt();
        System.out.println("Posicion: ");
        int posicionVisitante = scanner.nextInt();


        System.out.print("\nGoles del equipo local: ");
        int golesLocal = scanner.nextInt();
        System.out.print("Goles del equipo visitante: ");
        int golesVisitante = scanner.nextInt();

        Equipo equipoLocal = new Equipo(nombreLocal, ganadosLocal, empatadosLocal, perdidosLocal, golesRealizadosLocal, golesRecibidosLocal, posicionLocal);
        Equipo equipoVisitante = new Equipo(nombreVisitante, ganadosVisitante, empatadosVisitante, perdidosVisitante, golesRealizadosVisitante, golesRecibidosVisitante, posicionVisitante);

        Partido partido = new Partido(equipoLocal, equipoVisitante, golesLocal, golesVisitante);

        System.out.println("\n" + partido.toString());
    }
}
