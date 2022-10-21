public class Test {

	public static void main(String[] args) {
		int[][] NotasCurso1B = new int[][]{
				{7, 2},
				{8, 5},
				{3, 7},
				{9, 1},
				{4,6},
				{7, 9}
		};
		System.out.print("Parcial");
		for (int j = 0; j < NotasCurso1B[0].length; j++){
			System.out.print(" " + j);
		}
		System.out.println();
		for (int i = 0; i < NotasCurso1B.length; i++){
			System.out.print("Alumno" + i);
			for (int j = 0; j < NotasCurso1B[i].length; j++){
				System.out.print(" " + NotasCurso1B[i][j]);
			}
			System.out.println();
		}

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