package segundaParteEjerciciosTraduccion.ejercicio1;

import java.util.Scanner;

//1. Saludo personalizado
// Pedir al usuario su nombre y saludarle con un mensaje personalizado. Ejemplo: "¡Hola,
// Juan!".
public class main {
    public static void main(String[] args){
        Scanner inputs = new Scanner(System.in);
        System.out.println("dime tu nombre");
        System.out.println("hola, " + inputs.nextLine());
        inputs.close();
    }
}
