package segundaParteEjerciciosTraduccion.ejercicio8;

import java.util.Scanner;

public class ejercicio8 {
    public static  void main( String[] arg){
        int contador = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("dime una frase");
        String frase = scanner.nextLine();
        scanner.close();
        for(int i = 0; i<= frase.length()-1; i++){
            char letra = frase.charAt(i);
            System.out.println(String.valueOf(letra));
            if(String.valueOf(letra).equals("a") || String.valueOf(letra).equals("e") || String.valueOf(letra).equals("i") || String.valueOf(letra).equals("o") || String.valueOf(letra).equals("u")){
                contador++;
            }
        }
        System.out.println("la frase " + frase + " tiene " + contador + " vocales.");
    }
}
