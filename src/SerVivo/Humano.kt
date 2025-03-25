package SerVivo

class Humano(
    peso: Double,
    nombre: String,
    edad: Int)
    : SerVivo(peso, nombre, edad), Acciones {
    override fun info() {
        println("""
            Mi nombre es $nombre
            Tengo $edad años
            ${if (esMayor) "Soy mayor de edad" else "Soy menor de edad"}
        """.trimIndent())
    }

    override fun mover() {
        println("Yo uso los pies para caminar")
    }

    override fun hacerSonido() {
        println("Hola mundo")
    }

    override fun pasatiempos() {
        println("Yo toco la guitarra y juego videojuegos")
    }
    val esMayor: Boolean
        get() = edad >= 18

}