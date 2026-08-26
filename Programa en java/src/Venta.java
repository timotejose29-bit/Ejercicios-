public class Venta {
    Cliente cliente;
    Producto producto;
    int cantidad;

    public Venta(Cliente cliente, Producto producto, int cantidad) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularTotal() {
        double total = producto.precio * cantidad;
        if (total > 100000) {
            total = total - (total * 0.10);
        }
        return total;
    }

    public void mostrarDetalle() {
        System.out.println(" ===== DETALLE DE LA VENTA =====");
        System.out.println("Cliente: " + cliente.nombre);
        System.out.println("Producto: " + producto.nombre);
        System.out.println("Precio unitario: $" + producto.precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total a pagar: $" + calcularTotal());
    }
}