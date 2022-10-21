public class CartaConPalo extends Carta {

    private Color color;
    private Palo palo;

    public CartaConPalo(Color color, Palo palo){
        this.color = color;
        this.palo = palo;
    }

    public Color getColor(){
        return this.color;
    }

}