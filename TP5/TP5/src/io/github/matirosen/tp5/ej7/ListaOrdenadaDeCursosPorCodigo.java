package io.github.matirosen.tp5.ej7;

import io.github.matirosen.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaOrdenadaDeCursosPorCodigo extends ListaOrdenadaNodos<String, Curso> {

    @Override
    public int compare(Curso dato1, Curso dato2) {
        return dato1.getCodigo().toLowerCase().compareTo(dato2.getCodigo().toLowerCase());
    }

    @Override
    public int compareByKey(String clave, Curso elemento) {
        return clave.toLowerCase().compareTo(elemento.getCodigo().toLowerCase());
    }
}
