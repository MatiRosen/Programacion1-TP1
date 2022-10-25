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
		baraja.agregarCarta(new Carta(12, Palo.ORO), 11);
		baraja.agregarCarta(new Carta(12, Palo.BASTO), 23);
		baraja.imprimirCartas();
		System.out.println(baraja.estaOrdenada());
	}

}
