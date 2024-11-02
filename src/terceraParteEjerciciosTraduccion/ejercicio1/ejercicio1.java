package terceraParteEjerciciosTraduccion.ejercicio1;

import java.util.ArrayList;

//1. Sistema de Gestión de Biblioteca
// Crea un sistema de gestión de una biblioteca. Define clases para Libro, Usuario, y
// Biblioteca. Implementa métodos para agregar libros, registrar usuarios y prestar
// libros a los usuarios. Asegúrate de que un libro no se pueda prestar si ya está
// prestado.
import java.util.Scanner;

class Libro {
    String titulo;
    boolean prestado = false;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("Libro prestado exitosamente.");
        } else {
            System.out.println("Este libro ya está prestado.");
        }
    }
}

class Usuario {
    String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }
}

class Biblioteca {
    ArrayList<Libro> libros = new ArrayList<>();
    ArrayList<Usuario> usuarios = new ArrayList<>();

    public void agregarLibro(String titulo) {
        libros.add(new Libro(titulo));
        System.out.println("Libro agregado: " + titulo);
    }

    public void registrarUsuario(String nombre) {
        usuarios.add(new Usuario(nombre));
        System.out.println("Usuario registrado: " + nombre);
    }

    public void prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.titulo.equalsIgnoreCase(titulo)) {
                libro.prestar();
                return;
            }
        }
        System.out.println("El libro no se encontró.");
    }
}

class Main {
    public static void main(String[] args) {
        Biblioteca2 biblioteca = new Biblioteca2();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Agregar libro");
            System.out.println("2. Registrar usuario");
            System.out.println("3. Prestar libro");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título del libro: ");
                    String titulo = scanner.nextLine();
                    biblioteca.agregarLibro(titulo);
                    break;
                case 2:
                    System.out.print("Nombre del usuario: ");
                    String nombre = scanner.nextLine();
                    biblioteca.registrarUsuario(nombre);
                    break;
                case 3:
                    System.out.print("Título del libro a prestar: ");
                    titulo = scanner.nextLine();
                    biblioteca.prestarLibro(titulo);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
