package ArraysCollectionsExceptions

fun main(args: Array<String>) {
    var map2= hashMapOf<Int,Int>()
    map2.put(4,8)
    map2.put(0,-1)
    map2.put(11,4)
    map2.put(19,9)
    println("19 numaralı anahtarı kullanan değer="+map2.get(19))
    map2.set(19,4)
    println("19 numaralı anahtarı kullanan değer(2)="+map2.get(19))
    if(!map2.isEmpty()){
        for(i in map2){
            println("-->"+i)
        }
    }
    else {
        println("Değer depolanıyor")
    }
    var map3= mutableMapOf<Int,String>(4 to "Java",5 to "Kotlin")
    println()
    println()
    println("Güncel olmayan değer-->"+map3.get(4))
    map3.remove(4)
    println("Güncel değer-->"+map3.get(4))
    var map4= mutableMapOf<Char,String>('4' to "Java")
    var sonuc:Boolean=map3.equals(map4)
    println()
    println("Sonuç="+sonuc)

}