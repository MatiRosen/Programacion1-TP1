package programacion1.tp1.ej10;

import java.util.ArrayList;

public class MesaDeJuego {

    private int numero, cantMaxJugadores;
    private MazoCartas mazoCartas;
    private ArrayList<Jugador> jugadores;

    public MesaDeJuego(int numero, int cantMaxJugadores, MazoCartas mazoCartas){
        this.numero = numero;
        this.cantMaxJugadores = cantMaxJugadores;
        this.mazoCartas = mazoCartas;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador){
        this.jugadores.add(jugador);
    }

    public boolean repartirCartas(){
        boolean sePudo = false;

        if (this.jugadores.size() >= 2){
            boolean quedanCartas = mazoCartas.cartasRestantes() > jugadores.size();
            int vueltas = 1;

            while (vueltas <= 4 && quedanCartas){
                for (Jugador jugador : this.jugadores){ // Se que las cartas alcanzan porque "quedanCartas" es true...
                    jugador.addCarta(mazoCartas.repartirCarta());
                }
                quedanCartas = mazoCartas.cartasRestantes() > jugadores.size();
                vueltas++;
            }

            if (vueltas > 4) sePudo = true;
        }

        return sePudo;
    }

    public int getLugaresDisponibles(){
        return this.cantMaxJugadores - this.jugadores.size();
    }

    public int getCantJugadores() {
        return this.jugadores.size();
    }
}
