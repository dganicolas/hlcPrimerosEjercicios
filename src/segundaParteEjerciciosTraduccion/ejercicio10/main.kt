package segundaParteEjerciciosTraduccion.ejercicio10

import java.util.*
fun main() {
    var numero: Int? = 0
    while (true) {
        try {
            println("1) de Celsius a Fahrenheit \n2)de Fahrenheit a Celsius ")
            numero = readln().toIntOrNull()
            if (numero== null || numero != 1 && numero != 2) {
                throw NumberFormatException()
            } else {
                break
            }
        } catch (e: NumberFormatException) {
            println("DOS OPCIONES, 1 o 2")
        }
    }

    var temperatura: Int? = 0
    while (true) {
        try {
            println("dime la temperatura")
            temperatura = readln().toIntOrNull()
            if(temperatura == null) {
                throw NumberFormatException()
            }
            break
        } catch (e: NumberFormatException) {
            println("dime la temperatura")
        }
    }
    var suma: Int
    when(numero){
        1 -> {
            if(temperatura!=null){
                suma = temperatura * 9 / 5 + 32
                println("la temperatura celsius es $suma")
            }
        }
        2 -> {
            if(temperatura!= null){
                suma = (temperatura - 32) * 5 / 9
                println("la temperatura Fahrenheit es $suma")
            }
        }
    }
}

