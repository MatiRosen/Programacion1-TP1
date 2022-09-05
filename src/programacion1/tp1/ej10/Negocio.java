package programacion1.tp1.ej10;

import java.util.ArrayList;

public class Negocio {

    private String nombre;
    private ArrayList<Juego> juegos;

    public Negocio(String nombre){
        this.nombre = nombre;
        this.juegos = new ArrayList<>();
    }

    public ArrayList<DisponibilidadJuego> obtenerDisponibilidadJuegos(){
        ArrayList<DisponibilidadJuego> juegosDisponibles = new ArrayList<>();

        for (Juego juego : this.juegos){
            juegosDisponibles.addAll(juego.obtenerDisponibilidadJuegos());
        }

        return juegosDisponibles;
    }

    public Resultado acomodarJugador(String nombreJugador, int edadJugador, String nombreJuego){
        Resultado resultado = Resultado.ASIGNACION_OK;
        Jugador jugador = new Jugador(nombreJugador, edadJugador);
        Juego juego = obtenerJuego(nombreJuego);
        if (juego != null){
            MesaDeJuego mesaDeJuego = juego.obtenerMesaDisponibleConMasJugadores();

            if (mesaDeJuego != null){
                mesaDeJuego.agregarJugador(jugador);
            } else{
                resultado = Resultado.SIN_DISPONIBILIDAD;
            }
        } else {
            resultado = Resultado.JUEGO_NO_ENCONTRADO;
        }

        return resultado;
    }

    private Juego obtenerJuego(String nombre){
        Juego juego = null;
        int contador = 0;

        while (contador < juegos.size() && juego == null){
            Juego juegoAux = juegos.get(contador);
            if (juegoAux.getNombre().equals(nombre)){
                juego = juegoAux;
            } else{
                contador++;
            }
        }

        return juego;
    }
}
