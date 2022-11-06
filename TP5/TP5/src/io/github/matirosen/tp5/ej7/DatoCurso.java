package io.github.matirosen.tp5.ej7;

public class DatoCurso {

    private String titulo;
    private double promedioEdad;

    public DatoCurso(String titulo, double promedioEdad) {
        this.titulo = titulo;
        this.promedioEdad = promedioEdad;
    }

    @Override
    public String toString() {
        return "DatoCurso{" +
                "titulo='" + titulo + '\'' +
                ", promedioEdad=" + promedioEdad +
                '}';
    }
}
