fun main(args: Array<String>) {
    var a:Int=4
    var b:Long=a.toLong()
    println("Int veri tipinde depolanan değer="+a)
    println("Long veri tipinde dönüşüm"+b)

    var x:Float=12.5F
    var y:Short= x.toInt().toShort()
    println()
    println("Float veri tipinden depolanan değer"+x)
    println("Short veri tipinde dönüşütürülen değer"+y)

    var ogrencisayisi:Int=20
    var o_sayisi :String="Öğrenci Sayısı=$ogrencisayisi dir"
    println(o_sayisi)

    println("Öğrenci Sayısı"+ogrencisayisi+" dir")
}