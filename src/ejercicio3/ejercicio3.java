package ejercicio3;
//Ejercicio 3: Uso de for y while
// Vamos a practicar con bucles,
// que en ambos lenguajes se usan mucho, sobre todos en
// situaciones como recorrer inventarios o colecciones de objetos.
// Compara el uso del bucle for en ambos lenguajes,
// haciendo hincapié en cómo Kotlin
// simplifica la sintaxis.
 class Main {
    public static void main(String[] args){
        String[] lista = {"xd1","xd2","xd3","xd4"};
        for (String elemento:lista){
            System.out.println(elemento);
        }
        for (int i=0; i < lista.length; i++){
            System.out.println(lista[i]);
        }
        //declara un bucle for en java se ve menos legible XD
        // pues ya estaria
    }
}
