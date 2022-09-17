package OOP
//Normal classlarda nesneler aynı değeri gösterse bile equals metodu false döner.
//Data classlarda ise true döner.

data class DataClassGetterSetter7(var ad: String, var soyad: String) {

}

class Veri2(var ad: String, var soyad: String) {
    override fun toString(): String {
        return "ad=$ad,soyad=$soyad"
    }
}

fun main(args: Array<String>) {
    var v = DataClassGetterSetter7("Ali", "Kahraman")
    var v2 = Veri2("Ali", "Kahraman")
    println("v(Veri Sınıfı)" + v)
    println("v(Normal Sınıf)" + v2)
    var yeni_veri = v.copy("Kazım", "Tan")
    var yeni_veri2 = v.copy("Buse", "Yürek")
    var sonuc: Boolean = yeni_veri.equals(yeni_veri2)
    println("-->" + sonuc)
    var v3 = DataClassGetterSetter7("Ali", "Kahraman")
    var v4 = Veri2("Ali", "Kahraman")
    println("Nesneler birbirine eşit mi(Dataclass)=${v.equals(v3)}")
    println("Nesneler birbirine eşit mi(NormalClass)=${v2.equals(v4)}")
    var(ad2,soyad2)=v
    println(ad2+""+soyad2)
}