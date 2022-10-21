package ej2;

public class Carta {
	
	private int numero;
	private Palo palo;

	public Carta(int numero, Palo palo) {
		this.numero = numero;
		this.palo = palo;
	}
	
	public Palo getPalo() {
		return palo;
	}
	
	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Carta [numero=" + numero + ", palo=" + palo + "]";
	}

}
