package Threads
//Multithreading

class IsParcacigiCoklu():Thread() {
    var gorevli_adi:String=""
    constructor(gorevli_adi:String):this(){
        this.gorevli_adi=gorevli_adi
        println(gorevli_adi+ " çalışmaya hazır")
    }

    override fun run(){
        for (i in 1..3){
            println("$gorevli_adi-->"+"$i.işi yapıyor")
        }
        println()
    }
}

fun main(args: Array<String>) {
    var gorevliA=IsParcacigiCoklu("Gorevli-A")
    var gorevliB=IsParcacigiCoklu("Gorevli-B")
    var gorevliC=IsParcacigiCoklu("Gorevli-C")
//Threadler için öncelik veriyoruz
    gorevliA.setPriority(10)
    gorevliB.setPriority(Thread.NORM_PRIORITY)
    gorevliC.setPriority(Thread.NORM_PRIORITY)

    gorevliA.start()
    gorevliB.start()
    gorevliC.start()
}