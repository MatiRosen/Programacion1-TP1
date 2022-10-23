public class UtilArrays {

	
	public static void mostrarSinRepetidos(char[] elementos) {
		for (int i = 0; i < elementos.length; i++) {
			boolean repetido = false;
			int j = 0;
			while(j < i && !repetido) {
				if (elementos[j] == elementos[i]) repetido = true;
				j++;
			}
			if (!repetido) {
				System.out.print(elementos[i]);
			}
		}
	}
	
	public static boolean esPalindromo(char[] elementos) {
		boolean palindromo = true;
		int i = 0;
		int j = elementos.length-1;
		while (palindromo && i <= j) {
			j = elementos.length-(i+1);
			if (elementos[i] != elementos[j]) {
				palindromo = false;
			}
			i++;
		}
		return palindromo;
	}
	
	public static void invertir(char[] elementos) {
		int i = 0;
		int j = elementos.length - 1;
		while (i < j) {
			j = elementos.length-(i+1);
			char aux = elementos[i];
			elementos[i] = elementos[j];
			elementos[j] = aux;
			i++;
		}
		System.out.println(elementos);
	}
	
	public static void rotar1(char[] elementos) {
		for (int i = 1; i < elementos.length; i++) {
			char aux = elementos[i];
			elementos[i] = elementos[0];
			elementos[0] = aux;
		}
		System.out.println(elementos);
	}
	
	public static void mostrarUnion(char[] cjto1, char[] cjto2) {
		System.out.print(cjto1);
		for (char c : cjto2) {
			boolean repetido = false;
			int j = 0;
			while (!repetido && j < cjto1.length) {
				if (c == cjto1[j]) {
					repetido = true;
				}
				j++;
			}

			if (!repetido) {
				System.out.print(c);
			}
		}
	}
	
	public static void mostrarInterseccion(char[] cjto1, char[] cjto2) {
		for (char c : cjto1) {
			boolean repetido = false;
			int j = 0;
			while (!repetido && j < cjto2.length) {
				if (c == cjto2[j]) {
					repetido = true;
				}
				j++;
			}

			if (repetido) {
				System.out.print(c);
			}
		}
	}
	
	public static void mostrarDiferencia(char[] cjto1, char[] cjto2) {
		for (char c : cjto1) {
			boolean repetido = false;
			int j = 0;
			while (!repetido && j < cjto2.length) {
				if (c == cjto2[j]) {
					repetido = true;
				}
				j++;
			}

			if (!repetido) {
				System.out.print(c);
			}
		}
	}
	
	public static void mostrarDiferenciaSimetrica(char[] cjto1, char[] cjto2) {
		// Manera 1:
		UtilArrays.mostrarDiferencia(cjto1, cjto2);
		UtilArrays.mostrarDiferencia(cjto2, cjto1);
		System.out.println();
		// Manera 2 (ES HORRIBLE, NO HACER!)
		int total = cjto1.length + cjto2.length;
		for (int i = 0; i < total; i++) {
			int j = 0;
			boolean repetido = false;
			while (j < total && !repetido) {
				if (i != j) {
					if (i < cjto1.length) {
						if (j < cjto1.length) {
							if (cjto1[i] == cjto1[j]) repetido = true;
						} else {
							if (cjto1[i] == cjto2[j - cjto1.length]) repetido = true;
						}
					} else {
						if (j < cjto1.length) {
							if (cjto2[i - cjto1.length] == cjto1[j]) repetido = true;
						} else {
							if (cjto2[i - cjto1.length] == cjto2[j - cjto1.length]) repetido = true;
						}
					}
				}
				j++;
			}
			if (!repetido) {
				if (i < cjto1.length) {
					System.out.print(cjto1[i]);
				} else {
					System.out.print(cjto2[i - cjto1.length]);

				}
			}
		}
		//Manera 3
		System.out.println();
		char[] cjtoAux = new char[cjto1.length + cjto2.length];
		for (int i = 0; i < cjto1.length; i++){
			cjtoAux[i] = cjto1[i];
		}
		for (int i = 0; i < cjto2.length; i++){
			cjtoAux[cjto1.length + i] = cjto2[i];
		}
		for (int i = 0; i < cjtoAux.length; i++){
			boolean repetido = false;
			int j = 0;
			while (j < cjtoAux.length && !repetido){
				if (i != j){
					if (cjtoAux[i] == cjtoAux[j]) repetido = true;
				}
				j++;
			}
			if (!repetido){
				System.out.print(cjtoAux[i]);
			}
		}
	}
}