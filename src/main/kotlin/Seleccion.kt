open abstract class Seleccion {
    var id: Int = 0
    var nome: String =""
    var apellido: String = ""
    var edade: Int = 0


    constructor(id: Int, nome: String, apellido: String, edade: Int) {
        this.id = id
        this.nome = nome
        this.apellido = apellido
        this.edade = edade


    }

    abstract fun Concentrarse(TiempodeConcentracion : Int):String
    open fun viaxar(pais:String):String="viaxa a selección"


    override fun toString(): String {
        return "Seleccion(id=$id, nome='$nome', apellido='$apellido', edade=$edade)"
    }


}