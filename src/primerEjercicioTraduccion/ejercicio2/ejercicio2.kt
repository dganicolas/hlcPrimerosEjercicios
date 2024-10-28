package primerEjercicioTraduccion.ejercicio2

// Ejercicio 2: Uso de if y operadores ternarios
// Vamos a ver cómo traducir el operador ternario en Java a Kotlin, ya que Kotlin no tiene un
// operador ternario explícito.
// Explica cómo funciona la estructura if en Kotlin en comparación con el operador ternario en
// Java.
fun main(arg:Array<String>) {
    val edad = 18
    val resultado = if(edad >= 18) "mayor de edad" else "menor de edad"
    //la estructura es que dentro de la variable le metemos un if else,
    // donde va a evaluar la condicion que le metado,
    // y depende a eso va a tener un resultado o otro,
    // en kotlin para mi es mas legible
    // que tener un ? para saber true o false
}