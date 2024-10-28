package segundaParteEjerciciosTraduccion.ejercicio13;


    // 13. Clase Anime sencilla
// Crear una clase Anime con los atributos
// nombre, episodios y género. Luego, permitir al
// usuario crear un objeto de tipo Anime con
// estos atributos y mostrar su información.

import java.util.Scanner;

class Anime {
    private String nombre;
    private int episodios;
    private String genero;

    // Constructor de la clase
    public Anime(String nombre, int episodios, String genero) {
        this.nombre = nombre;
        this.episodios = episodios;
        this.genero = genero;
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Episodios: " + episodios);
        System.out.println("Género: " + genero);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del Anime: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el número de episodios: ");
        int episodios = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el género del Anime: ");
        String genero = scanner.nextLine();
        Anime miAnime = new Anime(nombre, episodios, genero);
        System.out.println("\nInformación del Anime:");
        miAnime.mostrarInformacion();

        scanner.close();
    }
}
