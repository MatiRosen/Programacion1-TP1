package programacion1.tp1.ej06;

import java.util.ArrayList;

public class Carrera {
    private String nombre;
    private ArrayList<Alumno> alumnos;
    private static final int MAX_POR_LISTA = 20;

    public Carrera(String nombre){
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }

    public ArrayList<Candidato> obtenerCandidatos(double promedioMinimo){
        ArrayList<Candidato> candidatos = new ArrayList<>();
        int contador = 0;

        while (candidatos.size() < MAX_POR_LISTA && contador < alumnos.size()){
            Alumno alumno = alumnos.get(contador);
            if (cumpleCondiciones(alumno, promedioMinimo)){
                candidatos.add(new Candidato(alumno.getNombre(), alumno.getMail()));
            }
            contador++;
        }

        return candidatos;
    }

    private boolean cumpleCondiciones(Alumno alumno, double promedio){
        return alumno.tieneCincoAprobadasMin() && alumno.obtenerPromedio() >= promedio;
    }
}
