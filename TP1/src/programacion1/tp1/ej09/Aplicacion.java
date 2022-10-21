package programacion1.tp1.ej09;

import java.util.ArrayList;

public class Aplicacion {

    private String nombre;
    private ArrayList<Artista> artistas;
    private ArrayList<Usuario> usuarios;

    public Aplicacion(String nombre){
        this.nombre = nombre;
        this.artistas = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public Usuario borrarUsuario(String nombre){
        Usuario usuario = buscarusuario(nombre);

        if (usuario != null){
            usuarios.remove(usuario);
            for (Artista artista : this.artistas){
                artista.borrarUsuario(usuario);
            }
        }


        return usuario;
    }

    private Usuario buscarusuario(String nombre){
        Usuario usuario = null;
        int contador = 0;

        while (contador < usuarios.size() && usuario == null){
            Usuario usuarioAux = this.usuarios.get(contador);

            if (usuarioAux.getNombre().equals(nombre)){
                usuario = usuarioAux;
            } else{
                contador++;
            }
        }

        return usuario;
    }

}