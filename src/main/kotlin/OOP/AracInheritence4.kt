package OOP
open class AracInheritence4(model:Int,agirlik:Int,renk:String) {
    var model:Int
    var agirlik:Int
    var renk:String
    init {
        this.model=model
        this.agirlik=agirlik
        this.renk=renk

    }
    open fun ekrana_bastir(){
        var sonuc:String="Araç Modeli=$model\n"+
                "Aracın Ağırlığı=$agirlik\n" +
                "Aracın Rengi=$renk"
        println(sonuc)
    }
}