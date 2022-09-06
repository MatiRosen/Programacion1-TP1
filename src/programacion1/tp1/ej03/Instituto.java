package programacion1.tp1.ej03;

import java.util.ArrayList;

public class Instituto {

    private String nombre;
    private ArrayList<Carrera> carreras;

    public Instituto(String nombre){
        this.nombre = nombre;
        this.carreras = new ArrayList<>();
    }

    public void addCarrera(Carrera carrera){
        this.carreras.add(carrera);
    }


}
