package terceraParteEjerciciosTraduccion.ejercicio3;

//3. Juego de Rol (RPG)
// Crea un sistema básico para un juego de rol. Define clases para Personaje,
// Guerrero, Mago, y Hechizo. Implementa métodos para atacar y usar hechizos. Los
// personajes deben tener puntos de vida y poder realizar acciones según su clase.
import java.util.Scanner;

abstract class Personaje {
    String nombre;
    int puntosVida;

    public Personaje(String nombre, int puntosVida) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
    }

    public abstract void atacar(Personaje enemigo);

    public boolean estaVivo() {
        return puntosVida > 0;
    }
}

class Guerrero extends Personaje {
    int fuerza;

    public Guerrero(String nombre, int puntosVida, int fuerza) {
        super(nombre, puntosVida);
        this.fuerza = fuerza;
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(nombre + " ataca con fuerza de " + fuerza);
        enemigo.puntosVida -= fuerza;
        System.out.println("El enemigo ahora tiene " + enemigo.puntosVida + " puntos de vida.");
    }
}

class Mago extends Personaje {
    int poderMagico;

    public Mago(String nombre, int puntosVida, int poderMagico) {
        super(nombre, puntosVida);
        this.poderMagico = poderMagico;
    }

    public void lanzarHechizo(Personaje enemigo) {
        System.out.println(nombre + " lanza un hechizo con poder de " + poderMagico);
        enemigo.puntosVida -= poderMagico;
        System.out.println("El enemigo ahora tiene " + enemigo.puntosVida + " puntos de vida.");
    }

    @Override
    public void atacar(Personaje enemigo) {
        lanzarHechizo(enemigo);
    }
}

class JuegoRPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Guerrero guerrero = new Guerrero("Guerrero", 100, 15);
        Mago mago = new Mago("Mago", 80, 20);

        Personaje enemigo = new Guerrero("Enemigo", 60, 10);

        int opcion;
        do {
            System.out.println("\n1. Atacar como Guerrero");
            System.out.println("2. Lanzar Hechizo como Mago");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    guerrero.atacar(enemigo);
                    break;
                case 2:
                    mago.lanzarHechizo(enemigo);
                    break;
                case 3:
                    System.out.println("Saliendo del juego...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            if (!enemigo.estaVivo()) {
                System.out.println("¡Has derrotado al enemigo!");
                break;
            }

        } while (opcion != 3);

        scanner.close();
    }
}

