
package CotizacionTaller_5;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private int año;
    private String motivoReparacion;

    public Vehiculo(String marca, String modelo, String color, int año, String motivoReparacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.año = año;
        this.motivoReparacion = motivoReparacion;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getAño() {
        return año;
    }

    public String getMotivoReparacion() {
        return motivoReparacion;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", año=" + año +
                ", motivoReparacion='" + motivoReparacion + '\'' +
                '}';
    }
}

