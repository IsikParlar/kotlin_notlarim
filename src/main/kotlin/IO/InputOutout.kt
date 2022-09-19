package IO

import java.io.File
import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {

    try {

    //var file = FileWriter("src/Veri.txt")
    println("Adınızı ve soyadınızı giriniz=")
    var a= readLine()!!
    var fileA = FileWriter("src/Veri.txt",true)
    //Veri yazıldıktan sonra program tekrar başlatılığında yazılan verinin korunması için "true" ifadesi girilir.
    fileA.write(a+"\n")
    fileA.close()

    var fileC=FileReader("src/Veri.txt")
        fileC.forEachLine {
            println(it)
        }

    var file_name = "Veri2.txt"
    var file2= File(file_name)
    file2.createNewFile()//Dosya yolu belirtilmezse dosya projenin içine oluşturulur
    }
    catch (e:Exception){
        println("Bir hata oluştu"+e)
    }
    println("Dosya oluştu ve veri başarıyla yazıldı")
}