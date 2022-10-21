public class CartaConLetra extends CartaConPalo{

    private char letra;
    public CartaConLetra(Color color, Palo palo, char letra){
        super(color, palo);
        this.letra = letra;
    }

    @Override
    public Color getColor(){
        return Color.NEGRO;
    }
}
