package KontrolDeyimleriVeDonguler

fun main(args: Array<String>) {
    var a:Int=0
    while (a<=36){
        if (a%2==0){
            println("a(Çift)="+a)
            if (a==18){
                println("Döngü sonlanıyor...")
                //break
                //return
            }
        }
        a++
    }
    println("Çalışıyor...")
    println()
    println()

    for (x in 1..5){
        if (x==3){
            continue
        }
        println("x-->"+x)
    }
}