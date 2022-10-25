package ej10;

public class CicloDeCharlas {

    private int CANT_MAX_CHARLAS = 5;
    private int CANT_MAX_ESPECTADOES = 50;
    private int TANDAS = 2;
    private String nombre;
    private Charla[][] charlas;
    private int espectadores;
    private int cantPeliculas;


    public CicloDeCharlas(String nombreCiclo, String[] peliculas, Fecha fechaInicio, int espectadores){
        this.nombre = nombreCiclo;
        this.setEspectadores(espectadores);
        this.setCharlas(peliculas, fechaInicio);
    }

    private void setCharlas(String[] peliculas, Fecha fechaInicio) {
        if (peliculas.length <= CANT_MAX_CHARLAS){
            this.cantPeliculas = peliculas.length;
            this.charlas = new Charla[TANDAS][cantPeliculas];
            for (int i = 0; i < TANDAS; i++){
                for (int j = 0; j < cantPeliculas; j++){
                    Fecha fecha = new Fecha(fechaInicio.getDia() + j + (i * 10), fechaInicio.getMes(), fechaInicio.getAnio());
                    charlas[i][j] = new Charla(fecha, peliculas[j], espectadores);
                }
            }
        }
    }

    private void setEspectadores(int espectadores) {
        if (espectadores <= CANT_MAX_ESPECTADOES){
            this.espectadores = espectadores;
        }
    }

    public Ticket registrarEspectadorEnCharla(String nombreEspectador, int funcion){
        Ticket ticket = null;
        int tanda = funcion / cantPeliculas;
        if (funcion % cantPeliculas == 0){
            tanda--;
        }
        int numCharla = funcion - (cantPeliculas * tanda) - 1;
        if (tanda < TANDAS && numCharla < charlas[0].length){
            Charla charla = this.charlas[tanda][numCharla];
            if (charla.getVacantes() > 0 && !charla.estaRegistrado(nombreEspectador)){
                ticket = new Ticket(charla.getFecha(), charla.getTituloPelicula(), nombreEspectador);
                charla.registrarEspectador(nombreEspectador);
            }
        }
        return ticket;
    }

    public void verCartelera(){
        System.out.println("Ciclo de Charlas '" + nombre + "' - " + charlas[0][0].getFecha());
        for (int i = 0; i < charlas.length; i++){
            System.out.println("** TANDA " + (i + 1) + " **");
            for (int j = 0; j < charlas[i].length; j++){
                Charla charla = charlas[i][j];
                System.out.println(charla.getFecha() + "   Charla " + (j+1+(i*charlas[i].length)) + "   " + charla.getTituloPelicula() + "   " + charla.getVacantes());
            }
        }
    }
}
