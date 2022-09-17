package ArraysCollectionsExceptions

import java.lang.IllegalArgumentException

fun main(args: Array<String>) {
    var x:Int=5
    var y:Int?=null
    var sonuc=x?:throw
    IllegalArgumentException("Null bir değer tanımlı")
    println("x sayısı="+sonuc)
    var sonuc2=y?:throw
    IllegalArgumentException("Null bir değer tanımlı")
    println("y sayısı="+sonuc2)

}