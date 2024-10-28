package primerEjercicioTraduccion.ejercicio4

//Ejercicio 4: Control de flujo con break y continue
// Aquí veremos cómo usar break y continue en Kotlin y
// compararlo con su equivalente en
// Java.
// Explica la diferencia en cómo Kotlin maneja rangos y
// control de flujo frente a Java.
// en kotlin podemos darle rango que queramos entonces
// si tenemos 1..4
// en el for se itera 1,2,3,4, tanto el 1 y el 4 inclusive
//

fun main(arg:Array<String>) {
    var numero = 1
    while (true){
        numero++
        if(numero > 2){
            break
        }
        println("ha llegado")
    }
    numero = 1
    while (true){
        numero++
        if (numero != 2){
            continue
            println("nunca ha llegado??")//nunca llega la tener un continue
        }
        println("ha llegado")
    }
    //el break sirve para romper un bucle y salirte del mismo
    // y un continue sirve para si esta comprobando un if o bucle,
    // salte sin comprobar nada mas
}