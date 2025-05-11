package ProgramacionOrientadaObjetos.Ejercicio5;

import java.time.LocalDate;

public class Auto {
    private final String marca;
    private final int modelo;
    private double precio;
    private int kilometraje;

    public Auto(int kilometraje, double precio, int modelo, String marca) {
        this.kilometraje = kilometraje;
        this.precio = precio;
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int antiguedad() {
        return LocalDate.now().getYear() - this.modelo;
    }
}
