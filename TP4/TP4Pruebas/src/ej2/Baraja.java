package ej2;

public class Baraja {
	
	private Carta[] cartas;
	
	public Baraja() {
		this.cartas = new Carta[48];
	}
	
	public void agregarCarta(Carta carta, int i) {
		this.cartas[i] = carta;
	}
	
	public void imprimirCartas() {
		for (Carta carta: this.cartas) {
			System.out.println(carta);
		}
	}
	
	public boolean estaOrdenada() {
		int i = 0;
		boolean ordenada = true;
		
		while(i < this.cartas.length && ordenada){
			Carta carta = cartas[i];
			if (i - 12*(carta.getPalo().ordinal()) != carta.getNumero()-1) {
				ordenada = false;
			}
			i++;
		}
		
		return ordenada;
	}

}