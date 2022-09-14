package KontrolDeyimleriVeDonguler

fun main(args: Array<String>) {
    /*for (int x=1;i<=5;x++){
        Java gösterimi
    }*/

    for (x in 1..5){
        println("x="+x)
    }

    var bir_ile_on=1..10
    for (y in bir_ile_on){
        println("Döngü sayısı=$y")
    }
    println()
    println()
    var on_ile_onbes=10..15
    for (y in bir_ile_on){
        for (z in on_ile_onbes){
            println("$y+$z="+(y+z))
        }
    }



}