package segundaParteEjerciciosTraduccion.ejercicio2;

import java.util.IllegalFormatException;
import java.util.Scanner;

class main {
    public static void main(String[] arg){
        try {
            Scanner inputs = new Scanner(System.in);
            System.out.println("dame un numero");
            String numero = inputs.nextLine();
            inputs.close();
            int numeroparse = Integer.parseInt(numero);
            if(numeroparse %2 == 0){
                System.out.println("numero par");
            }else{
                System.out.println("numero impar");
            }
        }catch (NumberFormatException e){
            System.out.println("ni pa poner un numero eres capaz");
        }
    }
}
