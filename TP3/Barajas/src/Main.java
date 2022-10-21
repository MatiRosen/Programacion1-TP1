public class Main {

    public static void main(String[] args) {

        CartaConPalo carta = new CartaConLetra(Color.ROJO, Palo.CORAZON, 'J');
        CartaConPalo carta2 = new CartaNumerica(Color.ROJO, Palo.CORAZON);



        System.out.println(carta.getColor());
        System.out.println(carta2.getColor());
    }
}