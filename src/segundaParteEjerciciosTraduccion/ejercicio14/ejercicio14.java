package segundaParteEjerciciosTraduccion.ejercicio14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Videojuego2 {
    private String titulo;
    private String plataforma;
    private String horasJugadas;

    public Videojuego2(String titulo, String plataforma, String horasJugadas) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.horasJugadas = horasJugadas;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", horasJugadas='" + horasJugadas + '\'' +
                '}';
    }
}

 class Main {
    public static void main(String[] args) {
        ArrayList<Videojuego2> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bienvenido\n (1) ¿Quieres añadir? \n (2) Eliminar \n (3) Mostrar todos tus juegos?");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Dime el nombre del juego:");
                    String nombre = scanner.nextLine();
                    System.out.println("Dime la plataforma del juego:");
                    String plataforma = scanner.nextLine();
                    System.out.println("Dime las horas jugadas del juego:");
                    String horasJugadas = scanner.nextLine();
                    lista.add(new Videojuego2(nombre, plataforma, horasJugadas));
                    break;

                case "2":
                    System.out.println("Dime el título del juego a eliminar:");
                    String titulo = scanner.nextLine();
                    Iterator<Videojuego2> iterator = lista.iterator();
                    boolean encontrado = false;
                    while (iterator.hasNext()) {
                        if (iterator.next().getTitulo().equals(titulo)) {
                            iterator.remove();
                            encontrado = true;
                            System.out.println("El título se ha eliminado.");
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("El título no se ha encontrado.");
                    }
                    break;

                case "3":
                    System.out.println("Lista de juegos:");
                    for (Videojuego2 juego : lista) {
                        System.out.println(juego);
                    }
                    break;

                case "XD":
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción incorrecta, escribe 'XD' para salir.");
                    break;
            }
        }
    }
}
