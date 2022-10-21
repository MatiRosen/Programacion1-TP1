package programacion1.tp1.ej10;

public class DisponibilidadJuego {

    private String nombre;
    private int cantLugares;

    public DisponibilidadJuego(String nombre, int cantLugares){
        this.nombre = nombre;
        this.cantLugares = cantLugares;
    }

    public int getCantLugares() {
        return cantLugares;
    }
}
