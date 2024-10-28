package segundaParteEjerciciosTraduccion.ejercicio3;

import java.util.Scanner;

class main {
    public static void main(String[] arg){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("dame el radio del circulo");
            double numero = Double.parseDouble(scanner.nextLine());
            scanner.close();
            System.out.println("el area del circulo es: "+ Math.PI*Math.pow(numero, 2));
        }catch (NumberFormatException e){
            System.out.println("XD aprende a leer");
        }


    }
}
