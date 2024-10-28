package segundaParteEjerciciosTraduccion.ejercicio9;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("dame un numero");
            int numero = Integer.parseInt(scanner.nextLine());
            if (numero < 2){
                System.out.println("el numero no es primo");
            }else{
                if(numero == 2){
                    System.out.println("1");
                    System.out.println("el numero es primo");
                }else{
                    if(numero%2 == 0){
                        System.out.println("el numero no es primo");
                    }else{
                        boolean esprimo = true;
                        for(int i = 3;i <= Math.sqrt(numero)-1; i+=2){
                            if (numero % i == 0) {
                                esprimo = false;
                                break;
                            }
                        }
                        if(esprimo){
                            System.out.println("el numero es primo");
                        }else{
                            System.out.println("el numero no es primo");
                        }
                    }
                }
            }
        }catch(NumberFormatException e){
            System.out.println("ERROR TERRIBLE: DAME UN NUMERO");
        }
    }
}
