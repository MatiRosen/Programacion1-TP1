package programacion1.tp1.ej10;

import java.util.ArrayList;

public class Jugador {

    private String nombre;
    private int edad;

    private ArrayList<Carta> cartas;

    public Jugador(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.cartas = new ArrayList<>();
    }

    public void addCarta(Carta carta){
        this.cartas.add(carta);
    }
}
