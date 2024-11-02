package terceraParteEjerciciosTraduccion.ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

class Habitacion {
    int numero;
    boolean reservada = false;

    public Habitacion(int numero) {
        this.numero = numero;
    }

    public void reservar() {
        if (!reservada) {
            reservada = true;
            System.out.println("Habitación " + numero + " reservada.");
        } else {
            System.out.println("La habitación ya está reservada.");
        }
    }

    public void cancelarReserva() {
        if (reservada) {
            reservada = false;
            System.out.println("Reserva cancelada para la habitación " + numero);
        } else {
            System.out.println("La habitación no tiene reservas.");
        }
    }
}

class Cliente {
    String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
}

class Reserva {
    Cliente cliente;
    Habitacion habitacion;

    public Reserva(Cliente cliente, Habitacion habitacion) {
        this.cliente = cliente;
        this.habitacion = habitacion;
    }

    public String detallesReserva() {
        return "Reserva de " + cliente.nombre + " en habitación " + habitacion.numero;
    }
}

class Hotel {
    ArrayList<Habitacion> habitaciones = new ArrayList<>();
    ArrayList<Reserva> reservas = new ArrayList<>();

    public Hotel(int numeroHabitaciones) {
        for (int i = 1; i <= numeroHabitaciones; i++) {
            habitaciones.add(new Habitacion(i));
        }
    }

    public void hacerReserva(String nombreCliente, int numeroHabitacion) {
        Habitacion habitacion = habitaciones.get(numeroHabitacion - 1);
        if (!habitacion.reservada) {
            Cliente cliente = new Cliente(nombreCliente);
            habitacion.reservar();
            reservas.add(new Reserva(cliente, habitacion));
        } else {
            System.out.println("Esta habitación ya está reservada.");
        }
    }

    public void cancelarReserva(int numeroHabitacion) {
        Habitacion habitacion = habitaciones.get(numeroHabitacion - 1);
        if (habitacion.reservada) {
            habitacion.cancelarReserva();
            reservas.removeIf(reserva -> reserva.habitacion.numero == numeroHabitacion);
        } else {
            System.out.println("No hay reservas para esta habitación.");
        }
    }

    public void mostrarReservasActivas() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas activas.");
        } else {
            for (Reserva reserva : reservas) {
                System.out.println(reserva.detallesReserva());
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(5);
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Hacer reserva");
            System.out.println("2. Cancelar reserva");
            System.out.println("3. Mostrar reservas activas");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            int numeroHabitacion;
            switch (opcion) {
                case 1:
                    System.out.print("Nombre del cliente: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Número de habitación: ");
                    numeroHabitacion = scanner.nextInt();
                    scanner.nextLine();
                    hotel.hacerReserva(nombre, numeroHabitacion);
                    break;
                case 2:
                    System.out.print("Número de habitación para cancelar: ");
                    numeroHabitacion = scanner.nextInt();
                    scanner.nextLine();
                    hotel.cancelarReserva(numeroHabitacion);
                    break;
                case 3:
                    hotel.mostrarReservasActivas();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
