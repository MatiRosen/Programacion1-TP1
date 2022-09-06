package programacion1.tp1.ej07;

import java.util.ArrayList;

public class Portal {

    private String nombre;

    private ArrayList<Cliente> clientes;
    private ArrayList<Producto> productos;

    public Portal(String nombre){
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
        this.productos = new ArrayList<>();
    }

    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public void addProducto(Producto producto){
        this.productos.add(producto);
    }

    public ArrayList<ProductoPedido> procesarPedido(Cliente cliente){
        ArrayList<ProductoPedido> productosSinStock = new ArrayList<>();
        Pedido pedidoPendiente = cliente.getPedidoPendiente();

        if (pedidoPendiente != null){
            for (ProductoPedido productoPedido : pedidoPendiente.getProductosPedidos()){
                if (productoPedido.getCantidadPedida() > productoPedido.getProducto().getCantidadEnStock()){
                    productosSinStock.add(productoPedido);
                }
            }

            for (ProductoPedido productoPedido : productosSinStock){
                pedidoPendiente.eliminarProductoPedido(productoPedido);
            }
        }

        return productosSinStock;
    }
}
