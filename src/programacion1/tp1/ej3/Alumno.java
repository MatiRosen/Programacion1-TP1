package programacion1.tp1.ej3;

import java.util.ArrayList;

public class Alumno {

    private String nombre, mail;
    private final ArrayList<Materia> materiasCursadas;

    public Alumno(String nombre, String mail){
        this.nombre = nombre;
        this.mail = mail;
        this.materiasCursadas = new ArrayList<>();
    }

    public void addMateria(Materia materia){
        this.materiasCursadas.add(materia);
    }

    public int getCantMaterias(){
        return materiasCursadas.size();
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", mail='" + mail + '\'' +
                ", materiasCursadas=" + materiasCursadas +
                '}';
    }
}
