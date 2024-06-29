
package HotelReservas_3;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReserva {
    private static ArrayList<Habitación> habitaciones = new ArrayList<>();
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Reserva> reservas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            mostrarMenu();
            int opcion = leerEntero("Seleccione una opcion: ");

            switch (opcion) {
                case 1:
                    gestionarHabitaciones();
                    break;
                case 2:
                    gestionarClientes();
                    break;
                case 3:
                    crearReserva();
                    break;
                case 4:
                    imprimirReservas();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no valida, por favor intente nuevamente.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\nSistema de Gestion de Reservas de Hotel:");
        System.out.println("1. Gestionar Habitaciones");
        System.out.println("2. Gestionar Clientes");
        System.out.println("3. Crear Reserva");
        System.out.println("4. Imprimir Reservas");
        System.out.println("5. Salir");
    }

    private static int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un numero entero.");
                scanner.next();
            }
        }
    }

    private static double leerDouble(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Entrada no valida. Por favor, ingrese un numero valido.");
                scanner.next();
            }
        }
    }

    private static void gestionarHabitaciones() {
        System.out.println("\nGestion de Habitaciones:");
        System.out.println("1. Agregar Habitacion");
        System.out.println("2. Listar Habitaciones");
        int opcion = leerEntero("Seleccione una opcion: ");

        switch (opcion) {
            case 1:
                agregarHabitación();
                break;
            case 2:
                listarHabitaciones();
                break;
            default:
                System.out.println("Opcion no valida.");
        }
    }

    private static void agregarHabitación() {
        int numero = leerEntero("Numero de Habitacion: ");
        scanner.nextLine(); 
        System.out.print("Tipo de Habitacion: ");
        String tipo = scanner.nextLine();
        double precio = leerDouble("Precio por Noche: ");
        habitaciones.add(new Habitación(numero, tipo, precio));
        System.out.println("Habitacion agregada exitosamente.");
    }

    private static void listarHabitaciones() {
        System.out.println("\nListado de Habitaciones:");
        for (Habitación habitación : habitaciones) {
            System.out.println(habitación);
        }
    }

    private static void gestionarClientes() {
        System.out.println("\nGestion de Clientes:");
        System.out.println("1. Agregar Cliente");
        System.out.println("2. Listar Clientes");
        int opcion = leerEntero("Seleccione una opcion: ");

        switch (opcion) {
            case 1:
                agregarCliente();
                break;
            case 2:
                listarClientes();
                break;
            default:
                System.out.println("Opcion no valida.");
        }
    }

    private static void agregarCliente() {
        scanner.nextLine(); 
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Documento: ");
        String documento = scanner.nextLine();
        clientes.add(new Cliente(nombre, apellido, documento));
        System.out.println("Cliente agregado exitosamente.");
    }

    private static void listarClientes() {
        System.out.println("\nListado de Clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    private static void crearReserva() {
        listarHabitaciones();
        int numHabitación = leerEntero("Seleccione el numero de habitacion: ");
        Habitación habitaciónSeleccionada = null;
        for (Habitación habitación : habitaciones) {
            if (habitación.getNumero() == numHabitación) {
                habitaciónSeleccionada = habitación;
                break;
            }
        }
        if (habitaciónSeleccionada == null) {
            System.out.println("Numero de habitacion no valido.");
            return;
        }

        listarClientes();
        scanner.nextLine(); 
        System.out.print("Ingrese el documento del cliente: ");
        String documentoCliente = scanner.nextLine();
        Cliente clienteSeleccionado = null;
        for (Cliente cliente : clientes) {
            if (cliente.getDocumento().equals(documentoCliente)) {
                clienteSeleccionado = cliente;
                break;
            }
        }
        if (clienteSeleccionado == null) {
            System.out.println("Documento del cliente no valido.");
            return;
        }

        int noches = leerEntero("Numero de noches de la reserva: ");
        Reserva reserva = new Reserva(habitaciónSeleccionada, clienteSeleccionado, noches);
        reservas.add(reserva);
        System.out.println("Reserva creada exitosamente.");
    }

    private static void imprimirReservas() {
        System.out.println("\nListado de Reservas:");
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }
}
