class Adestrador: Seleccion {

    var idFederacion = ""

    constructor(id: Int, nome: String, apellido: String, edade: Int, idFederacion: String) : super(
        id,
        nome,
        apellido,
        edade
    ) {
        this.idFederacion = idFederacion
    }



    fun dirixirPartido (): Unit{
        println("ordena")
    }
    fun dirixirAdestramento (): Unit{
        println("ordenaa")
    }

    override fun Concentrarse(TiempodeConcentracion: Int): String {
        return "concentrase a selección e o tempo de concentración = $TiempodeConcentracion"
    }


    override fun viaxar(pais: String): String {
        return  "Viaxan os xogadores........... $pais"
    }

    override fun toString(): String {
        return "Adestrador(idFederacion='$idFederacion')"
    }


}