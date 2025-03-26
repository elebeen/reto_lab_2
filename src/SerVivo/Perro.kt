package SerVivo

class Perro
    (var raza: String,
     peso: Double,
     nombre: String,
     edad: Int)
    : SerVivo(peso, nombre, edad) {

    override fun info() {
        println("""
            El nombre del perro es $nombre,
            es de raza $raza
            y tiene $edad años.
            Pesa $peso kilos
        """.trimIndent())
    }

    override fun mover() {
        println("el perro usa sus 4 patas para moverse")
    }

    override fun hacerSonido() {
        println("El perro ladra")
    }

    override var nombre: String = nombre
        set(value) {
            if (value.isNotBlank()) {
                println("Cambiando nombre de $field a $value")
                field = value
            } else {
                println("Error: El nombre no puede estar vacío")
            }
        }
}