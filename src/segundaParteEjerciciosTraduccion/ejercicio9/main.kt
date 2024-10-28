package segundaParteEjerciciosTraduccion.ejercicio9

//9. Números primos
// Pedir un número al usuario y verificar si es un número primo.

fun main(){
    println("dime un numero")
    val numero = readln().toIntOrNull()
    if(numero!= null){
        if (numero <2){
            println("el numero no es primo")

        }
        else{
            if (numero == 2){
                println("el numero es primo")
            }else{
                if(numero%2==0){
                    println("el numero no es primo")
                }
                else{
                    var primo = true
                    for (i in (3..(Math.sqrt(numero.toDouble())-1).toInt()).step(2)){
                        if(numero %i == 0){
                            primo = false
                        }
                    }
                    if(primo){
                        println("el numero es primo")
                    }else{
                        println("el numero no es primo")
                    }

                }
            }
        }

    }else{
        println("dame un numero ERROR")
    }
}