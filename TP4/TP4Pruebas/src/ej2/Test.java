package ej2;

public class Test {

	public static void main(String[] args) {
		Baraja baraja = new Baraja();
		for (int i = 1; i <= 48; i++){
			Palo palo;
			if (i <= 12) {
				palo = Palo.ORO;
			} else if(i <= 24) {
				palo = Palo.BASTO;
			} else if(i <= 36) {
				palo = Palo.ESPADA;
			} else {
				palo = Palo.COPA;
			}
			
			baraja.agregarCarta(new Carta(i - 12*(palo.ordinal()), palo), i-1);
		}
		baraja.agregarCarta(new Carta(5, Palo.BASTO), 4);
		baraja.agregarCarta(new Carta(5, Palo.ORO), 16);
		baraja.imprimirCartas();
		System.out.println(baraja.estaOrdenada());
	}

}
