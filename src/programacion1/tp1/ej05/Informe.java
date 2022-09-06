package programacion1.tp1.ej05;

import java.util.ArrayList;

public class Informe {

    private ArrayList<InformeParcial> informesParciales;


    public Informe(){
        this.informesParciales = new ArrayList<>();
    }

    public void agregarPersona(Persona persona, int nroMesa, int nroOrden){
        this.informesParciales.add(new InformeParcial(nroMesa, nroOrden, persona.getDni(), persona.getNombre(), persona.getApellido()));
    }

    public ArrayList<InformeParcial> getInformesParciales() {
        return informesParciales;
    }
}
