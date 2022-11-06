package io.github.matirosen.tp5.ej7;

import io.github.matirosen.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaOrdenadaDeAlumnosPorEdad extends ListaOrdenadaNodos<Integer, Alumno> {


    @Override
    public int compare(Alumno dato1, Alumno dato2) {
        return dato2.getEdad() - dato1.getEdad();
    }

    @Override
    public int compareByKey(Integer clave, Alumno elemento) {
        return elemento.getEdad() - clave;
    }
}
