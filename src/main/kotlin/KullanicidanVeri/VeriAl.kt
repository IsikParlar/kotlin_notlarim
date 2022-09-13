package KullanicidanVeri

fun main(args: Array<String>) {
    print("Adınız=")
    var ad:String= readLine()!!
    print("Soyadınız=")
    var soyad:String= readLine()!!
    print("Herhangi bir tam sayı giriniz=")
    var sayi:Int= readLine()!!.toInt()
    var sonuc:String="Ad="+ad+"\nSoyad="+soyad+"\nSayı="+sayi
    println(sonuc)
}