package io.github.matirosen.tp5.ej6;

public class Main {

    public static void main(String[] args) {
        Edificio edificio = new Edificio();

        Factura factura1 = new Factura(123, 2, 500, TipoFactura.INTERNET);
        Factura factura2 = new Factura(1234, 1, 250, TipoFactura.LUZ);
        Factura factura3 = new Factura(12345, 7, 200, TipoFactura.ABL);
        Factura factura4 = new Factura(123456, 10, 1000, TipoFactura.INTERNET);
        Factura factura5 = new Factura(1234567, 12, 150, TipoFactura.AGUA);
        Factura factura6 = new Factura(12345678, 4, 350, TipoFactura.ABL);

        PilaFacturas pilaFacturas = new PilaFacturas();
        pilaFacturas.push(factura1);
        pilaFacturas.push(factura2);
        pilaFacturas.push(factura3);
        pilaFacturas.push(factura4);
        pilaFacturas.push(factura5);
        pilaFacturas.push(factura6);

        edificio.catalogar(pilaFacturas);

        for (int i = 0; i < TipoFactura.values().length; i++){
            System.out.println("Debo $" + edificio.montoAAbonarPorTipo()[i] + " de " + TipoFactura.values()[i]);
        }
    }
}
