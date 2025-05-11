package ProgramacionOrientadaObjetos.Ejercicio6;

public class Equipo {
    private String nombre;
    private int partidosGanados;
    private int partidosEmpatados;
    private int partidosPerdidos;
    private int golesRealizados;
    private int golesRecibidos;
    private int posicion;

    public Equipo(String nombre, int partidosGanados, int partidosEmpatados, int partidosPerdidos, int golesRealizados, int golesRecibidos, int posicion) {
        this.nombre = nombre;
        this.partidosGanados = partidosGanados;
        this.partidosEmpatados = partidosEmpatados;
        this.partidosPerdidos = partidosPerdidos;
        this.golesRealizados = golesRealizados;
        this.golesRecibidos = golesRecibidos;
        this.posicion = posicion;
    }

    public int puntos() {
        return (partidosGanados * 3) + partidosEmpatados;
    }

    public int diferenciaDeGol() {
        return golesRealizados - golesRecibidos;
    }

    @Override
    public String toString() {
        return "Equipo: " + nombre +
                "\nPosición: " + posicion +
                "\nPuntos: " + puntos() +
                "\nPG: " + partidosGanados +
                ", PE: " + partidosEmpatados +
                ", PP: " + partidosPerdidos +
                "\nGoles a favor: " + golesRealizados +
                ", Goles en contra: " + golesRecibidos +
                ", Diferencia de gol: " + diferenciaDeGol();
    }
}
