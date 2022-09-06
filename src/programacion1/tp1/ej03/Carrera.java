package programacion1.tp1.ej03;

import java.util.ArrayList;

public class Carrera {

    private String nombre;
    private ArrayList<Alumno> alumnos;

    public Carrera(String nombre){
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
    }

    public Informe getInformeMaxMaterias(){
        Informe informe = new Informe(0);

        for (Alumno alumno : alumnos){
            int cantMateriasAlumno = alumno.getCantMaterias();
            if (cantMateriasAlumno > informe.getCantMaterias()){
                informe.borrarAlumnos();
                informe.addAlumno(alumno);
                informe.setCantMaterias(cantMateriasAlumno);
            } else if (cantMateriasAlumno == informe.getCantMaterias()){
                informe.addAlumno(alumno);
            }
        }

        return informe;
    }

    public void addAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", alumnos=" + alumnos +
                '}';
    }
}
