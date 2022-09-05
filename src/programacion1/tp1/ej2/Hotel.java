package programacion1.tp1.ej2;

import java.util.ArrayList;

public class Hotel {

    private String nombre;
    private String direccion;
    private ArrayList<Habitacion> habitaciones;

    public Hotel(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }

    public ArrayList<Habitacion> obtenerHabitacionesDisponibles(){
        ArrayList<Habitacion> habitacionesDisponibles = new ArrayList<>();
        for (Habitacion habitacion : habitaciones){
            if (!habitacion.estaOcupada()){
                habitacionesDisponibles.add(habitacion);
            }
        }

        return habitacionesDisponibles;
    }

    public void addHabitacion(Habitacion habitacion){
        this.habitaciones.add(habitacion);
    }

    public double realizarCheckout(int numeroHabitacion){
       Habitacion habitacion = buscarHabitacion(numeroHabitacion);
       double precio;
       if (habitacion != null && habitacion.estaOcupada()){
           precio = habitacion.calcularTotal();
           habitacion.desocupar();
       } else{
           precio = -1;
       }

       return precio;
    }

    private Habitacion buscarHabitacion(int numeroHabitacion){
        Habitacion habitacion = null;
        int contador = 0;
        while (contador < habitaciones.size() && habitacion == null){
            Habitacion habitacionAux = habitaciones.get(contador);
            if (habitacionAux.getNumero() == numeroHabitacion){
                habitacion = habitacionAux;
            } else{
                contador++;
            }
        }

        return habitacion;
    }
}
