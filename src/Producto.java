public class Producto {

    private String nombreProducto;
    private double precioBase;
    private double porcentajeImpuesto;

    // Constructor que inicializa los valores del Producto
    public Producto(String nombreProducto, double precioBase, double porcentajeImpuesto) {
        this.nombreProducto = nombreProducto;
        this.precioBase = precioBase;
        this.porcentajeImpuesto = precioBase;
    }

    // Método para calcular el precio final después de aplicar impuestos
    public double calcularPrecioFinal() {
        double impuestosAplicados = calcularImpuestos(precioBase, porcentajeImpuesto);
        return precioBase + impuestosAplicados;
    }

    // Método privado para calcular impuestos
    private double calcularImpuestos(double precioBase, double porcentajeImpuesto) {
        return precioBase * (porcentajeImpuesto / 100);
    }

    // Método para mostrar los detalles del producto, incluyendo precio final
    public void mostrarDetallesProducto() {
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Precio base: " + precioBase);
        System.out.println("Porcentaje de impuestos: " + porcentajeImpuesto + "%");
        System.out.println("Precio final: " + calcularPrecioFinal());
    }


}
