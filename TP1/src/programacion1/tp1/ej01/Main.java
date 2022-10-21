package programacion1.tp1.ej01;

public class Main {

    public static void main(String[] args) {
        Sitio sitio = new Sitio("ORTDemy");

        Usuario usuario1 = new Usuario("1", "Mati", "mati@mati", true);
        Usuario usuario2 = new Usuario("2", "Meli", "Meli@Meli", true);
        Usuario usuario3 = new Usuario("3", "Maxi", "Maxi@Maxi", true);
        Usuario usuario4 = new Usuario("4", "Lucas", "Lucas@Lucas", true);
        Usuario usuario5 = new Usuario("5", "Juan", "Juan@Juan", true);
        Usuario usuario6 = new Usuario("6", "Pedro", "Pedro@Pedro", true);
        Usuario usuario7 = new Usuario("7", "Pepe", "Pepe@Pepe", true);
        Usuario usuario8 = new Usuario("8", "Goku", "Goku@Goku", false);

        Categoria categoria1 = new Categoria("Prog", "Programacion");
        Categoria categoria2 = new Categoria("idio", "Idioma");

        Leccion leccion1 = new Leccion("Java", 5, TipoLeccion.VIDEO);
        Leccion leccion2 = new Leccion("HTML", 25, TipoLeccion.TEXTO);
        Leccion leccion3 = new Leccion("Ingles", 15, TipoLeccion.VIDEO);
        Leccion leccion4 = new Leccion("Hebreo", 35, TipoLeccion.RECURSO);

        Curso curso1 = new Curso("1", "Uni", 2500, 5, usuario1);
        Curso curso2 = new Curso("2", "Escu", 3000, 3, usuario4);

        sitio.addUsuario(usuario1);
        sitio.addUsuario(usuario2);
        sitio.addUsuario(usuario3);
        sitio.addUsuario(usuario4);
        sitio.addUsuario(usuario5);
        sitio.addUsuario(usuario6);
        sitio.addUsuario(usuario7);
        sitio.addUsuario(usuario8);
        sitio.addCategoria(categoria1);
        sitio.addCategoria(categoria2);
        categoria1.addCurso(curso1);
        categoria2.addCurso(curso2);
        curso1.addLeccion(leccion1);
        curso1.addLeccion(leccion2);
        curso2.addLeccion(leccion3);
        curso2.addLeccion(leccion4);

        System.out.println(sitio.suscribirseACurso("1", "3"));
        System.out.println(sitio.suscribirseACurso("1", "1"));
        System.out.println(sitio.suscribirseACurso("1", "2"));
        System.out.println(sitio.suscribirseACurso("2", "1"));
        System.out.println(sitio.suscribirseACurso("3", "1"));
        System.out.println(sitio.suscribirseACurso("4", "1"));
        System.out.println(sitio.suscribirseACurso("5", "1"));
        System.out.println(sitio.suscribirseACurso("6", "1"));
        System.out.println(sitio.suscribirseACurso("7", "1"));
    }
}
