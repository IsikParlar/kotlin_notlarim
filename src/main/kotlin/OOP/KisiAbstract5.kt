package OOP

abstract class KisiAbstract5 {
    abstract var ad:String
    abstract var soyad:String
    var sayi:Int=100
    abstract fun islem_yap()
    fun ekrana_bastir(){
        var sonuc:String="Ad=$ad\n"+
                "Soyad=$soyad\n"+
                "Sayı=$sayi"
        println(sonuc)
    }
}