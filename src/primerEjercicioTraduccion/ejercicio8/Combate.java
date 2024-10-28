package primerEjercicioTraduccion.ejercicio8;

class Combate2 {
    public static void main(String[] args) {
        Personaje2 goku = new Personaje2("Goku", 100, 20);
        Personaje2 vegeta = new Personaje2("Vegeta", 80, 25);
        while (goku.vida > 0 && vegeta.vida > 0) {
            goku.vida-= vegeta.ataque;
            vegeta.vida-= goku.ataque;
            System.out.println("Vida de Goku: " + goku.vida);
            System.out.println("Vida de Vegeta: " + vegeta.vida);
        }
        if (goku.vida <= 0) {
            System.out.println("Vegeta ha ganado el combate.");
        } else {
            System.out.println("Goku ha ganado el combate.");
        }
    }
}
class Personaje2 {
    String nombre;
    int vida;
    int ataque;

    public Personaje2(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }
}
