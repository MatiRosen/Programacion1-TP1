package programacion1.tp1.ej1;

public class Usuario {

    private String id;
    private String nombre;
    private String mail;
    private boolean esBecado;

    public Usuario(String id, String nombre, String mail, boolean esBecado) {
        this.setId(id);
        this.setNombre(nombre);
        this.setMail(mail);
        this.setEsBecado(esBecado);
    }

    public void setId(String id){
        this.id = id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setMail(String mail){
        this.mail = mail;
    }

    public void setEsBecado(boolean esBecado){
        this.esBecado = esBecado;
    }

    public String getNombre(){
        return nombre;
    }

    public String getMail(){
        return mail;
    }

    public String getId(){
        return id;
    }

    public boolean getEsBecado(){
        return esBecado;
    }
}
