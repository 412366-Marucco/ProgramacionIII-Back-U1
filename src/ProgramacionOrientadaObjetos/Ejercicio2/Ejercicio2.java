//2. Crear una clase Punto que permita representar puntos en un plano de un sistema
//de coordenadas cartesianas. Crear un programa que permita ingresar los datos
//de dos puntos y con ellos cree dos instancias de la clase Punto. A partir de las
//instancias creadas calcular y mostrar la distancia existente entre ambos puntos.

package ProgramacionOrientadaObjetos.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Punto> listaPuntos = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese la coordenada X del punto:");
            int coordenadaX = scanner.nextInt();
            System.out.println("Ingrese la coordenada Y del punto:");
            int coordenadaY = scanner.nextInt();

            listaPuntos.add(new Punto(coordenadaX, coordenadaY));
        }

        Punto p1 = listaPuntos.get(0);
        Punto p2 = listaPuntos.get(1);

        double distancia = p1.distanciaA(p2);
        System.out.println("La distancia entre ambos puntos es: " + distancia);
    }
}
