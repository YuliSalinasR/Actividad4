
package ReporteEstudiantes_2;


public class Estudiante {
    private String nombre;
    private String apellido;
    private String carrera;
    private int semestre;
    private double[] calificaciones;

    public Estudiante(String nombre, String apellido, String carrera, int semestre, double[] calificaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.semestre = semestre;
        this.calificaciones = calificaciones;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getSemestre() {
        return semestre;
    }
}
