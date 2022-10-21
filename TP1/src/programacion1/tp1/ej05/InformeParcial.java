package programacion1.tp1.ej05;

public class InformeParcial {

    private int nroMesa, nroOrden;
    private String dniPersona, nombrePersona, apellidoPersona;

    public InformeParcial(int nroMesa, int nroOrden, String dniPersona, String nombrePersona, String apellidoPersona){
        this.nroMesa = nroMesa;
        this.nroOrden = nroOrden;
        this.dniPersona = dniPersona;
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
    }

    public int getNroMesa() {
        return nroMesa;
    }

    public int getNroOrden(){
        return nroOrden;
    }

    public String getDniPersona(){
        return dniPersona;
    }

    public String getNombrePersona(){
        return nombrePersona;
    }

    public String getApellidoPersona(){
        return apellidoPersona;
    }
}
