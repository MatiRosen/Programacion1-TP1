package programacion1.tp1.ej04;

import java.util.ArrayList;

public class Droide {

    private final boolean enServicio;
    private final ArrayList<Pieza> piezasOperativas;
    private final ArrayList<Pieza> piezasNoOperativas;
    private final ArrayList<Droide> droidesRegistrados;

    public Droide(boolean enServicio){
        this.enServicio = enServicio;
        this.piezasOperativas = new ArrayList<>();
        this.piezasNoOperativas = new ArrayList<>();
        this.droidesRegistrados = new ArrayList<>();
    }

    public void registrarDroide(Droide droide){
        if (!droide.estaEnServicio())
            this.droidesRegistrados.add(droide);
    }

    private boolean estaEnServicio(){
        return enServicio;
    }

    public Resultado autoRepararse(){
        Resultado resultado = Resultado.REPARACION_IMPOSIBLE;
        ArrayList<Pieza> piezasAReemplazar = new ArrayList<>();

        for (Pieza piezaRota : piezasNoOperativas){
            if (puedeReemplazarPieza(piezaRota)){
                resultado = Resultado.REPARACION_PARCIAL;
                piezasAReemplazar.add(piezaRota);
            }
        }

        for (Pieza pieza : piezasAReemplazar){

            this.piezasNoOperativas.remove(pieza);
        }


        if (piezasNoOperativas.isEmpty()){
            resultado = Resultado.COMPLETAMENTE_OPERATIVO;
        }

        return resultado;
    }

    private boolean puedeReemplazarPieza(Pieza piezaRota){
        boolean puedeReemplazar = false;
        int contador = 0;

        while (contador < droidesRegistrados.size() && !puedeReemplazar){
            Droide droide = droidesRegistrados.get(contador);
            Pieza pieza = buscarPieza(piezaRota.getNombre(), droide);

            if (pieza != null){
                droide.eliminarPiezaOperativa(pieza);
                this.agregarPiezaFuncional(pieza);
                puedeReemplazar = true;
            } else{
                contador++;
            }
        }

        return puedeReemplazar;
    }

    private Pieza buscarPieza(String nombrePieza, Droide droide){
        Pieza pieza = null;
        int i = 0;
        ArrayList<Pieza> piezas = droide.getPiezasOperativas();

        while (i < piezas.size() && pieza == null){
            Pieza piezaAux = piezas.get(i);
            if (piezaAux.getNombre().equals(nombrePieza)){
                pieza = piezaAux;
            } else{
                i++;
            }
        }

        return pieza;
    }

    private void eliminarPiezaOperativa(Pieza pieza){
        this.piezasOperativas.remove(pieza);
    }

    public void agregarPiezaFuncional(Pieza pieza){
        this.piezasOperativas.add(pieza);
    }

    public void agregarPiezaRota(Pieza pieza){
        this.piezasNoOperativas.add(pieza);
    }

    public ArrayList<Pieza> getPiezasOperativas() {
        return piezasOperativas;
    }

    public ArrayList<Pieza> getPiezasNoOperativas() {
        return piezasNoOperativas;
    }
}
