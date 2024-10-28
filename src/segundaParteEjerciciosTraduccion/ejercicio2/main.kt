package segundaParteEjerciciosTraduccion.ejercicio2

//2. Número par o impar
// Pedir un número al usuario e indicar si es par o impar.
fun main(){
    println("ingresa un numero:")
    val numero = readln().toIntOrNull()
    if (numero!=null){
        if(numero %2 ==0){
            println("es par el numero")
        }else{
            println("es impar el numero")
        }
    }else{
        println("ni pa poner un numero eres capaz churra")
    }
}