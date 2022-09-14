package KontrolDeyimleriVeDonguler

fun main(args: Array<String>) {
    var a:Byte=0
    while (a<=9){
        println("a="+a)
        a++
    }
    println()
    var b:Short=0
    do {
        //Döngü sağlanmasa bile do içindeki kod 1 kez çalışır
        println("b=$b")
        b++
    }
        while (b<10)
}