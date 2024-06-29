
package HotelReservas_3;

public class Reserva {
    private Habitación habitación;
    private Cliente cliente;
    private int noches;

    public Reserva(Habitación habitación, Cliente cliente, int noches) {
        this.habitación = habitación;
        this.cliente = cliente;
        this.noches = noches;
    }

    public double calcularTotal() {
        return habitación.getPrecio() * noches;
    }

    @Override
    public String toString() {
        return "Reserva{" + "habitación=" + habitación + ", cliente=" + cliente 
                + ", noches=" + noches + ", total=" + calcularTotal() + '}';
    }
}

