package OOP

class KullaniciAbstract5(override var ad:String,override var soyad:String):KisiAbstract5() {
    override fun islem_yap() {
        println("İşlemler yapılıyor...")
    }
}

fun main(args: Array<String>) {
    var m =KullaniciAbstract5("Işık","Parlar")
    m.islem_yap()
    m.ekrana_bastir()
}