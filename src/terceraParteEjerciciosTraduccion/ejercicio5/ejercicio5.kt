package terceraParteEjerciciosTraduccion.ejercicio5

// 5. Gestor de Tareas
// Diseña un gestor de tareas. Crea clases para Tarea, Proyecto, y Usuario. Permite a
// los usuarios crear proyectos, añadir tareas y marcar tareas como completadas.

class Tarea2(val descripcion: String) {
    var completada = false

    fun marcarCompletada() {
        completada = true
    }

    override fun toString(): String {
        val estado = if (completada) "Completada" else "Pendiente"
        return "$descripcion - $estado"
    }
}

class Proyecto2(val nombre: String) {
    private val tareas = mutableListOf<Tarea2>()

    fun agregarTarea(tarea: Tarea2) {
        tareas.add(tarea)
        println("Tarea \"${tarea.descripcion}\" añadida al proyecto $nombre")
    }

    fun mostrarTareas() {
        if (tareas.isEmpty()) {
            println("No hay tareas en este proyecto.")
        } else {
            println("Tareas en el proyecto $nombre:")
            tareas.forEachIndexed { i, tarea -> println("${i + 1}. $tarea") }
        }
    }

    fun marcarTareaCompletada(indice: Int) {
        if (indice in tareas.indices) {
            tareas[indice].marcarCompletada()
            println("Tarea marcada como completada.")
        } else {
            println("Índice de tarea no válido.")
        }
    }
}

class Usuario2(val nombre: String) {
    val proyectos = mutableListOf<Proyecto2>()

    fun crearProyecto(nombreProyecto: String) {
        proyectos.add(Proyecto2(nombreProyecto))
        println("Proyecto \"$nombreProyecto\" creado.")
    }

    fun mostrarProyectos() {
        if (proyectos.isEmpty()) {
            println("No hay proyectos disponibles.")
        } else {
            println("Proyectos de $nombre:")
            proyectos.forEachIndexed { i, proyecto -> println("${i + 1}. ${proyecto.nombre}") }
        }
    }
}

fun main() {
    val usuario = Usuario2("Usuario1")

    while (true) {
        println("\nGestor de Tareas")
        println("1. Crear proyecto")
        println("2. Agregar tarea a proyecto")
        println("3. Marcar tarea como completada")
        println("4. Mostrar proyectos y tareas")
        println("5. Salir")
        print("Seleccione una opción: ")
        when (readln().toIntOrNull()) {
            1 -> {
                print("Ingrese el nombre del proyecto: ")
                val nombreProyecto = readln()
                usuario.crearProyecto(nombreProyecto)
            }
            2 -> {
                usuario.mostrarProyectos()
                print("Seleccione el número del proyecto: ")
                val indiceProyecto = readln().toIntOrNull()?.minus(1)
                val proyecto = if (indiceProyecto != null && indiceProyecto in usuario.proyectos.indices) {
                    usuario.proyectos[indiceProyecto]
                } else null

                if (proyecto != null) {
                    print("Descripción de la tarea: ")
                    val descripcionTarea = readln()
                    proyecto.agregarTarea(Tarea2(descripcionTarea))
                }
            }
            3 -> {
                usuario.mostrarProyectos()
                print("Seleccione el número del proyecto: ")
                val indiceProyecto = readln().toIntOrNull()?.minus(1)
                val proyecto = if (indiceProyecto != null && indiceProyecto in usuario.proyectos.indices) {
                    usuario.proyectos[indiceProyecto]
                } else null

                proyecto?.let {
                    it.mostrarTareas()
                    print("Seleccione el número de la tarea a completar: ")
                    val indiceTarea = readln().toIntOrNull()?.minus(1)
                    if (indiceTarea != null) it.marcarTareaCompletada(indiceTarea)
                }
            }
            4 -> usuario.proyectos.forEach { it.mostrarTareas() }
            5 -> {
                println("Saliendo...")
                break
            }
            else -> println("Opción no válida.")
        }
    }
}
