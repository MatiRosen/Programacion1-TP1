package programacion1.tp1.ej5;

import java.util.ArrayList;

public class Mesa {

    private int numero;
    private ArrayList<Persona> personas;
    private Persona presidenteDeMesa;

    public Mesa(int numero){
        this.numero = numero;
        this.personas = new ArrayList<>();
    }

    public void obtenerInforme(Informe informe){
        for (int i = 0; i < personas.size(); i++){
            informe.addNroMesa(numero);
            informe.addNroOrden(i+1);
            informe.agregarDatosPersona(personas.get(i));
        }
    }

    public void agregarPresidente(Persona presidenteDeMesa){
        if (!personas.contains(presidenteDeMesa)){
            this.agregarVotante(presidenteDeMesa);
        }
        this.presidenteDeMesa = presidenteDeMesa;
    }

    public void agregarVotante(Persona persona){
        this.personas.add(persona);
    }

    public boolean esVotante(Persona persona){
        return personas.contains(persona);
    }

    public boolean esPresidente(Persona persona){
        return presidenteDeMesa == persona;
    }

    public Persona getPresidenteDeMesa(){
        return presidenteDeMesa;
    }

    public void eliminarPresidente(){
        this.presidenteDeMesa = null;
    }

    public void eliminarVotante(Persona persona){
        this.personas.remove(persona);
    }

    public int getNumero() {
        return numero;
    }
}
