package OOP

class Kullanici6:SoyutYapi6 {
    override var ad: String="Işık"

    override var soyad: String="Parlar"

    override var sayi: Int=25


    override fun deger_bastir() {
        var sonuc:String="Ad=$ad\n" +
                "Soyad=$soyad\n" +
                "Sayı=$sayi"
        println(sonuc)
    }
}
fun main(args: Array<String>) {
    var k=Kullanici6()
    k.deger_bastir()
}