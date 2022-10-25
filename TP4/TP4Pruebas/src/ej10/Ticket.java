package ej10;

public class Ticket {

    private Fecha fechaCharla;
    private String pelicula, espectador;

    public Ticket(Fecha fechaCharla, String pelicula, String espectador) {
        this.fechaCharla = fechaCharla;
        this.pelicula = pelicula;
        this.espectador = espectador;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "fechaCharla=" + fechaCharla +
                ", pelicula='" + pelicula + '\'' +
                ", espectador='" + espectador + '\'' +
                '}';
    }
}
