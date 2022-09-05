package programacion1.tp1.ej5;

import java.util.ArrayList;

public class Padron {

    private ArrayList<Escuela> escuelas;

    public Padron(){
        this.escuelas = new ArrayList<>();
    }

    public boolean agregarEscuela(Escuela escuela){
        boolean seAgrego = false;

        if (!existeEscuela(escuela.getNombre())){
            this.escuelas.add(escuela);
            seAgrego = true;
        }

        return seAgrego;
    }

    public void agregarVotante(Persona persona, Mesa mesa){
        for (Escuela escuela : escuelas){
            escuela.eliminarVotante(persona);
        }

        mesa.agregarVotante(persona);
    }

    public boolean agregarMesa(Mesa mesa, Escuela escuela){
        boolean seAgrego = false;

        if (!existeMesa(mesa.getNumero())){
            escuela.agregarMesa(mesa);
            seAgrego = true;
        }

        return seAgrego;
    }

    private boolean existeMesa(int numero){
        boolean existe = false;
        int i = 0;

        while (i < escuelas.size() && !existe){
            Escuela escuela = escuelas.get(i);
            existe = escuela.existeMesa(numero);
            i++;
        }

        return existe;
    }

    private boolean existeEscuela(String nombre){
        boolean existe = false;
        int i = 0;
        while (i < escuelas.size() && !existe){
            Escuela escuela = escuelas.get(i);
            if (escuela.getNombre().equals(nombre)){
                existe = true;
            } else{
                i++;
            }
        }

        return existe;
    }
}
