package programacion1.tp1.ej9;

import java.util.ArrayList;

public class Cancion {

    private String id, nombre;
    private int segundos;
    private ArrayList<Usuario> usuariosLike;

    public Cancion(String id, String nombre, int segundos){
        this.id = id;
        this.nombre = nombre;
        this.segundos = segundos;
        this.usuariosLike = new ArrayList<>();
    }

    public int getSegundos() {
        return segundos;
    }

    public boolean dioLike(Usuario usuario){
        boolean dioLike = false;
        int contador = 0;

        while (contador < usuariosLike.size() && !dioLike){
            Usuario usuarioAux = usuariosLike.get(contador);
            if (usuarioAux.getNombre().equals(usuario.getNombre())){
                dioLike = true;
            } else{
                contador++;
            }
        }

        return dioLike;
    }

    public void borrarUsuario(Usuario usuario){
        this.usuariosLike.remove(usuario);
    }
}
