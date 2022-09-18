package ArraysCollectionsExceptions

fun main(args: Array<String>) {
    var setA= setOf(true,2,"Kotlin",'J',8,null,"Kotlin")
    var a=setA.size
    println("-->"+a)
    for(i in setA){
        println("-->"+i)
        //Set sınıfını kullanarak oluşturlan koleksiyonlarda tekrar edilen değerler bastırılmaz
    }
    println()
    println()
    var setB= mutableSetOf(false,9,"Java",'J',8,Math.PI,"Java")
    for(i2 in setB){
        println("-->"+i2)
    }
    setB.add(Math.E)
    setB.remove(false)
    println()
    for(i2 in setB){
        println("-->"+i2)
    }
}