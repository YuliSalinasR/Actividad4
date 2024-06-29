
package AlcanciaDigital_6;

import java.util.Scanner;

public class AhorroProgamado {

    private static Alcancia alcancia = new Alcancia();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            mostrarMenu();
            int opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1:
                    double montoIngreso = leerDouble("Ingrese el monto a depositar: ");
                    alcancia.ingresarDinero(montoIngreso);
                    break;
                case 2:
                    double montoEgreso = leerDouble("Ingrese el monto a retirar: ");
                    alcancia.retirarDinero(montoEgreso);
                    break;
                case 3:
                    System.out.println("Dinero total en la alcancía: $" 
                            + alcancia.consultarDinero());
                    break;
                case 4:
                    mostrarTransacciones();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú de la Alcancía Digital ---");
        System.out.println("1. Ingresar Dinero");
        System.out.println("2. Retirar Dinero");
        System.out.println("3. Consultar Dinero");
        System.out.println("4. Ver Transacciones");
        System.out.println("5. Salir");
    }

    private static void mostrarTransacciones() {
        System.out.println("Transacciones:");
        for (Transaccion transaccion : alcancia.obtenerTransacciones()) {
            System.out.println(transaccion);
        }
        System.out.println("Total de transacciones: " 
                + alcancia.contarTransacciones());
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
}

