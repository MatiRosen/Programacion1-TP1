package io.github.matirosen.tp5.ej9;

public class Main {

    public static void main(String[] args) {
        System.out.println("Primero por defecto...");
        Saludador saludador = new Saludador();
        saludador.iniciarPrograma();

        System.out.println("Ahora en inglés");
        saludador = new Saludador(Idioma.EN);
        saludador.iniciarPrograma();

    }
}
