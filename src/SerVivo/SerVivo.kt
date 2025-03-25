package SerVivo

abstract class SerVivo(
    var peso: Double,
    var nombre: String,
    var edad: Int
) {
    abstract fun info()
    abstract fun mover()
    abstract fun hacerSonido()
}