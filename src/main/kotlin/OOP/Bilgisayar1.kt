package OOP

class Bilgisayar1 {
    var renk: String? = null
    var marka: Char? = null

    fun deger_bastir() {
        var ozellikler: String = "Renk=$renk\n" +
                "Marka=$marka"
        println(ozellikler)
    }
}