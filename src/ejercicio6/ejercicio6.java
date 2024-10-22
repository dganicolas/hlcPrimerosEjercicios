package ejercicio6;

// Ejercicio 6: Manejo de valores nulos en Kotlin
// Kotlin tiene un sistema de tipos nulos más seguro que Java.
// Explica cómo funciona la seguridad de tipos nulos en Kotlin (String?),
// comparándola con Java.
class Main {
    public static void main(String[] args){
        String palabra = null;
        System.out.println(palabra);
        palabra = "XD PERO EN JAVA";
        System.out.println(palabra);
    }
}
