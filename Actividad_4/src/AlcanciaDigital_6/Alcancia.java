
package AlcanciaDigital_6;

import java.util.ArrayList;

public class Alcancia {
    private double totalDinero;
    private ArrayList<Transaccion> transacciones;

    public Alcancia() {
        this.totalDinero = 0.0;
        this.transacciones = new ArrayList<>();
    }

    public void ingresarDinero(double monto) {
        if (monto > 0) {
            totalDinero += monto;
            transacciones.add(new Transaccion("Ingreso", monto));
        } else {
            System.out.println("El monto debe ser positivo.");
        }
    }

    public void retirarDinero(double monto) {
        if (monto > 0 && monto <= totalDinero) {
            totalDinero -= monto;
            transacciones.add(new Transaccion("Egreso", monto));
        } else {
            System.out.println("Monto inválido. Asegúrese de tener suficiente dinero y que el monto sea positivo.");
        }
    }

    public double consultarDinero() {
        return totalDinero;
    }

    public ArrayList<Transaccion> obtenerTransacciones() {
        return transacciones;
    }

    public int contarTransacciones() {
        return transacciones.size();
    }

    @Override
    public String toString() {
        return "Alcancia{" +
                "totalDinero=" + totalDinero +
                ", transacciones=" + transacciones +
                '}';
    }
}
