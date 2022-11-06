package io.github.matirosen.tp5.ej7;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Academia academia = new Academia();
        Curso curso1 = new Curso("A", "Matematica", Nivel.INTERMEDIO, 2);
        Curso curso2 = new Curso("C", "Lengua", Nivel.BASICO, 1);
        Curso curso3 = new Curso("B", "Analisis Numerico", Nivel.AVANZADO, 5);

        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno(1, 22, "Matias1"));
        alumnos.add(new Alumno(2, 20, "Matias2"));
        alumnos.add(new Alumno(3, 13, "Matias3"));
        alumnos.add(new Alumno(4, 27, "Matias4"));
        alumnos.add(new Alumno(5, 18, "Matias5"));
        alumnos.add(new Alumno(6, 21, "Matias6"));
        alumnos.add(new Alumno(7, 32, "Matias7"));
        alumnos.add(new Alumno(8, 23, "Matias8"));


        for (Alumno alumno : alumnos){
            curso1.agregarAlumno(alumno);
            if (alumno.getDni() != 4){
                curso2.agregarAlumno(alumno);
                if (alumno.getDni() != 7){
                    curso3.agregarAlumno(alumno);
                }
            }
        }

        academia.agregarCurso(curso1);
        academia.agregarCurso(curso2);
        academia.agregarCurso(curso3);


        System.out.println(academia.obtenerEstadistica("B"));
        for (Curso curso : academia.listadoDeCursosPorNivel()){
            System.out.println(curso);
        }
        for (Alumno alumno : curso1.top5AlumnosMasLongevos()){
            System.out.println(alumno);
        }
    }
}
