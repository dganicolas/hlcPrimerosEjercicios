package primerEjercicioTraduccion.ejercicio4;

//Ejercicio 4: Control de flujo con break y continue
// Aquí veremos cómo usar break y continue en Kotlin y
// compararlo con su equivalente en
// Java.
// Explica la diferencia en cómo Kotlin maneja rangos y
// control de flujo frente a Java.
 class Main {
  public static void main(String[] arg){
   boolean estado = false;
   while(true){
    if (!estado){
     System.out.println("ha llegado");

    } else{
     break;
    }
    estado = true;
    if(estado){
     continue;
    }else{
     break;
    }
    //if(estado){
    // System.out.println("CODIGO QUE NO VA A LLEGAR");
    //}
    //si java no llora por que no llega te lo podria demostra :)
   }
   //estado = true;
  }
}
