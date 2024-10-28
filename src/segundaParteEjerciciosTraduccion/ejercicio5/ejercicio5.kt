package segundaParteEjerciciosTraduccion.ejercicio5

// 5. Tabla de multiplicar
// Pedir un número al usuario e imprimir su tabla de multiplicar
// del 1 al 10.
fun main(){
    println("dime un numero:")
    val numero = readln().toIntOrNull()
    if(numero != null){
        for (i in 1..10){
            println("$numero X $i = ${numero * i}")
        }
    }else{
        println("no sirve ni pa eso")
    }
}