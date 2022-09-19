package Threads

class IsParcacigi:Thread() {
    var gorevliA:String="Işık Parlar"
    override fun run(){
        println(gorevliA+" çalışıyor...")
        Thread.sleep(3000)
        println("$gorevliA işini bitirdi")
    }
}

fun main(args: Array<String>) {
    var i = IsParcacigi()
    i.start()
}