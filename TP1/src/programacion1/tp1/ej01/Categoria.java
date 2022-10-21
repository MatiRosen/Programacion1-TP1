package programacion1.tp1.ej01;

import java.util.ArrayList;

public class Categoria {

    private String id;
    private String nombre;
    private ArrayList<Curso> cursos;

    public Categoria(String id, String nombre) {
        this.setId(id);
        this.setNombre(nombre);
        this.cursos = new ArrayList<>();
    }

    public void setId(String id){
        this.id = id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void addCurso(Curso curso){
        this.cursos.add(curso);
    }

    public Curso buscarCurso(String id){
        Curso curso = null;
        int contador = 0;
        while (contador < cursos.size() && curso == null){
            Curso cursoAux = cursos.get(contador);
            if (cursoAux.getId().equals(id)){
                curso = cursoAux;
            } else{
                contador++;
            }
        }

        return curso;
    }
}
