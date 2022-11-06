package io.github.matirosen.tp5.ej3;


public class Main {

    public static void main(String[] args) {
        Impresora impresora = new Impresora();
        Documento documento = new Documento("06/11/2022", 57, true);

        System.out.println("Impresora apagada...");
        System.out.println(impresora.imprimir());

        System.out.println("Impresora prendida...");
        impresora.prender();
        System.out.println(impresora.imprimir());

        System.out.println("Se agrega documento de 29 hojas (impresora sin hojas)");
        impresora.agregarDocumento(documento);
        System.out.println(impresora.imprimir());

        System.out.println("Se agregan 28 hojas");
        impresora.agregarHojas(28);
        System.out.println(impresora.imprimir());

        System.out.println("Se agrega 1 hoja mas");
        impresora.agregarHojas(1);
        System.out.println(impresora.imprimir());

        System.out.println("Se agregan 3 documentos de 15 paginas cada una");
        impresora.agregarDocumento(new Documento("06/11/2022", 15, false));
        impresora.agregarDocumento(new Documento("06/11/2022", 30, true));
        impresora.agregarDocumento(new Documento("06/11/2022", 29, true));
        System.out.println(impresora.imprimir());

        System.out.println("Se agregan 48 hojas");
        impresora.agregarHojas(48);

        System.out.println("Se imprime otra vez");
        System.out.println(impresora.imprimir());

        System.out.println("Se verifica cantidad de hojas");
        System.out.println(impresora.getCantHojas());
    }
}
