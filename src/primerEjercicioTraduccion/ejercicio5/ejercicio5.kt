package primerEjercicioTraduccion.ejercicio5

//Ejercicio 5: Definición de una clase en Java y Kotlin
// Vamos a ver cómo crear una clase simple para un personaje
// con atributos como nombre,
// vida y ataque.
// Explica cómo Kotlin simplifica la definición de clases
// y el constructor frente a Java.

//a la hora declarar la clase,el construcyor primario ya lo declaramos tambien
//si quieremos un constructor extra seria dentro de la clase y seria el secundario
class Clase1(
    val nombreClase:String,
    val numeroClase:Int
){
    fun metodoDeLaclase(parametroDeLaFuncion:String): String {
        return parametroDeLaFuncion
    }
}

fun main() {
    val instanciarUnObjeto = Clase1("clase",3)
    println(instanciarUnObjeto.metodoDeLaclase("xd"))

}
//kotlin ya tiene su propio constructor primario a la hora de declarar la clase :D