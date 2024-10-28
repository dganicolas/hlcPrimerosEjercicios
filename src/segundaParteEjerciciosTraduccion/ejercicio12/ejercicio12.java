package segundaParteEjerciciosTraduccion.ejercicio12;

import java.util.Scanner;

class ejercicio12 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int numero;
        while(true){
            try{
                System.out.println("dame un numero");
                numero = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("ERROR");
            }
        }
        scanner.close();
        StringBuilder str = new StringBuilder(String.valueOf(numero));
        System.out.println(str.reverse());
    }
}
