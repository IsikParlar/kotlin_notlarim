package KontrolDeyimleriVeDonguler

fun main(args: Array<String>) {

    var yas: Int
    println("Yaşınızı Giriniz:")
    yas = readLine()!!.toInt()
    var sonuc = if (yas <= 24) {
        if (yas > 18) {
            //println("A1 ve A2 sınıfındaki sürücü belgelerini alabilirsiniz")
            println("Yaşınız 18'den büyük")
            "A1 ve A2 sınıfındaki sürücü belgelerini alabilirsiniz"
        } else {
            //println("Herhangi bir sürücü belgesi alamazsınız")
            println("Yaşınız 18'den küçük")
            "Herhangi bir sürücü belgesi alamazsınız"
        }
    } else {
        //println("Tüm sürücü belgelerini alabilir")
        println("Yaşınız 24'ten büyük")
        "Tüm sürücü belgelerini alabilirsiniz"
    }
    println("Sonuç:"+sonuc)

    var x:Int=4
    if (x==4){
        println("x sayısı 4'e eşittir.")
    }
    else if (x==2){
        println("x sayısı 2'ye eşittir")
    }
    else{
        println("Hiçbir koşul sağlanmadı")
    }
}