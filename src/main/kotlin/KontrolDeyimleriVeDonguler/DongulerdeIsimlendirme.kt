package KontrolDeyimleriVeDonguler
//İç içe döngülerde içteki döngünün break ile sonlanıp dıştaki döngünün sonlanmaması problemi.
fun main(args: Array<String>) {
    var i='a'..'d'
    var i2=8..12

    dis_dongu@for (a in i){
        for (b in i2){
            if (b==10){
                break@dis_dongu
            }
            println("Dış Döngü="+a+"/İç Döngü="+b)
        }
    }
    println("Döngü Dışı")
}