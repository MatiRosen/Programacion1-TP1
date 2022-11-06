package io.github.matirosen.tp5.ej7;

public class Alumno {

    private int dni, edad;
    private String nombre;

    public Alumno(int dni, int edad, String nombre) {
        this.dni = dni;
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "dni=" + dni +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
