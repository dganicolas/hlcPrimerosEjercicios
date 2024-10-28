package segundaParteEjerciciosTraduccion.ejercicio14

//14. Inventario de videojuegos
// Crear una clase Videojuego con los atributos titulo,
// plataforma y horasJugadas. Permitir al
// usuario crear un inventario con varios videojuegos.
// El programa debe permitir añadir,
// eliminar y mostrar los videojuegos del inventario.
data class Videojuego(val titulos:String,val plataforma:String,val horasJugadas:String)
fun main(){
    val lista = mutableListOf<Videojuego>()
    while (true){
        println("bienevenido\n (1)quieres añadir \n(2)eliminar \n (3)mostrar todos tus juegos??")
        val opcion= readln()
        when (opcion){
            "1"-> {
                println("dime el nombre del juego")
                val nombre = readln()
                println("dime la plataforma del juego")
                val plataforma = readln()
                println("dime las horas Jugadas del juego")
                val horasJugadas = readln()
                lista.add(Videojuego(nombre,plataforma,horasJugadas))
            }
            "2"-> {
                println("diem el titulo del juego a eliminar")
                val titulo = readln()
                if(lista.remove(lista.find { it.titulos == titulo })){
                    println("el titulo se ha eliminado")
                }else{
                    println("el titulo no se ha encontrado")
                }
            }
            "3"->{
                lista.forEach {
                    println(it)
                }
            }
            "XD"-> break
            else->{
                println("XD opcione equivacada escribe XD para salir")
            }
        }
    }
}