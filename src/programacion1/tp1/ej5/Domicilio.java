package programacion1.tp1.ej5;

public class Domicilio {

    private String calle, codigoPostal, provincia;

    public Domicilio(String calle, String codigoPostal, String provincia){
        this.calle = calle;
        this.codigoPostal = codigoPostal;
        this.provincia = provincia;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getCalle() {
        return calle;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }
}
