package primeraParteEjercicios

import kotlin.random.Random

//Ejercicio 1: "Hola, Mundo"
// Escribe un programa en Kotlin que imprima en pantalla "¡Hola, mundo!"
fun ejercicio1() {
    println("¡Hola, mundo!")
}

//Ejercicio 2: "Vida de un Personaje"
// Crea un programa que declare una variable llamada vida con un valor de
// 100 y que imprima: "La vida del personaje es 100".
fun ejercicio2() {
    val vida = 100
    println("La vida del personaje es $vida")
}

// Ejercicio 3: "Multiplicando Ataques"
// Escribe una función llamada multiplicarAtaques que tome un número
// entero como argumento y lo multiplique por 5. Usa esa función para
// calcular y mostrar el daño total de 3 ataques.
fun multiplicarAtaques(numero: Int): Int {
    return numero * 5;
}

fun ejercicio3(numero: Int) {
    var ataque = 0
    for (i in 1..3) {
        ataque += multiplicarAtaques(numero)
    }
    println("el daño total ha sido de: $ataque")
}

// Ejercicio 4: "Monedas en un Tesoro"
// Escribe un programa que simule recoger monedas. El programa debe
// tener un bucle que repita 10 veces, sumando 5 monedas en cada
// iteración, e imprimiendo el número de monedas en cada paso.
fun ejercicio4() {
    var monedas = 0
    for (i in 1..10) {
        monedas += 5
        println("ronda$i, el jugador recogio 5 monedas, total: ${monedas}")
    }
}

// Ejercicio 5: "Determinando el Nivel del Personaje"
// Crea un programa que pida el nivel de un personaje. Si el nivel es menor
// a 10, debe imprimir "Personaje principiante". Si es entre 10 y 20,
// "Personaje intermedio". Si es mayor a 20, "Personaje avanzado".
fun ejercicio5(numero: Int) {
    when (numero) {
        in 1..10 -> println("Personaje principiante")
        in 11..20 -> println("Personaje intermedio")
        else -> println("Personaje avanzado")
    }
}

// Ejercicio 6: "Batalla de Daño Crítico"
// Escribe una función que simule una batalla. El daño crítico se hace
// cuando el ataque es mayor a 50. Si el ataque es mayor a 50, imprime
// "¡Golpe crítico!" y devuelve el daño multiplicado por 2, de lo contrario
// solo devuelve el daño normal
fun ejercicio6(): Int {
    val ataque = Random.nextInt(0, 101)
    if (ataque > 50) {
        println("¡Golpe crítico!")
        return ataque * 2
    } else {
        return ataque
    }
}

//Ejercicio 7: "Combate de dos personajes"
// Crea un programa que simule el combate entre dos personajes. Cada
// uno tiene una cantidad de vida y ataque. En cada ronda, el personaje A
// ataca a B y viceversa, restando vida. El combate termina cuando uno de
// los personajes tiene 0 o menos de vida.
fun ejercicio7(){
    data class Personaje(val nombre:String, var vida:Float, val ataque:Float)
    fun getRandomFloatInRange(min: Float, max: Float): Float {
        return Random.nextFloat() * (max - min) + min
    }
    val player = Personaje("nico", 10.0f, 2.0f)
    val enemies = Personaje("enemigo", 10.0f, 2.0f)
    while (player.vida > 0 && enemies.vida > 0){
        var ataque = getRandomFloatInRange(0.0f,enemies.ataque)
        player.vida -= ataque
        println("el enemigo le ataca al jugador con $ataque, vida del jugador: ${player.vida}")
        if(player.vida >= 0){
            ataque = getRandomFloatInRange(0.0f,enemies.ataque)
            enemies.vida -= ataque
            println("el jugador le ataca al enemigo con $ataque, vida del enemigo: ${enemies.vida}")
        }
    }
    if(player.vida < 0){
        player.vida = 0.0f
    }
    when(player.vida){
        0.0f -> {
            println("el jugador ha perdido")
        }
        else->{
            println("el jugador ha ganado")
        }
    }
}

//Ejercicio 8: "Inventario de Objetos"
// Crea un programa que simule un inventario de un personaje usando una
// lista. El personaje puede añadir un objeto al inventario, eliminarlo o
// mostrar los objetos actuales.
fun ejercicio8(){
    data class Item(val nombre:String,val daño:Int);
    val inventario = mutableListOf<Item>()
    var numero:Int? = 0
    while (true){
        println("bienvenido a la gestion de tu inventario\n" +
                "¿Que quieres hacer?\n" +
                "(1) añadir nuevo objeto\n" +
                "(2) quitar un objeto\n" +
                "(3) mostrar tu inventario\n" +
                "(4) irte")
        numero= readln().toIntOrNull()
        when(numero){
            null -> println("error, introduce un numero")
            1->{
                println("dime el nombre del objeto")
                val nombre = readln()
                println("dime el daño del $nombre")
                val daño = readln().toIntOrNull()
                inventario.add(Item(nombre,daño?:0))
            }
            2 ->{
                var contador = 1
                inventario.forEach{
                    println("($contador) ${it.nombre}")
                }
                println("dime el objeto que quieres eliminar")
                val objeto = readln().toIntOrNull()
                if(objeto != null){
                    if(objeto-1 < inventario.count()){
                        val objetoEscogido = inventario[objeto-1]
                        inventario.remove(objetoEscogido)
                    }else{
                        println("ese objeto no existe")
                    }
                }else{
                    println("error: introduce un numero")
                }
            }
            3->{
                inventario.forEach{
                    println("${it.nombre}: ${it.daño}")
                }
            }
            4-> break
        }
    }
}
// Ejercicio 9: "Sistema de Experiencia"
// Escribe un programa que simule el sistema de experiencia de un
// personaje. Cada vez que gane una batalla, aumenta su experiencia en
// 50 puntos. Al llegar a 200 puntos o más, sube de nivel.
fun ejercicio9(){
    var nivel = 1
    var experiencia = 0;
    while (true){
        println("(1) pelear\n" +
                "(2) salir")
        val opcionBatalla= readln().toIntOrNull()
        when(opcionBatalla){
            null -> println("opcion no valida")
            1-> {
                experiencia += 50
                println("has ganado la batalla, tu nivel es ${nivel} y tu experiencia es ${experiencia}")
                if (experiencia >= 200){
                    experiencia = 0
                    nivel++
                    println("has subido de nivel")
                }
            }
            2-> break
            else -> println("opcion no valida")
        }
    }
}

//Ejercicio 10: "Simulación de ataque en equipo"
// Crea un programa que simule un ataque en equipo. Cada miembro del
// equipo tiene un daño diferente y todos atacan a un enemigo con vida
// inicial de 500. El programa debe restar la suma de los ataques de todos
// los miembros al enemigo hasta que su vida sea 0 o menor.
fun ejercicio10(){
    var vidaEnemigo = 500
    while (vidaEnemigo >= 0){
        val p1 = Random.nextInt(1,10)
        val p2 = Random.nextInt(1,10)
        val p3 = Random.nextInt(1,10)
        val p4 = Random.nextInt(1,10)
        val p5 = Random.nextInt(1,10)
        val ataquetotal = p1 + p2 + p3 + p4 + p5
        vidaEnemigo -= ataquetotal
        println("el equipo causa un daño de $ataquetotal, cerberus tiene $vidaEnemigo total")
    }
}

fun main() {
    var numero: Int? = 0
    while (true) {
        println(
            "(1)\"Hola, Mundo\"\n" +
                    "(2)\"Vida de un Personaje\"\n" +
                    "(3)\"Multiplicando Ataques\"\n" +
                    "(4) \"Monedas en un Tesoro\"\n" +
                    "(5) \"Determinando el Nivel del Personaje\"\n" +
                    "(6) \"Batalla de Daño Crítico\"\n" +
                    "(7) \"Combate de dos personajes\"\n" +
                    "(8) \"Inventario de Objetos\"\n" +
                    "(9) \"Sistema de Experiencia\"\n" +
                    "(10) \"Simulación de ataque en equipo\"\n" +
                    "(11) Salir del programa\n" +
                    "¿que opcion quieres escoger?"
        )
        numero = readln().toIntOrNull()
        when (numero) {
            1 -> ejercicio1()
            2 -> ejercicio2()
            3 -> {
                println("dime el daño del ataque")
                val numero = readln().toIntOrNull()
                if (numero != null) {
                    ejercicio3(numero)
                } else {
                    println("Error: solo numeros enteros")
                }
            }
            4 -> ejercicio4()
            5 -> {
                println("dime el nivel del personaje")
                val numero = readln().toIntOrNull()
                if (numero != null) {
                    ejercicio5(numero)
                } else {
                    println("Error: solo numeros enteros")
                }
            }
            6-> println(ejercicio6())
            7-> ejercicio7()
            8-> ejercicio8()
            9-> ejercicio9()
            10 -> ejercicio10()
            11 -> break
        }
    }
}


