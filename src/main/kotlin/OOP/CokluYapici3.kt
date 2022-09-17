package OOP

class Yapici{
    var karakter:Char='A'
    var sayi:Int=0
    constructor(karakter:Char){
        this.karakter=karakter
    }
    constructor(karakter: Char,sayi:Int){
        this.karakter=karakter
        this.sayi=sayi
    }
    fun deger_bastir(){
        var ozellikler:String="Karakter=$karakter\n"+
                "Sayı=$sayi"
        println(ozellikler)
    }
}

fun main(args: Array<String>) {
    var nesneA:Yapici= Yapici('A')
    nesneA.deger_bastir()
    var nesneB:Yapici= Yapici('A',8)
    println()
    nesneB.deger_bastir()
}