package io.github.matirosen.tp5.ej6;

public class Factura {

    private int codigoDeBarras, mes;
    private double monto;
    private TipoFactura tipoFactura;

    public Factura(int codigoDeBarras, int mes, double monto, TipoFactura tipoFactura) {
        this.codigoDeBarras = codigoDeBarras;
        this.mes = mes;
        this.monto = monto;
        this.tipoFactura = tipoFactura;
    }

    public int getMes() {
        return mes;
    }

    public double getMonto() {
        return monto;
    }

    public TipoFactura getTipo() {
        return tipoFactura;
    }
}
