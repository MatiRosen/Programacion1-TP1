public class CartaNumerica extends CartaConPalo{

    public CartaNumerica(Color color, Palo palo) {
        super(color, palo);
    }


    @Override
    public Color getColor(){
        return Color.ROJO;
    }
}
