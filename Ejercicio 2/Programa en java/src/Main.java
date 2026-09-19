import java.util.Scanner;

class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = sc.nextLine();
        System.out.print("Ingrese el nombre del producto: ");
        String nombreProducto = sc.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese la cantidad comprada: ");
        int cantidad = sc.nextInt();
        Cliente cliente = new Cliente(nombreCliente);
        Producto producto = new Producto(nombreProducto, precio);
        Venta venta = new Venta(cliente, producto, cantidad);
        venta.mostrarDetalle();
        sc.close();
    }
}