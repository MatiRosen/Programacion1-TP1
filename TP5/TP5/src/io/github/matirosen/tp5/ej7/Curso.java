package io.github.matirosen.tp5.ej7;

import java.util.ArrayList;

public class Curso {

    private String codigo, titulo;
    private Nivel nivel;
    private int duracion;

    private ArrayList<Alumno> inscriptos = new ArrayList<>();

    public Curso(String codigo, String titulo, Nivel nivel, int duracion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.nivel = nivel;
        this.duracion = duracion;
    }

    public void agregarAlumno(Alumno alumno){
        this.inscriptos.add(alumno);
    }

    public int getDuracion() {
        return duracion;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPromedioEdad() {
        double promedioEdad = 0;

        for (Alumno alumno : this.inscriptos){
            promedioEdad += alumno.getEdad();
        }

        return promedioEdad / inscriptos.size();
    }

    public ListaOrdenadaDeAlumnosPorEdad top5AlumnosMasLongevos(){
        ListaOrdenadaDeAlumnosPorEdad lista = new ListaOrdenadaDeAlumnosPorEdad();

        for (Alumno alumno : this.inscriptos){
            lista.add(alumno);
        }

        while (lista.size() > 5){
            lista.removeAt(lista.size() - 1);
        }
        return lista;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", nivel=" + nivel +
                ", duracion=" + duracion +
                ", inscriptos=" + inscriptos +
                '}';
    }
}
