package programacion1.tp1.ej05;

public class Persona {

    private String nombre, apellido, dni, fechaNacimiento;
    private Genero genero;
    private Domicilio domicilio;

    public Persona(String nombre, String apellido, String dni, String fechaNacimiento, Genero genero, Domicilio domicilio){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }
}
