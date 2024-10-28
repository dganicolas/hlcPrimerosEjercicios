package primerEjercicioTraduccion.ejercicio7

//Ejercicio 7: Funciones simples y expresiones lambda
// Vamos a explorar cómo Kotlin permite simplificar la sintaxis
// de las funciones y cómo se usan
// las expresiones lambda.
// Compara la simplicidad de las funciones y lambdas
// en Kotlin con Java, destacando cómo
// Kotlin es más conciso.
fun main() {
    val sumar: (Int, Int) -> Int = { a, b -> a + b }
    println(sumar(3, 5))
}