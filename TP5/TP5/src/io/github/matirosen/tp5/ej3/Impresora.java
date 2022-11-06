package io.github.matirosen.tp5.ej3;

public class Impresora {

    private int cantHojas;
    private boolean encendida;
    private ColaDocumentos colaDocumentos;

    public Impresora(){
        colaDocumentos = new ColaDocumentos();
        this.encendida = false;
        this.cantHojas = 0;
    }

    public void agregarDocumento(Documento documento){
        if (documento != null){
            this.colaDocumentos.add(documento);
        }
    }

    public boolean imprimir(){
        boolean logrado = this.encendida;
        int cantHojasAImprimir = 0;
        if (logrado){
            cantHojasAImprimir = this.obtenerCantHojasAImprimir();
            logrado = cantHojasAImprimir <= this.cantHojas;

            if (logrado){
                this.imprimirTodo();
                this.cantHojas -= cantHojasAImprimir;
            }
        }

        return logrado;
    }

    private void imprimirTodo() {
        while (!colaDocumentos.isEmpty()){
            System.out.println(colaDocumentos.remove());
        }
    }

    private int obtenerCantHojasAImprimir() {
        int cant = 0;
        Documento centinela = new Documento("-1", -1, false);
        colaDocumentos.add(centinela);
        Documento aux = colaDocumentos.remove();
        while (aux.getCarillas() != centinela.getCarillas()){
            colaDocumentos.add(aux);
            int cantAux = aux.getCarillas();
            if (aux.esDobleFaz()){
                if (cantAux % 2 != 0){
                    cantAux++;
                }
                cantAux /= 2;
            }
            cant += cantAux;
            aux = colaDocumentos.remove();
        }
        return cant;
    }

    public void agregarHojas(int cant){
        this.cantHojas += cant;
    }

    public void prender(){
        this.encendida = true;
    }

    public void apagar(){
        this.encendida = false;
    }

    public int getCantHojas() {
        return cantHojas;
    }
}
