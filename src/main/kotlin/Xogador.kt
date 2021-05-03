 class Xogador: Seleccion {

    var dorsal: Int = 0
    var demarcación = ""

     constructor(id: Int, nome: String, apellido: String, edade: Int, dorsal: Int, demarcación: String) : super(
         id,
         nome,
         apellido,
         edade
     ) {
         this.dorsal = dorsal
         this.demarcación = demarcación
     }


     fun xogarPartido(): Unit{

     }
     fun entrenar (): Unit{

     }

     override fun Concentrarse(TiempodeConcentracion: Int): String {
         return "concentrase a selección e o tempo de concentración = $TiempodeConcentracion"
     }


     override fun viaxar(pais: String): String {
         return  "Viaxan os xogadores........ $pais"
     }

     override fun toString(): String {
         return "Xogador(dorsal=$dorsal, demarcación='$demarcación')"
     }


 }