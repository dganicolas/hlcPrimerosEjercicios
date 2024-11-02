package terceraParteEjerciciosTraduccion.ejercicio4

import kotlin.system.exitProcess

//4. Sistema de Gestión de Estudiantes
// Implementa un sistema para gestionar estudiantes en una escuela. Define clases
// para Estudiante, Curso, y Profesor. Permite a los profesores asignar cursos a los
// estudiantes y calcular la calificación promedio de cada estudiante.
class Estudiante2(val nombre: String) {
    private val cursos = mutableListOf<Curso2>()

    fun agregarCurso(curso: Curso2) {
        cursos.add(curso)
    }

    fun calcularPromedio(): Double {
        return if (cursos.isNotEmpty()) cursos.map { it.calificacion }.average() else 0.0
    }
}

class Curso2(val nombre: String, val calificacion: Double)

class Profesor2(val nombre: String) {
    fun asignarCurso(estudiante: Estudiante2, curso: Curso2) {
        estudiante.agregarCurso(curso)
        println("Curso ${curso.nombre} asignado a ${estudiante.nombre}")
    }
}

val estudiantes2 = mutableListOf<Estudiante2>()

fun main() {
    val profesor = Profesor2("Profesor García")

    while (true) {
        println("\nSistema de Gestión de Estudiantes")
        println("1. Crear estudiante")
        println("2. Asignar curso a estudiante")
        println("3. Calcular promedio de estudiante")
        println("4. Salir")
        print("Seleccione una opción: ")
        when (readln().toIntOrNull()) {
            1 -> crearEstudiante2()
            2 -> asignarCurso2(profesor)
            3 -> calcularPromedio2()
            4 -> {
                println("Saliendo...")
                exitProcess(0)
            }
            else -> println("Opción no válida. Intente de nuevo.")
        }
    }
}

fun crearEstudiante2() {
    print("Ingrese el nombre del estudiante: ")
    val nombre = readln()
    estudiantes2.add(Estudiante2(nombre))
    println("Estudiante $nombre creado.")
}

fun asignarCurso2(profesor: Profesor2) {
    val estudiante = seleccionarEstudiante2()
    if (estudiante != null) {
        print("Ingrese el nombre del curso: ")
        val nombreCurso = readln()
        print("Ingrese la calificación: ")
        val calificacion = readln().toDoubleOrNull() ?: 0.0
        val curso = Curso2(nombreCurso, calificacion)
        profesor.asignarCurso(estudiante, curso)
    }
}

fun calcularPromedio2() {
    val estudiante = seleccionarEstudiante2()
    if (estudiante != null) {
        println("Promedio de ${estudiante.nombre}: %.2f".format(estudiante.calcularPromedio()))
    }
}

fun seleccionarEstudiante2(): Estudiante2? {
    if (estudiantes2.isEmpty()) {
        println("No hay estudiantes registrados.")
        return null
    }
    println("Seleccione un estudiante:")
    estudiantes2.forEachIndexed { index, estudiante -> println("${index + 1}. ${estudiante.nombre}") }
    val indice = readln().toIntOrNull()?.minus(1) ?: -1
    return if (indice in estudiantes2.indices) estudiantes2[indice] else {
        println("Opción inválida.")
        null
    }
}
