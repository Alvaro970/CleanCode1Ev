public class App {
    public static void main(String[] args) {
        Producto p1 = new Producto("Portátil", 1000, 21);
        p1.mostrarDetallesProducto();

        p1.actualizarPrecio(-500); // Intento fallido
        p1.actualizarPrecio(1200); // Actualización válida
        p1.mostrarDetallesProducto();

        Producto p2 = new Producto("Teléfono", 600, 18);
        p2.mostrarDetallesProducto();
    }
}
