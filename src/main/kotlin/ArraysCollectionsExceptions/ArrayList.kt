package ArraysCollectionsExceptions
/* a ve b
-add("...")-->Listeye eleman ekleman eklemek için kullanılır.
-clear()-->Eklenmiş olan tüm elemanları silmek için kullanılır.
-removeAt(int index)-->Belirtilen index'teki elemanı silmek için kullanılır.
-remove(Object o)-->O olarak tanımlanan elemanı silmek için kullanılır.
-size()-->Listedeki eleman sayısını verir.
-get(int index)--> Belirtilen index'teki elemanı tanımlar.
-contains(Object o)-->Belirtilen değerin ArrayList içerisinde olup olmadığını kontrol eder.Sonuca göre true veya
false değeri alır.*/
fun main(args: Array<String>) {
    val a=ArrayList<Int>()
    a.add(1)
    a.add(2)
    a.add(5)
    a.add(7)
    println("3.indexteki eleman="+a.get(3))
    a.remove(7)
    for(i in a){
        println("-->"+i)
    }
    a.add(9)
    a.add(0)
    print("1 ile 10 arasında bir tam sayı giriniz:")
    var k:Int=readLine()!!.toInt()
    if(a.contains(k)){
        println("Girilen sayı mevcut")
    }
    else {
        println("Böyle bir sayı bulunmuyor")
    }
}