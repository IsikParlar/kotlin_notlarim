package ArraysCollectionsExceptions

import java.lang.ArithmeticException

fun main(args: Array<String>) {
    try {
        print("1.sayıyı giriniz:")
        var sayi:Int=readLine()!!.toInt()
        print("2.sayıyı giriniz:")
        var sayi2=readLine()!!.toInt()
        var sonuc:Int=(sayi/sayi2)
        println("Işlem Sonucu="+sonuc)
    }
    catch (e: ArithmeticException){
        println("Hatalı işlem yaptınız.")
        e.printStackTrace()
    }
    finally {
        println("Bu kod bloğu her durumda çalışır")
    }
}