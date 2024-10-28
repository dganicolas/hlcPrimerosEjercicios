package segundaParteEjerciciosTraduccion.ejercicio10;

import java.util.Scanner;

//10. Conversión de temperaturas
// Crear un programa que convierta una temperatura de grados Celsius a Fahrenheit y
// viceversa. (C = (F- 32) * 5/9, F = C * 9/5 + 32).
public class ejercicio10 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        while (true) {
            try {
                System.out.println("1) de Celsius a Fahrenheit \n2)de Fahrenheit a Celsius ");
                numero = Integer.parseInt(scanner.nextLine());
                if (numero != 1 && numero != 2) {
                    throw new NumberFormatException();
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("DOS OPCIONES, 1 o 2");
            }
        }

            int temperatura = 0;
            while (true) {
                try {
                    System.out.println("dime la temperatura");
                    temperatura = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("dime la temperatura");
                }
            }
            scanner.close();
                int suma;
            switch (numero) {
                case 1:
                    suma = temperatura * 9 / 5 + 32;
                    System.out.println("la temperatura celsius es " + suma);
                    break;
                case 2:
                    suma = (temperatura- 32) * 5/9;
                    System.out.println("la temperatura Fahrenheit es " + suma);
                    break;
            }
        }
    }

