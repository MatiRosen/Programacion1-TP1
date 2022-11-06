package io.github.matirosen.tp5.ej6;


public class Edificio {

    private ColaFacturas[] colasFacturas;

    public Edificio(){
        this.colasFacturas = new ColaFacturas[TipoFactura.values().length];
        for (TipoFactura tipo : TipoFactura.values()){
            this.colasFacturas[tipo.ordinal()] = new ColaFacturas();
        }
    }

    public void catalogar(PilaFacturas pila){
        for (Factura factura : ordenarPorMes(pila)){
            ColaFacturas cola = colasFacturas[factura.getTipo().ordinal()];
            cola.add(factura);
        }
    }

    private ListaFacturasOrdenadasPorMes ordenarPorMes(PilaFacturas pila){
        ListaFacturasOrdenadasPorMes lista = new ListaFacturasOrdenadasPorMes();

        while (!pila.isEmpty()){
            lista.add(pila.pop());
        }

        return lista;
    }

    public double[] montoAAbonarPorTipo(){
        double[] montos = new double[TipoFactura.values().length];


        for (int i = 0; i < colasFacturas.length; i++){
            montos[i] = montoAAbonarPorTipo(colasFacturas[i]);
        }

        return montos;
    }

    private double montoAAbonarPorTipo(ColaFacturas cola){
        double cant = 0;

        Factura centinela = new Factura(-1, -1, -1, TipoFactura.INTERNET);
        cola.add(centinela);
        Factura facturaAux = cola.remove();
        while (facturaAux.getMes() != centinela.getMes()){
            cola.add(facturaAux);
            cant += facturaAux.getMonto();
            facturaAux = cola.remove();
        }

        return cant;
    }

}
