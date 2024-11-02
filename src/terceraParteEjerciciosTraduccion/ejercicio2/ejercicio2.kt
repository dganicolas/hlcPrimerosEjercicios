package terceraParteEjerciciosTraduccion.ejercicio2

import kotlin.system.exitProcess

// 2. Sistema de Reservas de Hotel
// Diseña un sistema para gestionar reservas de un hotel. Implementa clases para
// Habitación, Cliente, y Reserva. Permite a los clientes reservar habitaciones y
// cancelar reservas. Incluye un métodos que muestre todas las reservas activas.

class Habitacion2(val numero: Int, var reservada: Boolean = false) {
    fun reservar() {
        if (!reservada) {
            reservada = true
            println("Habitación $numero reservada.")
        } else {
            println("La habitación ya está reservada.")
        }
    }

    fun cancelarReserva() {
        if (reservada) {
            reservada = false
            println("Reserva cancelada para la habitación $numero")
        } else {
            println("La habitación no tiene reservas.")
        }
    }
}

class Cliente2(val nombre: String)

class Reserva2(val cliente: Cliente2, val habitacion: Habitacion2) {
    fun detallesReserva() = "Reserva de ${cliente.nombre} en habitación ${habitacion.numero}"
}

class Hotel2(numeroHabitaciones: Int) {
    private val habitaciones = List(numeroHabitaciones) { Habitacion2(it + 1) }
    private val reservas = mutableListOf<Reserva2>()

    fun hacerReserva(nombreCliente: String, numeroHabitacion: Int) {
        val habitacion = habitaciones[numeroHabitacion - 1]
        if (!habitacion.reservada) {
            val cliente = Cliente2(nombreCliente)
            habitacion.reservar()
            reservas.add(Reserva2(cliente, habitacion))
        } else {
            println("Esta habitación ya está reservada.")
        }
    }

    fun cancelarReserva(numeroHabitacion: Int) {
        val habitacion = habitaciones[numeroHabitacion - 1]
        if (habitacion.reservada) {
            habitacion.cancelarReserva()
            reservas.removeIf { it.habitacion.numero == numeroHabitacion }
        } else {
            println("No hay reservas para esta habitación.")
        }
    }

    fun mostrarReservasActivas() {
        if (reservas.isEmpty()) {
            println("No hay reservas activas.")
        } else {
            reservas.forEach { println(it.detallesReserva()) }
        }
    }
}

fun main() {
    val hotel = Hotel2(5)

    while (true) {
        println("\n1. Hacer reserva")
        println("2. Cancelar reserva")
        println("3. Mostrar reservas activas")
        println("4. Salir")
        print("Elige una opción: ")
        val opcion = readlnOrNull()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> {
                print("Nombre del cliente: ")
                val nombre = readlnOrNull() ?: ""
                print("Número de habitación: ")
                val numeroHabitacion = readlnOrNull()?.toIntOrNull() ?: 0
                hotel.hacerReserva(nombre, numeroHabitacion)
            }
            2 -> {
                print("Número de habitación para cancelar: ")
                val numeroHabitacion = readlnOrNull()?.toIntOrNull() ?: 0
                hotel.cancelarReserva(numeroHabitacion)
            }
            3 -> hotel.mostrarReservasActivas()
            4 -> {
                println("Saliendo...")
                exitProcess(0)
            }
            else -> println("Opción no válida.")
        }
    }
}
