package segundaParteEjerciciosTraduccion.ejercicio8

//8. Contador de vocales
// Pedir una frase al usuario y contar cuántas vocales (a, e, i, o, u) contiene.
fun main(){
    println("dime una frase")
    val frase = readln()
    var contador = 0
    for (i in  frase){
        println(i)
        if(i.lowercase() == "a" || i.lowercase() == "e" || i.lowercase() == "u" || i.lowercase() == "o" || i.lowercase() == "u"){
            contador++
        }
    }
    println("la frase o palabra $frase tiene $contador vocales")
}