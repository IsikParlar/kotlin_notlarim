package KontrolDeyimleriVeDonguler

fun main(args: Array<String>) {
    println("Bir sayı giriniz")
    var a:Int= readLine()!!.toInt()
    when(a){
        1-> println("Girilen sayı=$a")
        3-> println("Girilen sayı?$a")
        5-> println("Girilen sayı?$a")
        7-> println("Girilen sayı?$a")

        else->{
            println("1,3,5,7 rakamlarından farklı bir değer girdiniz.")
        }
    }
}