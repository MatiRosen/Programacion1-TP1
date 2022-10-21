public class Test {

	public static void main(String[] args) {
		UtilArrays.mostrarSinRepetidos(new char[] {'I','N','M','I','N','E','N','T','E'});
		System.out.println();
		System.out.println(UtilArrays.esPalindromo(new char[] {'R', 'E', 'C', 'O', 'N', 'O', 'C', 'E', 'R'}));
		UtilArrays.invertir(new char[] {'I','N','M','I','N','E','N','T','E'});
		UtilArrays.rotar1(new char[] {'I','N','M','I','N','E','N','T','E'});
		
		char[] blanco = new char[] {'B','L','A','N','C','O'};
		char[] salmon = new char[] {'S','A','L','M','O','N'};
		UtilArrays.mostrarUnion(blanco, salmon);
		System.out.println();
		UtilArrays.mostrarInterseccion(blanco, salmon);
		System.out.println();
		UtilArrays.mostrarDiferencia(blanco, salmon);
		System.out.println();
		UtilArrays.mostrarDiferenciaSimetrica(blanco, salmon);
	}

}
