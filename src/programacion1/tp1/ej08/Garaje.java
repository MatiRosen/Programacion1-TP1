package programacion1.tp1.ej08;

import java.util.ArrayList;

public class Garaje {

    private String codigo;
    private ArrayList<Vehiculo> vehiculosRetirados, vehiculosEstacionados;
    private Tablero tablero;

    public Garaje(String codigo, Tablero tablero){
        this.codigo = codigo;
        this.tablero = tablero;
        this.vehiculosEstacionados = new ArrayList<>();
        this.vehiculosRetirados = new ArrayList<>();
    }

    public Resultado estacionarVehiculo(String patente){
        Resultado resultado = Resultado.INGRESO_OK;
        Vehiculo vehiculo = buscarVehiculo(patente, this.vehiculosEstacionados);

        if (vehiculo == null){
            vehiculo = buscarVehiculo(patente, this.vehiculosRetirados);
            if (vehiculo != null){
                if (vehiculo.getMesesAdeudados() > 3){
                    resultado = Resultado.NO_ESTACIONA_ADEUDA;
                }
            } else {
                resultado = Resultado.VEHICULO_NO_HABILITADO;
            }
        } else{
            resultado = Resultado.VEHICULO_YA_ESTACIONADO;
        }

        return resultado;
    }

    private Vehiculo buscarVehiculo(String patente, ArrayList<Vehiculo> lista){
        Vehiculo vehiculo = null;
        int contador = 0;

        while (contador < lista.size() && vehiculo == null){
            Vehiculo vehiculoAux = lista.get(contador);
            if (vehiculoAux.getPatente().equals(patente)){
                vehiculo = vehiculoAux;
            } else {
                contador++;
            }
        }

        return vehiculo;
    }

    public void mostrarVehiculosSinLlave(){
        for (Vehiculo vehiculo : vehiculosEstacionados){
            if (tablero.devolverLlave(vehiculo.getPatente()) == null){
                System.out.println("- " + vehiculo.getPatente());
            }
        }
    }

    public boolean esPersonaAutorizada(String dni){
        boolean autorizada = false;
        int contador = 0;

        while (contador < vehiculosEstacionados.size() && !autorizada){
            Vehiculo vehiculo = vehiculosEstacionados.get(contador);
            autorizada = vehiculo.personaAutorizada(dni);
            contador++;
        }

        return autorizada;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCantVehiculosEstacionados(){
        return this.vehiculosEstacionados.size();
    }
}
