package segundaParteEjerciciosTraduccion.ejercicio11;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un número:");
        String input = scanner.nextLine();
        try {
            int numero = Integer.parseInt(input);
            int suma = 0;
            int f1 = 1;
            int f2 = 0;
            scanner.close();
            for (int i = 0; i <= numero; i++) {
                suma = f1 + f2;
                f1 = f2;
                f2 = suma;
                System.out.println(suma);
            }
        } catch (NumberFormatException e) {
            System.out.println("Un numero");
        }
    }
}
