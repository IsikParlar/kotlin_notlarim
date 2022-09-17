package MetodVeParametreYapisi

fun deger_bastir(): Unit {
    println("Parametresiz metod/fonsiyon çalışıyor")
}

fun tc_kimlik_no() = 421544545224

fun toplama_yap(x: Int, y: Int): Int {
    return (x + y)
}

fun main(args: Array<String>) {
    deger_bastir()
    println("TC Kimlik No=" + tc_kimlik_no())
    println("Toplamak istediğiniz 1.tam sayıyı giriniz:")
    var birinci_sayi= readLine()!!.toInt()
    println("Toplamak istediğiniz 2.tam sayıyı giriniz:")
    var ikinci_sayi= readLine()!!.toInt()
    var sonuc=toplama_yap(birinci_sayi,ikinci_sayi)
    println("Toplama sonucu="+sonuc)
}