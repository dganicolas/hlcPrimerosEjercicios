package segundaParteEjerciciosTraduccion.ejercicio12

// 12. Inversión de un número
// Pedir un número entero al usuario e imprimir
// el número con sus dígitos invertidos.
// Ejemplo: si el usuario ingresa 1234,
// el programa debería imprimir 4321.
fun main(){
    var numero: Int? = null
    while (numero == null){
        println("dame un numero")
        numero = readln().toIntOrNull()
        if(numero!=null){
            break
        }
        println("ERROR")
    }
    println(numero.toString().reversed())
}