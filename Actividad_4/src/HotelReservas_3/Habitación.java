
package HotelReservas_3;

public class Habitación {
    private int numero;
    private String tipo;
    private double precio;

    public Habitación(int numero, String tipo, double precio) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Habitación{" + "numero=" + numero + ", tipo='" + tipo 
                + '\'' + ", precio=" + precio + '}';
    }
}
