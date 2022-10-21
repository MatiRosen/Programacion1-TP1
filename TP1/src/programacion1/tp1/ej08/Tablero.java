package programacion1.tp1.ej08;

import java.util.ArrayList;

public class Tablero {

    private ArrayList<Llave> llaves;

    public Tablero(){
        this.llaves = new ArrayList<>();
    }

    public Llave devolverLlave(String patente){
        Llave llave = null;
        int contador = 0;
        while (contador < this.llaves.size() && llave == null){
            Llave llaveAux = this.llaves.get(contador);
            if (llaveAux.getPatenteVehiculo().equals(patente)){
                llave = llaveAux;
            } else {
                contador++;
            }
        }

        return llave;
    }


}
