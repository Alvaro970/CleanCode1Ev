public class Producto {

    private String n;
    private double p;
    private double i;

    // Constructor que inicializa los valores del Producto
    public Producto(String n, double p, double i) {
        this.n = n;
        this.p = p;
        this.i = i;
    }

    // Calcula
    public double x() {
        double y = z(p, i);
        return p + y;
    }

    // Método privado para calcular impuestos
    private double z(double p, double i) {
        return p * (i / 100);
    }

    // Muestra detalles
    public void d() {
        System.out.println("Producto: " + n);
        System.out.println("Precio base: " + p);
        System.out.println("Porcentaje de impuestos: " + i + "%");
        System.out.println("Precio final: " + x());
    }

}
