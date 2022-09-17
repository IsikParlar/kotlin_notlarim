package OOP

class Bilgisayar2 constructor(renk:String,marka:Char){
    var renkA:String
    var markaA:Char
    init {
        this.renkA=renk
        this.markaA=marka
        println("Nesne oluşturuldu ve $renkA renginde $markaA bir bilgisayar oluşturuldu")
    }
    fun deger_bastir(){
        var ozellikler:String="Renk=$renkA\n"
        "Marka=$markaA"
        println(ozellikler)
    }
}

fun main(args: Array<String>) {
    var nesne1=Bilgisayar2("Kırmızı",'A')
    nesne1.deger_bastir()
    println()
    var nesne2=Bilgisayar2("Mavi",'B')
    nesne2.deger_bastir()
}