//8. Dado el valor de los tres lados de un triángulo se necesita calcular su perímetro.
//Se pide crear en el método main() un objeto y determinar si el perímetro es superior
//a 10. Determinar la o las clases necesarias, sus atributos y métodos.

package ProgramacionOrientadaObjetos.Ejercicio8;

public class Ejercicio8 {
    public static void main(String[] args){
        Triangulo triangulo = new Triangulo(10, 20, 30);
        double perimetro = triangulo.perimetro();

        System.out.println("Perímetro del triángulo: " + perimetro);

        if (perimetro > 10) {
            System.out.println("El perímetro es mayor a 10.");
        } else {
            System.out.println("El perímetro no es mayor a 10.");
        }
    }
}
