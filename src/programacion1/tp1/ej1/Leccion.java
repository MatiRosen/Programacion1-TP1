package programacion1.tp1.ej1;

public class Leccion {

    private String nombre;
    private int duracion;
    private TipoLeccion tipoLeccion;

    public Leccion(String nombre, int duracion, TipoLeccion tipoLeccion){
        this.setNombre(nombre);
        this.setDuracion(duracion);
        this.setTipoLeccion(tipoLeccion);
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setDuracion(int duracion){
        this.duracion = duracion;
    }

    public void setTipoLeccion(TipoLeccion tipoLeccion){
        this.tipoLeccion = tipoLeccion;
    }
}
