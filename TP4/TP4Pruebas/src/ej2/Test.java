package ej2;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		char[][] alumnosPorClase = new char[][]{
				{'P', 'P','P','P','P','P','T','P','P','P','P','P'},
				{'A', 'P','P','P','P','P','A','P','P','P','T','P'},
				{'T', 'P','A','P','P','P','P','P','P','P','P','P'},
				{'P', 'P','T','T','A','A','A','A','A','P','P','A'},
				{'T', 'P','A','P','P','A','P','P','A','P','P','A'},
				{'P', 'P','P','P','T','T','P','P','P','P','A','P'},
				{'P', 'T','A','P','P','P','T','T','A','P','P','A'},
				{'P', 'P','P','P','A','A','T','P','P','P','P','A'},
				{'P', 'P','A','P','A','T','P','P','T','P','P','P'}
		};

		for (int i = 0; i < alumnosPorClase.length; i++){
			int faltasSeguidas = 0;
			int j = 0;
			while (j < alumnosPorClase[i].length && faltasSeguidas <= 4){
				if (alumnosPorClase[i][j] == 'A'){
					faltasSeguidas++;
				} else {
					faltasSeguidas = 0;
				}
				j++;
			}
			System.out.println(faltasSeguidas > 4);
		}

/*

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
		System.out.println(baraja.estaOrdenada());*/
	}

}
