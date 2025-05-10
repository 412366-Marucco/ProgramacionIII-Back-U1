package ProgramacionOrientadaObjetos.Ejercicio2;

public class Punto {
    private final int coordenadaX;
    private final int coordenadaY;

    public Punto(int coordenadaX, int coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public double distanciaA(Punto otro) {
        int x1 = this.coordenadaX;
        int y1 = this.coordenadaY;
        int x2 = otro.getCoordenadaX();
        int y2 = otro.getCoordenadaY();

        int dx = x2 - x1;
        int dy = y2 - y1;

        double distancia = Math.sqrt(dx * dx + dy * dy);
        return distancia;
    }
}
