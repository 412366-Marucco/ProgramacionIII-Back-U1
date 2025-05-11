package ProgramacionOrientadaObjetos.Ejercicio8;

public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double perimetro(){
        return ladoA + ladoB + ladoC;
    }
}
