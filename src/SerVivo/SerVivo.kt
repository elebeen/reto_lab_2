package SerVivo

abstract class SerVivo(
    var peso: Double,
    open var nombre: String,
    var edad: Int
) {
    abstract fun info()
    abstract fun mover()
    abstract fun hacerSonido()

    init {
        println("Creando ser Vivo")
        println("")
    }

    constructor(nombre: String, edad: Int) : this(
        nombre = nombre,
        edad = edad,
        peso = 0.0
    )
}