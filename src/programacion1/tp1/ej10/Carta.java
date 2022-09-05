package programacion1.tp1.ej10;

public class Carta {

    private PaloCarta paloCarta;
    private int numero;

    public Carta(PaloCarta paloCarta, int numero) {
        this.paloCarta = paloCarta;
        this.setNumero(numero);
    }

    private void setNumero(int numero){
        if (numero > 0 && numero < 13){
            this.numero = numero;
        }
    }
}
