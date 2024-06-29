
package CotizacionTaller_5;
import java.util.Scanner;

public class Cotizacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la marca del vehiculo: ");
        String marca = scanner.nextLine();

        System.out.print("Ingrese el modelo del vehiculo: ");
        String modelo = scanner.nextLine();

        System.out.print("Ingrese el color del vehiculo: ");
        String color = scanner.nextLine();

        System.out.print("Ingrese el año del vehiculo: ");
        int año = leerEntero(scanner);

        System.out.print("Ingrese el motivo de la reparacion: ");
        String motivoReparacion = scanner.nextLine();

        Vehiculo vehiculo = new Vehiculo(marca, modelo, color, año, motivoReparacion);

        // Leer los costos de reparación
        System.out.print("Ingrese el costo de mano de obra del mecanico: ");
        double costoManoObra = leerDouble(scanner);

        System.out.print("Ingrese el precio total de repuestos: ");
        double precioRepuestos = leerDouble(scanner);

        
        double costosAdministrativos = 0.15 * costoManoObra + precioRepuestos;

       
        double montoTotal = costoManoObra + precioRepuestos + costosAdministrativos;

        
        imprimirCotizacion(vehiculo, costoManoObra, precioRepuestos, costosAdministrativos, montoTotal);
    }

    private static int leerEntero(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int valor = scanner.nextInt();
                scanner.nextLine(); 
                return valor;
            } else {
                System.out.println("Entrada no valida. Por favor, ingrese un numero entero.");
                scanner.next(); 
            }
        }
    }

    private static double leerDouble(Scanner scanner) {
        while (true) {
            if (scanner.hasNextDouble()) {
                double valor = scanner.nextDouble();
                scanner.nextLine(); 
                return valor;
            } else {
                System.out.println("Entrada no valida. Por favor, ingrese un numero valido.");
                scanner.next(); 
            }
        }
    }

    private static void imprimirCotizacion(Vehiculo vehiculo, double costoManoObra,
            double precioRepuestos, double costosAdministrativos, double montoTotal) {
        System.out.println("\nCotizacion de Reparacion:");
        System.out.println(vehiculo);
        System.out.println("Costo de Mano de Obra: $" + costoManoObra);
        System.out.println("Precio Total de Repuestos: $" + precioRepuestos);
        System.out.println("Costos Administrativos: $" + costosAdministrativos);
        System.out.println("Monto Total: $" + montoTotal);
    }
}
