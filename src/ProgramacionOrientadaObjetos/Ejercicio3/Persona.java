package ProgramacionOrientadaObjetos.Ejercicio3;

public class Persona {
    private final String nombre;
    private final String apellido;
    private final int edad;
    private double altura;
    private double peso;


    public Persona(String nombre, String apellido, int edad, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getIMC() {
        return peso / Math.pow(altura, 2);
    }


    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + ", Altura: " + altura + " , Peso: " + peso + ", IMC: " + getIMC();
    }
}
