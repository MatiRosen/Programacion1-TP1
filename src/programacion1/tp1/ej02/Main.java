package programacion1.tp1.ej02;

public class Main {

    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotelazo", "Caba");

        for (int i = 1; i <= 50; i++){
            Habitacion habitacion = new Habitacion(i, (i)*1000);
            hotel.addHabitacion(habitacion);
            if (i%2==0){
                habitacion.setNombreCliente(i+ "");
                habitacion.setDiasCliente(i);
                if (i%3==0){
                    habitacion.addAdicional(new Adicional(1000, "hoy", TipoAdicional.DESAYUNO));
                }
            }
        }

        System.out.println("Muestro habitaciones disponibles");
        for (Habitacion habitacion : hotel.obtenerHabitacionesDisponibles()){
            System.out.println(habitacion.getNumero());
        }

        System.out.println("Muestro checkout");
        for (int i = 1; i <= 50; i++){
            System.out.println(hotel.realizarCheckout(i));
        }
    }
}
