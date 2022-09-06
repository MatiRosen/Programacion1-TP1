package programacion1.tp1.ej06;

import java.util.ArrayList;

public class Alumno {

    private String nombre, mail;
    private ArrayList<Materia> materiasAprobadas;

    public Alumno(String nombre, String mail){
        this.nombre = nombre;
        this.mail = mail;
        this.materiasAprobadas = new ArrayList<>();
    }

    public void addMateria(String nombre, double notaFinal){
        Materia materia = new Materia(nombre);
        if (materia.setNotaFinal(notaFinal)){
            this.materiasAprobadas.add(materia);
        } else{
            System.out.println("Error. La nota estaba fuera del rango." + notaFinal);
        }
    }

    public boolean tieneCincoAprobadasMin(){
        return this.materiasAprobadas.size() >= 5;
    }

    public double obtenerPromedio(){
        double sumaNotas = 0;

        for (Materia materia : this.materiasAprobadas){
            sumaNotas+= materia.getNotaFinal();
        }

        return sumaNotas / materiasAprobadas.size();
    }

    public String getNombre() {
        return nombre;
    }

    public String getMail() {
        return mail;
    }
}
