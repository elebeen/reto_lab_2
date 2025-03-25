package SerVivo

class Aguila
    (var especie: String,
     var envergadura: Double,
     peso: Double,
     nombre: String,
     edad: Int)
    : SerVivo(peso, nombre, edad){
    override fun info() {
        println("""
            El aguila pesa $peso,
            y tiene una envergadura de $envergadura.
            Tiene $edad años
            Es una aguila $especie y se llama $nombre
        """.trimIndent())
    }

    override fun mover() {
        println("El aguila usa sus alas para volar")
    }

    override fun hacerSonido() {
        println("El aguila chilla")
    }
}