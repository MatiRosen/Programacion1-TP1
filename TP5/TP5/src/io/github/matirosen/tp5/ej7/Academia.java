package io.github.matirosen.tp5.ej7;

public class Academia {

    private ListaOrdenadaDeCursosPorCodigo cursos = new ListaOrdenadaDeCursosPorCodigo();

    public void agregarCurso(Curso curso){
        this.cursos.add(curso);
    }

    public DatoCurso obtenerEstadistica(String codigo){
        Curso curso = this.cursos.search(codigo);
        return curso != null ? new DatoCurso(curso.getTitulo(), curso.getPromedioEdad()) : null;
    }

    public ListaOrdenadaDeCursosPorNivel listadoDeCursosPorNivel(){
        ListaOrdenadaDeCursosPorNivel lista = new ListaOrdenadaDeCursosPorNivel();
        for (Curso curso : this.cursos){
            lista.add(curso);
        }

        return lista;
    }
}
