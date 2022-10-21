package programacion1.tp1.ej04;

public class Main {

    public static void main(String[] args) {
        Droide droide1 = new Droide(true);
        Droide droide2 = new Droide(false);
        Droide droide3 = new Droide(false);
        Droide droide4 = new Droide(false);

        Pieza pieza1 = new Pieza("Rueda");
        Pieza pieza2 = new Pieza("Brazo");
        Pieza pieza3 = new Pieza("Antena");
        Pieza pieza4 = new Pieza("Bateria");
        Pieza pieza5 = new Pieza("SensorDelantero");
        Pieza pieza6 = new Pieza("SensorTrasero");

        droide1.agregarPiezaFuncional(pieza1);
        droide1.agregarPiezaFuncional(pieza2);
        droide1.agregarPiezaRota(pieza3);
        droide1.agregarPiezaRota(pieza4);
        droide1.agregarPiezaRota(pieza5);
        droide1.agregarPiezaRota(pieza6);

        droide2.agregarPiezaFuncional(pieza1);
        droide2.agregarPiezaFuncional(pieza2);
        droide2.agregarPiezaFuncional(pieza3);
        droide2.agregarPiezaRota(pieza4);
        droide2.agregarPiezaRota(pieza5);
        droide2.agregarPiezaRota(pieza6);

        droide3.agregarPiezaFuncional(pieza1);
        droide3.agregarPiezaFuncional(pieza2);
        droide3.agregarPiezaFuncional(pieza3);
        droide3.agregarPiezaFuncional(pieza4);
        droide3.agregarPiezaRota(pieza5);
        droide3.agregarPiezaRota(pieza6);

        droide4.agregarPiezaFuncional(pieza1);
        droide4.agregarPiezaFuncional(pieza2);
        droide4.agregarPiezaFuncional(pieza3);
        droide4.agregarPiezaFuncional(pieza4);
        droide4.agregarPiezaFuncional(pieza5);
        droide4.agregarPiezaFuncional(pieza6);

        droide1.registrarDroide(droide2);
        droide1.registrarDroide(droide3);
        droide1.registrarDroide(droide4);

        System.out.println(droide1.autoRepararse());
    }
}
