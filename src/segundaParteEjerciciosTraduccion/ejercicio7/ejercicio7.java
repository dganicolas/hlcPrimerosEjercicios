package segundaParteEjerciciosTraduccion.ejercicio7;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("dame una cadena de texto");
        String palabra = scanner.nextLine();
        scanner.close();
        StringBuilder palabrareverse = new StringBuilder(palabra);
        System.out.println(palabrareverse.reverse());
    }
}
