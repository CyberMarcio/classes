class Casa{

    //propriedades
    var cor: String = ""

    //metodos
    fun abrirJanela(qtdJanelas: Int){
        println("abrir janela total: $qtdJanelas")

    }

    fun abrirPorta(){
        println("abrir porta")

    }
    fun abrirCasa(){
        this.abrirPorta()
        //this.abrirJanela()

    }

}

fun main() {
    val casa = Casa()
    casa.cor = "Amarela"
    casa.abrirJanela(10)

    /*
    val casa2 = Casa()
    casa2.cor = "Vermelha"
     */

    println (casa.cor)
    //println (casa2.cor)

}