package primerEjercicioTraduccion.ejercicio8

//Ejercicio Final:
// Traduce el siguiente fragmento de código Java a Kotlin,
// que simula un pequeño combate
// entre dos personajes,
// donde ambos atacan hasta que uno de los dos quede sin vida.
    fun main(args: Array<String>) {
        val goku = Personaje("Goku", 100, 20)
        val vegeta = Personaje("Vegeta", 80, 25)
        while (goku.vida > 0 && vegeta.vida > 0) {
            goku.vida -= vegeta.ataque
            vegeta.vida -= goku.ataque
            println("Vida de Goku: " + goku.vida)
            println("Vida de Vegeta: " + vegeta.vida)
        }
        if (goku.vida <= 0) {
            println("Vegeta ha ganado el combate.")
        } else {
            println("Goku ha ganado el combate.")
        }
    }
internal class Personaje(var nombre: String, var vida: Int, var ataque: Int)