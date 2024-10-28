package segundaParteEjerciciosTraduccion.ejercicio11

// 11. Fibonacci
// Crear un programa que imprima los primeros N números de la secuencia de Fibonacci (el
// número N lo ingresa el usuario).
fun main() {
    /**
     * 1+0 = 1
     * 1+1 = 2
     * 2+1 = 3
     * 3+2 = 5
     * 3+5 = 8
     * */
    println("dime un numero")
    val numero = readln().toIntOrNull()
    if (numero != null) {
        var suma = 0
        var f1 = 1
        var f2 = 0
        for (i in 0..numero) {
            suma = f1 + f2
            f1 = f2
            f2 = suma
            println(suma)
        }
    }
}