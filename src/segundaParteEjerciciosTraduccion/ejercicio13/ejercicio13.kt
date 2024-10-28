package segundaParteEjerciciosTraduccion.ejercicio13

import java.util.*

// 13. Clase Anime sencilla
// Crear una clase Anime con los atributos
// nombre, episodios y género. Luego, permitir al
// usuario crear un objeto de tipo Anime con
// estos atributos y mostrar su información.

class Anime2
    (private val nombre: String, private val episodios: Int, private val genero: String) {
    fun mostrarInformacion() {
        println("Nombre: $nombre")
        println("Episodios: $episodios")
        println("Género: $genero")
    }
}
    fun main(args: Array<String>) {
        print("Ingrese el nombre del Anime: ")
        val nombre = readln()
        print("Ingrese el número de episodios: ")
        val episodios = readln().toInt()
        print("Ingrese el género del Anime: ")
        val genero = readln()
        val miAnime = Anime2(nombre, episodios, genero)
        println("\nInformación del Anime:")
        miAnime.mostrarInformacion()
    }
