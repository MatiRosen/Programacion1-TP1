package programacion1.tp1.ej01;

import java.util.ArrayList;

public class Curso {

    private String id;
    private String titulo;
    private double precio;
    private int valoracion;
    private Usuario creador;
    private ArrayList<Leccion> lecciones;
    private ArrayList<Usuario> usuariosInscriptos;
    private int cantBecados;
    private final static int MAX_BECADOS = 5;

    public Curso(String id, String titulo, double precio, int valoracion, Usuario creador){
        this.setId(id);
        this.setTitulo(titulo);
        this.setPrecio(precio);
        this.setValoracion(valoracion);
        this.setCreador(creador);
        this.lecciones = new ArrayList<>();
        this.usuariosInscriptos = new ArrayList<>();
        this.cantBecados = 0;
    }

    public void addUsuario(Usuario usuario){
        this.usuariosInscriptos.add(usuario);
        if (usuario.getEsBecado()){
            cantBecados++;
        }
    }

    public void addLeccion(Leccion leccion){
        this.lecciones.add(leccion);
    }

    public boolean usuarioSuscripto(Usuario usuario){
        return usuariosInscriptos.contains(usuario);
    }

    public boolean aceptaBecado(){
        return cantBecados < MAX_BECADOS;
    }

    public boolean esAutor(Usuario usuario){
        return usuario.getId().equals(creador.getId());
    }

    public void setId(String id){
        this.id = id;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public void setValoracion(int valoracion){
        this.valoracion = valoracion;
    }

    public void setCreador(Usuario creador){
        this.creador = creador;
    }

    public String getId() {
        return id;
    }
}
