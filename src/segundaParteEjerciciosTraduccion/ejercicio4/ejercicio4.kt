package segundaParteEjerciciosTraduccion.ejercicio4

import kotlin.random.Random

// 4. Generador de números aleatorios
// Generar un número aleatorio entre 1 y 100 y pedir al usuario
// que adivine qué número es.
// El programa indicará si el número es mayor o menor al ingresado.
// Pista: Utilizar la función de generación de números aleatorios y
// bucles while o do-while.
fun main(){
    val numero = (1..100).random()
    do {
        println("dime un numero del 1 al 100")
        val input = readln().toIntOrNull()
        if(input != null&&numero != input){
            if (numero > input){
                println("el numero es mayor")
            }else{
                println("el numero es menor")
            }
        }
    }while(numero != input)
    println("Has ganado el numero es: $numero")
}