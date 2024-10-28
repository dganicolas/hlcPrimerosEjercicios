package segundaParteEjerciciosTraduccion.ejercicio5;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] arg){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Dime un numero");
            int numero = Integer.parseInt(scanner.nextLine());
            scanner.close();
            for(int i = 0;i<=10;i++){
                System.out.println(numero + " X " + i + " = " + numero*i);
            }
        }catch (NumberFormatException e){
            System.out.println("ni pa eso sirves");
        }
    }
}
