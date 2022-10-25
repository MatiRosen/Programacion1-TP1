package ej10;

public class Fecha {

    private int dia, mes, anio;

    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        if (dia > 30){
            this.dia -= 30;
            this.mes++;
        }
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }
}
