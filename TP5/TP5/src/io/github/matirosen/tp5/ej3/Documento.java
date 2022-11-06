package io.github.matirosen.tp5.ej3;

public class Documento {

    private String fecha;
    private int carillas;
    private boolean dobleFaz;

    public Documento(String fecha, int carillas, boolean dobleFaz){
        this.fecha = fecha;
        this.carillas = carillas;
        this.dobleFaz = dobleFaz;
    }

    public int getCarillas() {
        return carillas;
    }

    public String getFecha() {
        return fecha;
    }

    public boolean esDobleFaz() {
        return dobleFaz;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "fecha='" + fecha + '\'' +
                ", carillas=" + carillas +
                ", dobleFaz=" + dobleFaz +
                '}';
    }
}
