package programacion1.tp1.ej03;

import java.util.ArrayList;

public class Informe {

    private int cantMaterias;
    private ArrayList<Alumno> alumnos;

    public Informe(int cantMaterias){
        this.cantMaterias = cantMaterias;
        this.alumnos = new ArrayList<>();
    }

    public void addAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }

    public void setCantMaterias(int cantMaterias) {
        this.cantMaterias = cantMaterias;
    }

    public int getCantMaterias() {
        return cantMaterias;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void borrarAlumnos(){
        this.alumnos.clear();
    }

    @Override
    public String toString() {
        return "Informe{" +
                "cantMaterias=" + cantMaterias +
                ", alumnos=" + alumnos +
                '}';
    }
}
