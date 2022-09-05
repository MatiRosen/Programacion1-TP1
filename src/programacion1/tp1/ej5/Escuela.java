package programacion1.tp1.ej5;

import java.util.ArrayList;

public class Escuela {

    private String nombre;
    private Domicilio domicilio;
    private ArrayList<Mesa> mesas;

    public Escuela(String nombre, Domicilio domicilio){
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.mesas = new ArrayList<>();
    }

    public void designarPresidenteDeMesa(Mesa mesa, Persona persona){
        this.eliminarDeOtrasMesas(persona);
        mesa.agregarPresidente(persona);
    }

    public void eliminarVotante(Persona persona){
        for (Mesa mesa : this.mesas){
            if (mesa.esVotante(persona))
                mesa.eliminarVotante(persona);
        }
    }

    public Informe obtenerInforme(){
        Informe informe = new Informe();
        for(Mesa mesa : this.mesas){
            mesa.obtenerInforme(informe);
        }

        return informe;
    }

    private void eliminarDeOtrasMesas(Persona persona){
        boolean seElimino = false;
        int i = 0;

        while (i < mesas.size() && !seElimino){
            Mesa mesa = mesas.get(i);

            if (mesa.esPresidente(persona)){
                mesa.eliminarPresidente();
                mesa.eliminarVotante(persona);
                seElimino = true;
            } else if (mesa.esVotante(persona)){
                mesa.eliminarVotante(persona);
                seElimino = true;
            } else{
                i++;
            }
        }
    }

    public boolean existeMesa(int numero){
        boolean existe = false;
        int i = 0;

        while (i < mesas.size() && !existe){
            Mesa mesa = mesas.get(i);
            if (mesa.getNumero() == numero){
                existe = true;
            } else{
                i++;
            }
        }

        return existe;
    }

    public void agregarMesa(Mesa mesa){
        this.mesas.add(mesa);
    }

    public String getNombre() {
        return nombre;
    }
}
