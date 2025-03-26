package SerVivo

class Serpiente : SerVivo {
    constructor(nombre: String, edad: Int) : super(nombre, edad)

    override fun info() {
        println("""
            El nombre de la serpiente es $nombre,
            y tiene $edad años.
        """.trimIndent())
    }

    override fun mover() {
        println("la serpiente repta por el suelo")
    }

    override fun hacerSonido() {
        println("La serpiente sisea ")
    }
}