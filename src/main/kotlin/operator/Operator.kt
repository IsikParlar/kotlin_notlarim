package operator

fun main(args: Array<String>) {
    var bes_ile_on=5..10
    var sonuc=6 in bes_ile_on
    println("6 rakamı 5 ile 10 arasında mı?"+sonuc)

    var a_ile_e='a'.rangeTo('e')
    var sonuc2='i' in a_ile_e
    println("i harfi a ile e arasında mı?"+sonuc2)
}