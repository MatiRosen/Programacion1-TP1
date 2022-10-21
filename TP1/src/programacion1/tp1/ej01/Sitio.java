package programacion1.tp1.ej01;

import java.util.ArrayList;

public class Sitio {

    private String nombre;
    private final ArrayList<Usuario> usuarios;
    private final ArrayList<Categoria> categorias;

    public Sitio(String nombre){
        this.setNombre(nombre);
        this.usuarios = new ArrayList<>();
        this.categorias = new ArrayList<>();
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void addUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }

    public void addCategoria(Categoria categoria){
        this.categorias.add(categoria);
    }

    public Resultado suscribirseACurso(String idUsuario, String idCurso){
        Resultado resultado = Resultado.USUARIO_INEX;
        Usuario usuario = buscarUsuario(idUsuario);
        if (usuario != null){
            Curso curso = buscarCurso(idCurso);
            if (curso != null){
                if (!curso.esAutor(usuario)){
                    if (!curso.usuarioSuscripto(usuario)){
                        if (usuario.getEsBecado() && !curso.aceptaBecado()){
                            resultado = Resultado.MAX_BECADOS;
                        } else{
                            resultado = Resultado.SUSCRIPTO_OK;
                            curso.addUsuario(usuario);
                        }
                    } else{
                        resultado = Resultado.YA_SUSCRIPTO;
                    }
                } else{
                    resultado = Resultado.ES_AUTOR;
                }
            } else{
                resultado = Resultado.CURSO_INEX;
            }
        }

        return resultado;
    }

    private Usuario buscarUsuario(String id){
        Usuario usuario = null;
        int contador = 0;
        while (contador < usuarios.size() && usuario == null){
            Usuario usuarioAux = usuarios.get(contador);
            if (usuarioAux.getId().equals(id)){
                usuario = usuarioAux;
            } else{
                contador++;
            }
        }

        return usuario;
    }

    private Curso buscarCurso(String id){
        Curso curso = null;
        int contador = 0;

        while (contador < categorias.size() && curso == null){
            Categoria categoria = categorias.get(contador);
            curso = categoria.buscarCurso(id);
            contador++;
        }

        return curso;
    }
}