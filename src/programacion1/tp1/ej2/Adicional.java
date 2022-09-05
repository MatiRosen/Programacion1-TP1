package programacion1.tp1.ej2;

public class Adicional {

    private double precio;
    private String fecha;
    private TipoAdicional tipoAdicional;

    public Adicional(double precio, String fecha, TipoAdicional tipoAdicional){
        this.precio = precio;
        this.fecha = fecha;
        this.tipoAdicional = tipoAdicional;
    }

    public double getPrecio() {
        return precio;
    }
}
