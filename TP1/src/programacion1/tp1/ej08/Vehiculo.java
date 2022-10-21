package programacion1.tp1.ej08;

import java.util.ArrayList;

public class Vehiculo {

    private Llave llave;
    private String patente;
    private int mesesAdeudados;

    private ArrayList<Persona> personasAutorizadas;

    public Vehiculo(String patente, Llave llave){
        this.patente = patente;
        this.llave = llave;
        this.personasAutorizadas = new ArrayList<>();
    }

    public int getMesesAdeudados(){
        return mesesAdeudados;
    }

    public String getPatente() {
        return patente;
    }

    public boolean personaAutorizada(String dni){
        boolean autorizada = false;
        int contador = 0;

        while (contador < personasAutorizadas.size() && !autorizada){
            Persona persona = personasAutorizadas.get(contador);
            if (persona.getDni().equals(dni)){
                autorizada = true;
            } else {
                contador++;
            }
        }

        return autorizada;
    }
}
