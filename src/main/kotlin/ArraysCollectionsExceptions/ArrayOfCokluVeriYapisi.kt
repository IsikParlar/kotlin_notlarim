package ArraysCollectionsExceptions

fun main(args: Array<String>) {
    var coklu_dizi=arrayOf(2,"Kotlin",'J',3.5)
    println("2.index="+coklu_dizi[2])
    println("2.index(2)="+coklu_dizi.get(2))
    println("1.index="+coklu_dizi.get(1))
    coklu_dizi[1]="Java"
    println("Güncellenmiş 1.index="+coklu_dizi[1])
    var double_deger=doubleArrayOf(3.14,2.71)
    println("Pi="+double_deger[0])
    println("e="+double_deger[1])
    println()
    println()
    for(i in 0..coklu_dizi.size-1){
        println("[$i].index="+coklu_dizi[i])
    }
}