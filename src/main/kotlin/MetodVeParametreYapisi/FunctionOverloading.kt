package MetodVeParametreYapisi

fun ortalama_hesapla(sayi1: Double, sayi2: Double): Double {
    return (sayi1 + sayi1) / 2
}

fun ortalama_hesapla(sayi1: Double, sayi2: Double, sayi3: Double): Double {
    return (sayi1 + sayi2 + sayi3) / 2
}

fun ortalama_hesapla(sayi1: Double, sayi2: Double, sayi3: Double, sayi4: Double): Double {
    return (sayi1 + sayi2 + sayi3 + sayi4) / 2
}

fun islem_yap(x: Int, y: Int): Int {
    return (x * y)
}

fun islem_yap(str:String):Unit{
    println(str)
}

fun main(args: Array<String>) {
    println("2 sayının ortalaması" + ortalama_hesapla(sayi1 = 1.0, sayi2 = 8.0))
    println("3 sayının ortalaması" + ortalama_hesapla(sayi1 = 9.0, sayi2 = 7.5, sayi3 = 6.5))
    println("4 sayının ortalaması" + ortalama_hesapla(sayi1 = 16.0, sayi2 = 7.0, sayi3 = 15.4, sayi4 = 12.6))
    println("Birinci sayıyı giriniz")
    println()
    var sonuc = islem_yap(4,5)
    println("Çarpma sonucu="+sonuc)
    islem_yap("Çarpma işlemi yapıldı")

}