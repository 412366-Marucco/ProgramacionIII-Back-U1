//6. Programar una clase Equipo que represente a un equipo de fútbol. Incluir en la
//misma atributos para almacenar el nombre del equipo y los datos relativos a un
//campeonato con forma de liga: puntos, cantidad de partidos ganados, empatados
//y perdidos, cantidad de goles realizados y recibidos y posición.

package ProgramacionOrientadaObjetos.Ejercicio6;

public class Ejercicio6 {
    public static void main(String[] args){
        Equipo equipo = new Equipo("River", 10, 3, 2, 25, 10, 1);
        System.out.println(equipo);
    }
}
