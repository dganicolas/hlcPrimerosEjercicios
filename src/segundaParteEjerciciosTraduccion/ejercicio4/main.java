package segundaParteEjerciciosTraduccion.ejercicio4;

import java.util.Random;
import java.util.Scanner;

class main {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numero= random.nextInt(100)+1;
        int input= 200;
        do {
            System.out.println("dime un numero de 1 al 100");
            try {
                input = Integer.parseInt(scanner.nextLine());
                scanner.close();
            }catch (NumberFormatException e){
                System.out.println("macho NUMEROS");
            }
            if(numero > input){
                System.out.println("numero es mayor");
            }else{
                System.out.println("numero es menor");
            }

        }while(numero !=  input);
        System.out.println("el numero era: " + numero);
    }
}
