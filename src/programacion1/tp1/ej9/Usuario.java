package programacion1.tp1.ej9;

public class Usuario {

    private String nombre;
    private EstadoUsuario estadoUsuario;

    public Usuario(String nombre, EstadoUsuario estadoUsuario){
        this.nombre = nombre;
        this.estadoUsuario = estadoUsuario;
    }

    public String getNombre() {
        return nombre;
    }
}
