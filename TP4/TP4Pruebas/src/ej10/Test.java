package ej10;

public class Test {

    public static void main(String[] args) {
        String[] peliculas = new String[]{"Alien", "Mars Attack", "Encuentros Cercanos", "Avatar", "El arribo"};
        Fecha fecha = new Fecha(22, 9, 2022);
        CicloDeCharlas cicloDeCharlas = new CicloDeCharlas("Visitantes", peliculas, fecha, 50);

        System.out.println(cicloDeCharlas.registrarEspectadorEnCharla("Eloy Ente", 1));
        System.out.println(cicloDeCharlas.registrarEspectadorEnCharla("Juan Pirulo", 8));
        System.out.println(cicloDeCharlas.registrarEspectadorEnCharla("Eloy Ente", 8));
        System.out.println(cicloDeCharlas.registrarEspectadorEnCharla("Eloy Ente", 10));

        cicloDeCharlas.verCartelera();
    }
}
