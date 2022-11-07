package io.github.matirosen.tp5.ej9;

import java.util.Scanner;

public class Saludador {

    private Idioma idioma;
    private static final Idioma IDIOMA_DEFECTO = Idioma.ES;

    public Saludador(){
        this(IDIOMA_DEFECTO);
    }

    public Saludador(Idioma idioma){
        if (idioma != null){
            this.idioma = idioma;
        } else{
            this.idioma = IDIOMA_DEFECTO;
        }
    }

    public void iniciarPrograma(){
        System.out.println(Diccionario.getValor(idioma, Termino.BIENVENIDA));
        System.out.println(Diccionario.getValor(idioma, Termino.PEDIR_NOMBRE));
        String nombre = new Scanner(System.in).nextLine();
        System.out.println(Diccionario.getValor(idioma, Termino.SALUDO) + " " + nombre);
        System.out.println(Diccionario.getValor(idioma, Termino.DESPEDIDA));
    }

}