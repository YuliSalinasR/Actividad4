
package SistemaCompra_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Compra {

    private static ArrayList<Producto> productos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Datos del cliente
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido del cliente: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese el documento del cliente: ");
        String documento = scanner.nextLine();

        Cliente cliente = new Cliente(nombre, apellido, documento);

        // Entrada de productos
        while (true) {
            System.out.print("Ingrese la descripción del producto (o 'salir' para terminar): ");
            String descripcion = scanner.nextLine();
            if (descripcion.equalsIgnoreCase("salir")) {
                break;
            }

            double precio = leerDouble("Ingrese el precio del producto: ");
            int cantidad = leerEntero("Ingrese la cantidad del producto: ");

            productos.add(new Producto(descripcion, precio, cantidad));
        }

        // Calcular el total y los impuestos
        double total = calcularTotal();
        double impuestos = calcularImpuestos(total);
        double totalConImpuestos = total + impuestos;

        // Imprimir el recibo de compra
        imprimirRecibo(cliente, total, impuestos, totalConImpuestos);
    }

    private static int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (scanner.hasNextInt()) {
                int valor = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
                return valor;
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                scanner.next(); // Limpiar entrada no válida
            }
        }
    }

    private static double leerDouble(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (scanner.hasNextDouble()) {
                double valor = scanner.nextDouble();
                scanner.nextLine(); // Limpiar el buffer
                return valor;
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número válido.");
                scanner.next(); // Limpiar entrada no válida
            }
        }
    }

    private static double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularSubtotal();
        }
        return total;
    }

    private static double calcularImpuestos(double total) {
        final double tasaImpuesto = 0.15; // 15% de impuestos
        return total * tasaImpuesto;
    }

    private static void imprimirRecibo(Cliente cliente, double total, double impuestos, double totalConImpuestos) {
        System.out.println("\nRecibo de Compra:");
        System.out.println(cliente);
        System.out.println("\nProductos Comprados:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
        System.out.println("\nTotal: $" + total);
        System.out.println("Impuestos (15%): $" + impuestos);
        System.out.println("Total a Pagar: $" + totalConImpuestos);
    }
}

