package io.github.matirosen.tp5.ej6;

import io.github.matirosen.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaFacturasOrdenadasPorMes extends ListaOrdenadaNodos<Integer, Factura> {

    @Override
    public int compare(Factura dato1, Factura dato2) {
        return dato1.getMes() - dato2.getMes();
    }

    @Override
    public int compareByKey(Integer clave, Factura elemento) {
        return clave - elemento.getMes();
    }
}
