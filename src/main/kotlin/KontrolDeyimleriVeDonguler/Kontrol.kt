package KontrolDeyimleriVeDonguler

fun main(args: Array<String>) {
    var a:Byte=5
    var b:Byte=8

    if (a<b){
        println("a sayısı b sayısından küçüktür")
    }
    else{

    }
    println("Bloktan çıkıldı")
    println()

    var yas:Int
    println("Yaşınızı Giriniz:")
    yas = readLine()!!.toInt()
    if (yas<=24){
        if (yas>18){
            println("A1 ve A2 sınıfındaki sürücü belgelerini alabilirsiniz")
        }
        else{
            println("Herhangi bir sürücü belgesi alamazsınız")
        }
    }
    else{
        println("Tüm sürücü belgelerini alabilir")
    }
}