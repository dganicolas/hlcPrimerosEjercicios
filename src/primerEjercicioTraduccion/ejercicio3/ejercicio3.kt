package primerEjercicioTraduccion.ejercicio3
//Ejercicio 3: Uso de for y while
// Vamos a practicar con bucles,
// que en ambos lenguajes se usan mucho, sobre todos en
// situaciones como recorrer inventarios o colecciones de objetos.
// Compara el uso del bucle for en ambos lenguajes,
// haciendo hincapié en cómo Kotlin
// simplifica la sintaxis.
fun main(args:Array<String>) {
    val inventario = listOf("xd1","xd2","xd3","xd4")
    for(elementos in inventario){
        println(elementos)
    }
    inventario.forEach{
        println(it)
    }
    //aqui el bucle for podemos hacerlo a la antigua
    //o con un metodo con .foreach
}