package IO

import java.io.FileReader

fun main(args: Array<String>) {

    try {

    var fileB = FileReader("src/Veri.txt")
    var okunan_veri: Int

    do {
        okunan_veri = fileB.read()
        print(okunan_veri.toChar())
    } while (okunan_veri != -1)

    fileB.close()

    }
    catch (e:Exception){
        println("Dosya okuma sırasında bir hata oluştu")
        e.printStackTrace()
    }
}