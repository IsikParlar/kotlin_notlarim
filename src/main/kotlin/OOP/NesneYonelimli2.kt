package OOP

class Bilgisayar constructor(var renk:String,var marka:Char){
    fun deger_bastir(){
        var ozellikler:String="Renk=$renk\n"
        "Marka=$marka"
        println(ozellikler)
    }
}

fun main(args: Array<String>) {
    var nesne1=Bilgisayar("Kırmızı",'A')
    nesne1.deger_bastir()
    println()
    var nesne2=Bilgisayar("Mavi",'B')
    nesne2.deger_bastir()
}