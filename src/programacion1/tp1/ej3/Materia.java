package programacion1.tp1.ej3;

public class Materia {

    private String nombre, cuatrimestre;
    private EstadoMateria estadoMateria;

    public Materia(String nombre, String cuatrimestre, EstadoMateria estadoMateria){
        this.nombre = nombre;
        this.cuatrimestre = cuatrimestre;
        this.estadoMateria = estadoMateria;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", cuatrimestre='" + cuatrimestre + '\'' +
                ", estadoMateria=" + estadoMateria +
                '}';
    }
}
