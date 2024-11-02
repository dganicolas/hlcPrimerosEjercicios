package terceraParteEjerciciosTraduccion.ejercicio1

import kotlin.system.exitProcess

class Libro2(val titulo: String, var prestado: Boolean = false) {
    fun prestar() {
        if (!prestado) {
            prestado = true
            println("Libro prestado exitosamente.")
        } else {
            println("Este libro ya está prestado.")
        }
    }
}

class Usuario2(val nombre: String)

class Biblioteca2 {
    private val libros = mutableListOf<Libro2>()
    private val usuarios = mutableListOf<Usuario2>()

    fun agregarLibro(titulo: String) {
        libros.add(Libro2(titulo))
        println("Libro agregado: $titulo")
    }

    fun registrarUsuario(nombre: String) {
        usuarios.add(Usuario2(nombre))
        println("Usuario registrado: $nombre")
    }

    fun prestarLibro(titulo: String) {
        val libro = libros.find { it.titulo.equals(titulo, ignoreCase = true) }
        libro?.prestar() ?: println("El libro no se encontró.")
    }
}

fun main() {
    val biblioteca = Biblioteca2()
    while (true) {
        println("\n1. Agregar libro")
        println("2. Registrar usuario")
        println("3. Prestar libro")
        println("4. Salir")
        print("Elige una opción: ")
        val opcion = readlnOrNull()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> {
                print("Título del libro: ")
                val titulo = readlnOrNull() ?: ""
                biblioteca.agregarLibro(titulo)
            }
            2 -> {
                print("Nombre del usuario: ")
                val nombre = readlnOrNull() ?: ""
                biblioteca.registrarUsuario(nombre)
            }
            3 -> {
                print("Título del libro a prestar: ")
                val titulo = readlnOrNull() ?: ""
                biblioteca.prestarLibro(titulo)
            }
            4 -> {
                println("Saliendo...")
                exitProcess(0)
            }
            else -> println("Opción no válida.")
        }
    }
}
