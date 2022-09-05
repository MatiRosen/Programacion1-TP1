package programacion1.tp1.ej10;

import java.util.ArrayList;

public class MazoCartas {

    private ArrayList<Carta> cartas;

    public MazoCartas(){
        this.cartas = new ArrayList<>();
    }

    public Carta repartirCarta(){
        Carta carta = null;

        if (!cartas.isEmpty()){
            carta = cartas.remove(0);
        }
        return carta;
    }

    public int cartasRestantes(){
        return this.cartas.size();
    }
}
