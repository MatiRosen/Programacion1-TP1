package programacion1.tp1.ej8;

import java.util.ArrayList;

public class Empresa {

    private String nombre;
    private ArrayList<Garaje> garajes;

    public Empresa(String nombre){
        this.nombre = nombre;
        this.garajes = new ArrayList<>();
    }

    public ArrayList<Informe> obtenerInformeEstadoGarajes(){
        ArrayList<Informe> informes = new ArrayList<>();
        for (Garaje garaje : garajes){
            informes.add(new Informe(garaje.getCodigo(), garaje.getCantVehiculosEstacionados()));
        }

        return informes;
    }


    public void mostrarVehiculosSinLlave(){
        for (Garaje garaje : garajes){
            System.out.println("Codigo de garaje: " + garaje.getCodigo());
            garaje.mostrarVehiculosSinLlave();
        }
    }
}
