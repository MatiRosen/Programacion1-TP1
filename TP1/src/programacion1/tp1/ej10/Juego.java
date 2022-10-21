package programacion1.tp1.ej10;

import java.util.ArrayList;

public class Juego {

    private String nombre;
    private ArrayList<MesaDeJuego> mesasDeJuegos;

    public Juego(String nombre) {
        this.nombre = nombre;
        this.mesasDeJuegos = new ArrayList<>();
    }

    public ArrayList<DisponibilidadJuego> obtenerDisponibilidadJuegos(){
        ArrayList<DisponibilidadJuego> juegosDisponibles = new ArrayList<>();

        for (MesaDeJuego mesaDeJuego : this.mesasDeJuegos){
            juegosDisponibles.add(new DisponibilidadJuego(nombre, mesaDeJuego.getLugaresDisponibles()));
        }

        return juegosDisponibles;
    }

    public MesaDeJuego obtenerMesaDisponibleConMasJugadores(){
        MesaDeJuego mesaDeJuego = null;
        int jugadores = 0;
        for (MesaDeJuego mesaDeJuegoAux : this.mesasDeJuegos){
            boolean tieneLugar = mesaDeJuegoAux.getLugaresDisponibles() > 0;
            if (tieneLugar && mesaDeJuegoAux.getCantJugadores() > jugadores){
                mesaDeJuego = mesaDeJuegoAux;
                jugadores = mesaDeJuego.getCantJugadores();
            }
        }

        return mesaDeJuego;
    }

    public String getNombre() {
        return nombre;
    }
}
