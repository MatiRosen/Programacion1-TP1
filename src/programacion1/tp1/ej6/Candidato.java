package programacion1.tp1.ej6;

public class Candidato {

    private String nombre, mail;

    public Candidato(String nombre, String mail){
        this.nombre = nombre;
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public String getNombre() {
        return nombre;
    }
}
