package ej10;

import java.util.ArrayList;

public class Charla {

    private Fecha fecha;
    private String tituloPelicula;
    private int vacantes;
    private ArrayList<String> participantes;

    public Charla(Fecha fecha, String tituloPelicula, int vacantes){
        this.fecha = fecha;
        this.tituloPelicula = tituloPelicula;
        this.vacantes = vacantes;
        this.participantes = new ArrayList<>();
    }

    public void registrarEspectador(String nombre){
        this.participantes.add(nombre);
        vacantes--;
    }

    public boolean estaRegistrado(String nombre){
        return this.participantes.contains(nombre);
    }

    @Override
    public String toString() {
        return "Charla{" +
                "fecha=" + fecha +
                ", tituloPelicula='" + tituloPelicula + '\'' +
                '}';
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public int getVacantes() {
        return vacantes;
    }
}
