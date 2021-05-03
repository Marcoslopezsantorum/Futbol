fun main(args: Array<String>) {
    val xogador = Xogador(15, "Lucas", "Martinez", 30, 7, "delantero")
    val adestrador = Adestrador(29, "Pedro", "Alfondo", 15, "La vida es dura")
    val xogador2 : Seleccion = Xogador(59, "Marcos", "Lopez", 18, 8, "Medio Centro")

    println(xogador)
    println(xogador2)
    println(adestrador)
    xogador.xogarPartido()
    adestrador.dirixirAdestramento()
}
