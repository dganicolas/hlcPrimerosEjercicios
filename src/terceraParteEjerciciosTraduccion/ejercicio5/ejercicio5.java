package terceraParteEjerciciosTraduccion.ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Tarea {
    String descripcion;
    boolean completada;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false;
    }

    public void marcarCompletada() {
        this.completada = true;
    }

    public String getEstado() {
        return completada ? "Completada" : "Pendiente";
    }

    @Override
    public String toString() {
        return descripcion + " - " + getEstado();
    }
}

class Proyecto {
    String nombre;
    List<Tarea> tareas;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
        System.out.println("Tarea \"" + tarea.descripcion + "\" añadida al proyecto " + nombre);
    }

    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas en este proyecto.");
        } else {
            System.out.println("Tareas en el proyecto " + nombre + ":");
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println((i + 1) + ". " + tareas.get(i));
            }
        }
    }

    public void marcarTareaCompletada(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            tareas.get(indice).marcarCompletada();
            System.out.println("Tarea marcada como completada.");
        } else {
            System.out.println("Índice de tarea no válido.");
        }
    }
}

class Usuario {
    String nombre;
    List<Proyecto> proyectos;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.proyectos = new ArrayList<>();
    }

    public void crearProyecto(String nombreProyecto) {
        Proyecto proyecto = new Proyecto(nombreProyecto);
        proyectos.add(proyecto);
        System.out.println("Proyecto \"" + nombreProyecto + "\" creado.");
    }

    public Proyecto obtenerProyecto(int indice) {
        if (indice >= 0 && indice < proyectos.size()) {
            return proyectos.get(indice);
        } else {
            System.out.println("Índice de proyecto no válido.");
            return null;
        }
    }

    public void mostrarProyectos() {
        if (proyectos.isEmpty()) {
            System.out.println("No hay proyectos disponibles.");
        } else {
            System.out.println("Proyectos de " + nombre + ":");
            for (int i = 0; i < proyectos.size(); i++) {
                System.out.println((i + 1) + ". " + proyectos.get(i).nombre);
            }
        }
    }
}

 class GestorDeTareas {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Usuario usuario = new Usuario("Usuario1");

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nGestor de Tareas");
            System.out.println("1. Crear proyecto");
            System.out.println("2. Agregar tarea a proyecto");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Mostrar proyectos y tareas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1 -> crearProyecto();
                case 2 -> agregarTarea();
                case 3 -> marcarTareaCompletada();
                case 4 -> mostrarProyectosYTareas();
                case 5 -> {
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }

    private static void crearProyecto() {
        System.out.print("Ingrese el nombre del proyecto: ");
        String nombreProyecto = scanner.nextLine();
        usuario.crearProyecto(nombreProyecto);
    }

    private static void agregarTarea() {
        usuario.mostrarProyectos();
        System.out.print("Seleccione el número del proyecto: ");
        int indiceProyecto = scanner.nextInt() - 1;
        scanner.nextLine();  // Limpiar el buffer
        Proyecto proyecto = usuario.obtenerProyecto(indiceProyecto);

        if (proyecto != null) {
            System.out.print("Descripción de la tarea: ");
            String descripcionTarea = scanner.nextLine();
            proyecto.agregarTarea(new Tarea(descripcionTarea));
        }
    }

    private static void marcarTareaCompletada() {
        usuario.mostrarProyectos();
        System.out.print("Seleccione el número del proyecto: ");
        int indiceProyecto = scanner.nextInt() - 1;
        scanner.nextLine();  // Limpiar el buffer
        Proyecto proyecto = usuario.obtenerProyecto(indiceProyecto);

        if (proyecto != null) {
            proyecto.mostrarTareas();
            System.out.print("Seleccione el número de la tarea a completar: ");
            int indiceTarea = scanner.nextInt() - 1;
            scanner.nextLine();  // Limpiar el buffer
            proyecto.marcarTareaCompletada(indiceTarea);
        }
    }

    private static void mostrarProyectosYTareas() {
        usuario.mostrarProyectos();
        for (Proyecto proyecto : usuario.proyectos) {
            proyecto.mostrarTareas();
        }
    }
}
