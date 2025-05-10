package ProgramacionEstructurada;//11.Ingresar el tiempo en segundos que realizó el ganador de la clasificación de una
//carrera de F1. Luego ingresar los tiempos de los otros 9 corredores e informar
//cuántos disputarán la carrera. Para que un corredor pueda participar su tiempo de
//clasificación no puede superar en 15 % al del ganador.

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar el tiempo del ganador de la carrera: ");
        double tiempoGanador = scanner.nextDouble();

        int cuantosCorren = 1;
        System.out.println("Ingresar el tiempo de los otros 9 corredores: ");
        for (int i = 0; i < 9; i++) {

            System.out.println("Ingresar el tiempo: ");
            double tiempoCorredor = scanner.nextDouble();
            if (tiempoCorredor <= tiempoGanador * 1.15) {
                cuantosCorren++;
            }
        }
        System.out.println("Correran " + cuantosCorren + " corredores.");
    }
}
