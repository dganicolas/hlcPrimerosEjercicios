package terceraParteEjerciciosTraduccion.ejercicio3

import kotlin.system.exitProcess

abstract class Personaje2(val nombre: String, var puntosVida: Int) {
    abstract fun atacar(enemigo: Personaje2)
    fun estaVivo() = puntosVida > 0
}

class Guerrero2(nombre: String, puntosVida: Int, private val fuerza: Int) : Personaje2(nombre, puntosVida) {
    override fun atacar(enemigo: Personaje2) {
        println("$nombre ataca con fuerza de $fuerza")
        enemigo.puntosVida -= fuerza
        println("El enemigo ahora tiene ${enemigo.puntosVida} puntos de vida.")
    }
}

class Mago2(nombre: String, puntosVida: Int, private val poderMagico: Int) : Personaje2(nombre, puntosVida) {
    fun lanzarHechizo(enemigo: Personaje2) {
        println("$nombre lanza un hechizo con poder de $poderMagico")
        enemigo.puntosVida -= poderMagico
        println("El enemigo ahora tiene ${enemigo.puntosVida} puntos de vida.")
    }

    override fun atacar(enemigo: Personaje2) {
        lanzarHechizo(enemigo)
    }
}

fun main() {
    val guerrero = Guerrero2("Guerrero", 100, 15)
    val mago = Mago2("Mago", 80, 20)
    val enemigo = Guerrero2("Enemigo", 60, 10)

    while (true) {
        println("\n1. Atacar como Guerrero")
        println("2. Lanzar Hechizo como Mago")
        println("3. Salir")
        print("Elige una opción: ")
        when (readlnOrNull()?.toIntOrNull()) {
            1 -> guerrero.atacar(enemigo)
            2 -> mago.lanzarHechizo(enemigo)
            3 -> {
                println("Saliendo del juego...")
                exitProcess(0)
            }
            else -> println("Opción no válida.")
        }

        if (!enemigo.estaVivo()) {
            println("¡Has derrotado al enemigo!")
            break
        }
    }
}
