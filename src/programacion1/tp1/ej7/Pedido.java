package programacion1.tp1.ej7;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {

    private LocalDate fecha;
    private EstadoPedido estadoPedido;
    private ArrayList<ProductoPedido> productosPedidos;

    public Pedido(){
        this.fecha = LocalDate.now();
        this.estadoPedido = EstadoPedido.PENDIENTE;
        this.productosPedidos = new ArrayList<>();
    }

    public void addProductoPedido(ProductoPedido productoPedido){
        this.productosPedidos.add(productoPedido);
    }

    public void eliminarProductoPedido(ProductoPedido productoPedido){
        this.productosPedidos.remove(productoPedido);
    }

    public EstadoPedido getEstadoPedido() {
        return estadoPedido;
    }

    public ArrayList<ProductoPedido> getProductosPedidos(){
        return productosPedidos;
    }

    public void setEstadoPedido(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }
}
