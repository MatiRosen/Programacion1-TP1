package io.github.matirosen.tp5.ej7;

import io.github.matirosen.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaOrdenadaDeCursosPorNivel extends ListaOrdenadaNodos<Nivel, Curso> {


    @Override
    public int compare(Curso dato1, Curso dato2) {
        return dato1.getNivel().ordinal() - dato2.getNivel().ordinal();
    }

    @Override
    public int compareByKey(Nivel clave, Curso elemento) {
        return clave.ordinal() - elemento.getNivel().ordinal();
    }
}
