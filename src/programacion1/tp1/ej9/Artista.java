package programacion1.tp1.ej9;

import java.util.ArrayList;

public class Artista {

    private String id, nombre;
    private ArrayList<Cancion> canciones;

    public Artista(String id, String nombre){
        this.id = id;
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
    }

    public String mostrarDuracionPromedio(){
        int total = 0;
        for (Cancion cancion : this.canciones){
            total += cancion.getSegundos();
        }

        double promedio = (double) total / canciones.size();
        int minutos = (int) promedio / 60;
        int segundos = (int) promedio - minutos * 60;

        return minutos + " minutos, " + segundos + " segundos.";
    }

    public boolean esFanDestacado(Usuario usuario){
        int cantidadLikes = 0;
        for (Cancion cancion : this.canciones){
            if (cancion.dioLike(usuario)){
                cantidadLikes++;
            }
        }

        return cantidadLikes >= this.canciones.size() / 2;
    }

    public void borrarUsuario(Usuario usuario){
        for (Cancion cancion : this.canciones){
            cancion.borrarUsuario(usuario);
        }
    }

    public ArrayList<Cancion> primeras5Canciones(){
        ArrayList<Cancion> primerasCanciones = new ArrayList<>();
        int contador = 0;
        while (contador < 5 && contador < this.canciones.size()){
            primerasCanciones.add(this.canciones.get(contador));
            contador++;
        }

        return primerasCanciones;
    }
}
