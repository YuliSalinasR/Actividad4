
package ReporteEstudiantes_2;
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        System.out.print("Ingrese el numero de estudiantes: ");
        int numeroEstudiantes = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numeroEstudiantes; i++) {
            System.out.println("Ingrese los datos del estudiante " + (i + 1) + ":");

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Carrera: ");
            String carrera = scanner.nextLine();

            System.out.print("Semestre: ");
            int semestre = scanner.nextInt();

            System.out.print("Numero de calificaciones: ");
            int numCalificaciones = scanner.nextInt();
            double[] calificaciones = new double[numCalificaciones];
            for (int j = 0; j < numCalificaciones; j++) {
                System.out.print("Calificacion " + (j + 1) + ": ");
                calificaciones[j] = scanner.nextDouble();
            }
            scanner.nextLine(); 

            estudiantes.add(new Estudiante(nombre, apellido, carrera, semestre, calificaciones));
        }

        double sumaPromedios = 0;
        for (Estudiante estudiante : estudiantes) {
            double promedio = estudiante.calcularPromedio();
            sumaPromedios += promedio;
            System.out.println("\nEstudiante: " + estudiante.getNombre() + " " + estudiante.getApellido());
            System.out.println("Carrera: " + estudiante.getCarrera());
            System.out.println("Semestre: " + estudiante.getSemestre());
            System.out.println("Promedio: " + promedio);
        }

        double promedioGlobal = sumaPromedios / estudiantes.size();
        System.out.println("\nPromedio global de todos los estudiantes: " + promedioGlobal);
        scanner.close();
    }
}
