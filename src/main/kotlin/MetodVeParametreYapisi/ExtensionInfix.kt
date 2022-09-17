package MetodVeParametreYapisi

fun Int.toplama_yap():Int{
    return this+8
}
fun main(args: Array<String>) {
    println(6.toplama_yap())
    var x=10.toplama_yap()
    println(x)
    var sonuc=6 cikarma_yap 4
    println("Çıkarma sonucu:"+sonuc)
}

//Infix
infix fun Int.cikarma_yap(a:Int):Int=this-a