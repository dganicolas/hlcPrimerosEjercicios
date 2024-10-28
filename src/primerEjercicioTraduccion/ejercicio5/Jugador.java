package primerEjercicioTraduccion.ejercicio5;

//Ejercicio 5: Definición de una clase en Java y Kotlin
// Vamos a ver cómo crear una clase simple para un personaje
// con atributos como nombre,
// vida y ataque.
// Explica cómo Kotlin simplifica la definición de clases
// y el constructor frente a Java.
public class Jugador {
 private String nombre;
 public Jugador(String nombre) {
  this.nombre = nombre;
 }
 public String getNombre() {
  return nombre;
 }
 public void setNombre(String nombre) {
  this.nombre = nombre;
 }
}
