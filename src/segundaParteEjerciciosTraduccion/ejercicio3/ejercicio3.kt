package segundaParteEjerciciosTraduccion.ejercicio3

import kotlin.math.pow

// 3. Cálculo del área de un círculo
// Pedir al usuario el radio de un círculo y
// calcular su área (A = π * r^2).
fun main(){
    println("dime el area del circulo")
    val numero = readln().toFloatOrNull()
    if(numero != null){
        println("el area es: ${Math.PI * numero.pow(2)}")
    }
}