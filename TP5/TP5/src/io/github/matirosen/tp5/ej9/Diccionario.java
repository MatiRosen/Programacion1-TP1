package io.github.matirosen.tp5.ej9;

public class Diccionario {

    private static final String[][] DICCIONARIO = new String[][]{
            {"¡Bienvenid@!", "Ingresá tu nombre", "Hola", "¡Adiós!"},
            {"Welcome!", "Enter your name", "Hello", "Goodbye!"}
    };



    public static String getValor(Idioma idioma, Termino termino){
        return DICCIONARIO[idioma.ordinal()][termino.ordinal()];
    }
}
