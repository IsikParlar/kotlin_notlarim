package ArraysCollectionsExceptions

fun main(args: Array<String>) {
    var listC= arrayListOf(true,2,"akahraman",'J',8,null)
    println("-->"+listC.get(4))
    listC.set(4,6)
    println("-->(2)="+listC.get(4))
    for(i in 0..listC.size-1){
        println("list[$i]-->"+listC[i])
    }
    listC.clear()
    listC.add(0,4)
    println()
    for(i in 0..listC.size-1){
        println("list[$i]-->"+listC[i])
    }
    println()
    println()

    var listD= mutableListOf(8)
    listD.remove(8)
    var a=0
    while(a<=9){
        var sayi=(8..40).random()
        listD.add(sayi)
        a++
    }
    var b=0
    while (b<=listD.size-1){
        println("listD[$b]-->"+listD[b])
        b++
    }

}