fun main(args: Array<String>){

    //Cadenas:

    //println("Hola Mundo desde Kotlin")

    //valores numericos e impresion de valores:
    /*var edad:Int = 28

    println(edad)
    
    val nombre ="juan"
    println(nombre)

    //comentatios
    /*
    son iguales que en java
     */

    val apellido:String
    apellido = "Lara"
    println(apellido)*/

    /*var nombre = "Juan"
    var apellido ="Lara"
    //println(nombre + " " + apellido)

    //println("mi nombre es: $nombre, y mi apellido es: $apellido")

    var comentario = """
        Hola mi nombre es: ${nombre.length}
        y mi apellido es: $apellido
        saludos 
    """
    println(comentario)*/

    /*println("Proporciona un nombre ")
    var nombre = readLine()
    println("El nombre es: $nombre")*/

    //listas:
    /*var nombres = mutableListOf("Juan","karla","Arturo")
    nombres.add("Santiago")
    println(nombres.size)
    println(nombres[0])*/

    //For loops
    /*var nombres = mutableListOf("Juan","karla","Arturo")
    for (nombre in nombres){
        println(nombre)
    }
    for (x in 1..5){
        println(x)
    }*/

    //maps
    /*var traduccion = mapOf("hola" to "hello","adios" to "goodbye")
    var traduccion2 = mutableMapOf("hola" to "hello","adios" to "goobye")
    traduccion2["hola"] = "Hello"
    println(traduccion["hola"])
    println(traduccion2["hola"])*/

    //funciones
    /*fun saludar(){
        println("hola")
    }
    saludar()

    fun despedir(nombre:String = "Juan", aplllido:String):String{
        return "adios $nombre"
    }
    println(despedir("Leandro", "guinan"))*/


    //clases
    /*class Persona{
        var nombre:String
        var apellido:String
        constructor(){
            this.nombre = "Karla"
            this.apellido = "Lara"
        }
        fun imprimirValores(){
            println("Hola ${this.nombre} ${this.apellido}")
        }

    }
    var persona = Persona()
    //persona.nombre = "David"
    println(persona.imprimirValores())*/

}