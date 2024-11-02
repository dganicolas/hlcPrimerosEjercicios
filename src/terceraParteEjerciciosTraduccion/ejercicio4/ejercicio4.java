package terceraParteEjerciciosTraduccion.ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Estudiante {
    String nombre;
    List<Curso> cursos;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public double calcularPromedio() {
        return cursos.stream().mapToDouble(Curso::getCalificacion).average().orElse(0);
    }

    public String getNombre() {
        return nombre;
    }
}

class Curso {
    String nombre;
    double calificacion;

    public Curso(String nombre, double calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public double getCalificacion() {
        return calificacion;
    }
}

class Profesor {
    String nombre;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public void asignarCurso(Estudiante estudiante, Curso curso) {
        estudiante.agregarCurso(curso);
        System.out.println("Curso " + curso.nombre + " asignado a " + estudiante.getNombre());
    }
}

 class SistemaGestionEstudiantes {
    private static final List<Estudiante> estudiantes = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Profesor profesor = new Profesor("Profesor García");

        while (true) {
            System.out.println("\nSistema de Gestión de Estudiantes");
            System.out.println("1. Crear estudiante");
            System.out.println("2. Asignar curso a estudiante");
            System.out.println("3. Calcular promedio de estudiante");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1 -> crearEstudiante();
                case 2 -> asignarCurso(profesor);
                case 3 -> calcularPromedio();
                case 4 -> {
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static void crearEstudiante() {
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        estudiantes.add(new Estudiante(nombre));
        System.out.println("Estudiante " + nombre + " creado.");
    }

    private static void asignarCurso(Profesor profesor) {
        Estudiante estudiante = seleccionarEstudiante();
        if (estudiante != null) {
            System.out.print("Ingrese el nombre del curso: ");
            String nombreCurso = scanner.nextLine();
            System.out.print("Ingrese la calificación: ");
            double calificacion = scanner.nextDouble();
            scanner.nextLine();  // Limpiar el buffer
            Curso curso = new Curso(nombreCurso, calificacion);
            profesor.asignarCurso(estudiante, curso);
        }
    }

    private static void calcularPromedio() {
        Estudiante estudiante = seleccionarEstudiante();
        if (estudiante != null) {
            System.out.printf("Promedio de %s: %.2f%n", estudiante.getNombre(), estudiante.calcularPromedio());
        }
    }

    private static Estudiante seleccionarEstudiante() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return null;
        }
        System.out.println("Seleccione un estudiante:");
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, estudiantes.get(i).getNombre());
        }
        int indice = scanner.nextInt() - 1;
        scanner.nextLine();  // Limpiar el buffer
        if (indice < 0 || indice >= estudiantes.size()) {
            System.out.println("Opción inválida.");
            return null;
        }
        return estudiantes.get(indice);
    }
}
