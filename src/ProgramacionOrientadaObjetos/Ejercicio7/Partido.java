package ProgramacionOrientadaObjetos.Ejercicio7;

public class Partido {
    Equipo equipoLocal;
    Equipo equipoVisitante;
    int golesEquipoLocal;
    int golesEquipoVisitante;

    public Partido(Equipo equipoLocal, Equipo equipoVisitante, int golesEquipoLocal, int golesEquipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesEquipoLocal = golesEquipoLocal;
        this.golesEquipoVisitante = golesEquipoVisitante;
    }

    public Equipo getGanador() {
        if(golesEquipoLocal > golesEquipoVisitante) return equipoLocal;
        else if (golesEquipoVisitante > golesEquipoLocal) return equipoVisitante;
        else return null;
    }

    @Override
    public String toString() {
        String resultado = "Resultado: " + equipoLocal.getNombre() + " " + golesEquipoLocal + " - " +
                golesEquipoVisitante + " " + equipoVisitante.getNombre() + ".";
        String ganador = (getGanador() != null) ? "Ganador: " + getGanador().getNombre() + "." : "Empate.";
        return resultado + "\n" + ganador;
    }
}
