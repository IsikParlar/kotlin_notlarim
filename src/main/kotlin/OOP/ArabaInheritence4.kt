package OOP

class ArabaInheritence4(model:Int,agirlik:Int,renk:String,fiyat:Int,kapiSayisi:Int):AracInheritence4(model,agirlik,renk) {
    var fiyat:Int
    var kapiSayisi:Int
    init {
        this.fiyat=fiyat
        this.kapiSayisi=kapiSayisi
    }

    override fun ekrana_bastir() {
        super.ekrana_bastir()
        println("Araç Fiyatı="+fiyat)
        println("Aracın Kapı Sayısı="+kapiSayisi)
    }
}

fun main(args: Array<String>) {
    var a=ArabaInheritence4(2020,2000,"Siyah",40000,4)
    a.ekrana_bastir()
    println()
    a.fiyat=45000
    println()
    a.ekrana_bastir()
}