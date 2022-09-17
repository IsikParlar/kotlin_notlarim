package ArraysCollectionsExceptions

fun main(args: Array<String>) {
    var x=Array<Int>(3){0}
    x[0]=2
    x[1]=3
    x[2]=4
    // println("3.index="+x[3])

    var y:Int=4
    println(y/0)
}