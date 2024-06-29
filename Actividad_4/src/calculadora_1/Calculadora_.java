
package calculadora_1;
import java.util.Scanner;

public class Calculadora_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarMenu();
            int opcion = leerEntero(scanner, "Seleccione una opcion: ");
            
            if (opcion == 9) {
                System.out.println("Saliendo del programa...");
                break;
            }

            double num1 = leerDouble(scanner, "Ingrese el primer numero: ");
            double num2 = leerDouble(scanner, "Ingrese el segundo numero: ");
            double resultado = 0;

            switch (opcion) {
                case 1:
                    resultado = sumar(num1, num2);
                    System.out.println("Resultado de la suma: " + resultado);
                    break;
                case 2:
                    resultado = restar(num1, num2);
                    System.out.println("Resultado de la resta: " + resultado);
                    break;
                case 3:
                    resultado = multiplicar(num1, num2);
                    System.out.println("Resultado de la multiplicacion: " + resultado);
                    break;
                case 4:
                    resultado = dividir(num1, num2);
                    System.out.println("Resultado de la division: " + resultado);
                    break;
                case 5:
                    resultado = modulo(num1, num2);
                    System.out.println("Resultado del modulo: " + resultado);
                    break;
                case 6:
                    resultado = potencia(num1, num2);
                    System.out.println("Resultado de la potencia: " + resultado);
                    break;
                case 7:
                    resultado = raizCuadrada(num1);
                    System.out.println("Resultado de la raiz cuadrada del primer numero: " + resultado);
                    break;
                case 8:
                    resultado = raizCuadrada(num2);
                    System.out.println("Resultado de la raiz cuadrada del segundo numero: " + resultado);
                    break;
                default:
                    System.out.println("Opcion no valida, por favor intente nuevamente.");
            }
        }
        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("\nSeleccione una operacion:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Modulo");
        System.out.println("6. Potencia");
        System.out.println("7. Raiz Cuadrada del primer numero");
        System.out.println("8. Raiz Cuadrada del segundo numero");
        System.out.println("9. Salir");
    }

    public static int leerEntero(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Entrada no valida. Por favor, ingrese un numero entero.");
                scanner.next(); 
            }
        }
    }

    public static double leerDouble(Scanner scanner, String mensaje) {
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

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División por cero.");
            return Double.NaN;
        }
        return a / b;
    }

    public static double modulo(double a, double b) {
        return a % b;
    }

    public static double potencia(double a, double b) {
        return Math.pow(a, b);
    }

    public static double raizCuadrada(double a) {
        if (a < 0) {
            System.out.println("Error: No se puede calcular la raíz cuadrada de un numero negativo.");
            return Double.NaN;
        }
        return Math.sqrt(a);
    }
     }


