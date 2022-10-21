package programacion1.tp1.ej06;

public class Materia {

    private String nombre;
    private double notaFinal;

    public Materia(String nombre){
        this.nombre = nombre;
    }

    public boolean setNotaFinal(double notaFinal) {
        boolean sePudo = false;
        if (notaFinal >= 0 && notaFinal <= 10){
            this.notaFinal = notaFinal;
            sePudo = true;
        }

        return sePudo;
    }

    public double getNotaFinal() {
        return notaFinal;
    }
}
