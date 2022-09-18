package ArraysCollectionsExceptions

fun main(args: Array<String>) {
    var mapA=mapOf<Char,String>('a' to "Kotlin",'b' to "Java",'1' to "Bir")
    var listAA= listOf<String>("Kotlin")
    println("a anahtarının karşılığı-->"+mapA.get('a'))
    for(i in mapA){
        println("-->"+i.value)
    }
    println()
    for(i in mapA){
        println("-->"+i)
    }
    var k=mapA.containsKey('c')
    println("a adında bir anahtar vardır(true or false)-->"+k)
}