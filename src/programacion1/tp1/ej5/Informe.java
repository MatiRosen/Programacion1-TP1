package programacion1.tp1.ej5;

import java.util.ArrayList;

public class Informe {

    private ArrayList<Integer> nroMesa, nroOrden;
    private ArrayList<String> dniPersona, nombrePersona, apellidoPersona;

    public Informe(){
        this.nroMesa = new ArrayList<>();
        this.nroOrden = new ArrayList<>();
        this.dniPersona = new ArrayList<>();
        this.nombrePersona = new ArrayList<>();
        this.apellidoPersona = new ArrayList<>();
    }

    public void agregarDatosPersona(Persona persona){
        this.dniPersona.add(persona.getDni());
        this.nombrePersona.add(persona.getNombre());
        this.apellidoPersona.add(persona.getApellido());

    }

    public ArrayList<Integer> getNroMesa() {
        return nroMesa;
    }

    public ArrayList<Integer> getNroOrden() {
        return nroOrden;
    }

    public ArrayList<String> getDniPersona() {
        return dniPersona;
    }

    public ArrayList<String> getNombrePersona() {
        return nombrePersona;
    }

    public ArrayList<String> getApellidoPersona() {
        return apellidoPersona;
    }

    public void addNroMesa(int nroMesa){
        this.nroMesa.add(nroMesa);
    }

    public void addNroOrden(int nroOrden){
        this.nroOrden.add(nroOrden);
    }
}
