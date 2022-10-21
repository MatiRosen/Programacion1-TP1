package programacion1.tp1.ej07;

public class ProductoPedido {

    private Producto producto;
    private int cantidadPedida;

    public ProductoPedido(Producto producto, int cantidadPedida){
        this.producto = producto;
        this.cantidadPedida = cantidadPedida;
    }

    public int getCantidadPedida() {
        return cantidadPedida;
    }

    public Producto getProducto() {
        return producto;
    }
}
