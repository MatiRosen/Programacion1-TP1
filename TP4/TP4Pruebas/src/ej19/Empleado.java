package ej19;

public class Empleado {

    private int dni;
    private String apellido;
    private double sueldo;

    public Empleado(int dni, String apellido, double sueldo) {
        this.dni = dni;
        this.apellido = apellido;
        this.sueldo = sueldo;
    }

    public int getDni() {
        return dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni=" + dni +
                ", apellido='" + apellido + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
