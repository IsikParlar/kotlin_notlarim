package ArraysCollectionsExceptions

fun main(args: Array<String>) {
    val a=Array<Int>(10){0}
    a[0]=4
    a[1]=5

    a.set(2,8)
    a.set(3,9)

    println("Dizinin 0.indexi="+a[0])
    println("Dizinin 1.indexi="+a[1])
    println("Dizinin 2.indexi="+a.get(2))

    println()
    for(i in 0..a.size-1){
        println("Değer[$i]="+a[i])
    }
    println()
    println()
    val b=Array<String>(4){""}
    for(i in 0..b.size-1){
        print("Karakter giriniz=")
        b[i]=readLine()!!
    }
    var i2=0
    while(i2<=3){
        println("Değer[$i2]="+b[i2])
        i2++
    }
}