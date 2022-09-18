package ArraysCollectionsExceptions

fun main(args: Array<String>) {
    var listA=listOf(true,2,"akahraman",'J',8,null)
    //listA[0]=false
    println("2.Index="+listA[2])
    println("2.Index(2)="+listA.get(2))
    var a:Int=listA[1] as Int
    var b:Int=listA[4] as Int
    println("$a+$b="+(a+b))
    var x=CollectionA()
    x.koleksiyonu_bastir()
    var listB= listOfNotNull(false,4,"Kotlin",null)
    println()
    println()
    var i2=0
    while(i2<=listB.size-1){
        println("-->"+listB[i2])
        i2++
    }
}
var listA= listOf(false,"akahraman",4.2,null,true)
class CollectionA{
    fun koleksiyonu_bastir(){
        for(i in 0..listA.size-1){
            println("-->"+listA[i])
        }
    }
}