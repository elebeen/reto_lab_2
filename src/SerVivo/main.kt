package SerVivo

fun CrearSerVivo(){
    var persona_1: Humano = Humano(68.0,"Carlos", 25)
    persona_1.esMayor
    persona_1.info()
    persona_1.mover()
    persona_1.hacerSonido()
    persona_1.pasatiempos()
    println("")

    var perro_1: Perro = Perro("Chihuahua", 6.5, "Rosa", 6)
    perro_1.info()
    perro_1.mover()
    perro_1.hacerSonido()
    println("")

    var aguila_1: Aguila = Aguila("Real",3.5, 40.6, "Lala", 40)
    aguila_1.info()
    aguila_1.mover()
    aguila_1.hacerSonido()
}

fun main() {
    CrearSerVivo()
}