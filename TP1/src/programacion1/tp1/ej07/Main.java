package programacion1.tp1.ej07;

public class Main {

    public static void main(String[] args){
        Portal portal = new Portal("Amazonia");
        Cliente cliente = new Cliente("Mati", "Rosen", "ort123", "mati.rosen@gmail.com", "12345678");
        portal.addCliente(cliente);

        Pedido pedido = new Pedido();
        Producto prod1 = new Producto("HP", 3000, 20);
        Producto prod2 = new Producto("HP2", 3000, 20);
        Producto prod3 = new Producto("HP3", 3000, 20);
        pedido.addProductoPedido(new ProductoPedido(prod1, 15));
        pedido.addProductoPedido(new ProductoPedido(prod2, 20));
        pedido.addProductoPedido(new ProductoPedido(prod3, 25));

        portal.addProducto(prod1);
        portal.addProducto(prod2);
        portal.addProducto(prod3);

        cliente.addPedido(pedido);

        for (ProductoPedido productoPedido : portal.procesarPedido(cliente)){
            System.out.println(productoPedido.getProducto().getNombre() + " no pudo ser procesado. (Stock insuficiente)");
        }
        System.out.println(cliente.getPedidoPendiente());
        cliente.confirmarPedido();
        System.out.println(cliente.getPedidoPendiente());
    }
}
