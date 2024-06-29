
package SistemaCompra_4;

public class Producto {
    private String descripcion;
    private double precio;
    private int cantidad;

    public Producto(String descripcion, double precio, int cantidad) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double calcularSubtotal() {
        return precio * cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", subtotal=" + calcularSubtotal() +
                '}';
    }
}

