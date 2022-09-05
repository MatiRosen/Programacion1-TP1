package programacion1.tp1.ej2;

import java.util.ArrayList;

public class Habitacion {

    private int numero;
    private double precioDiario;
    private boolean ocupada;
    private String nombreCliente;
    private int diasCliente;
    private ArrayList<Adicional> adicionales;

    public Habitacion(int numero, double precioDiario){
        this.numero = numero;
        this.precioDiario = precioDiario;
        this.ocupada = false;
        this.adicionales = new ArrayList<>();
    }

    public void desocupar(){
        ocupada = false;
        nombreCliente = null;
        diasCliente = 0;
        adicionales = new ArrayList<>();
    }

    public void setNombreCliente(String nombreCliente) {
        ocupada = true;
        this.nombreCliente = nombreCliente;
    }

    public void setDiasCliente(int diasCliente) {
        this.diasCliente = diasCliente;
    }

    public void addAdicional(Adicional adicional) {
        this.adicionales.add(adicional);
    }

    public double calcularTotal(){
        double total = precioDiario*diasCliente;
        for (Adicional adicional : adicionales){
            total+= adicional.getPrecio();
        }

        return total;
    }

    public int getNumero() {
        return numero;
    }

    public boolean estaOcupada() {
        return ocupada;
    }
}
