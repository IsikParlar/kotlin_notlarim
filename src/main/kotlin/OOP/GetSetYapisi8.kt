package OOP

class GetSetYapisi8 {
    var ad:String?=null
        get()=field

        set(value){
            field=value
        }
    var soyad:String?=null
        get()=field

        set(value){
            field=value
        }
    var cep_no:Int?=null
        get()=field

        set(value){
            field=value
        }
    var boy:Double?=null
        get()=field

        set(value){
            field=value
        }
}

fun main(args: Array<String>) {
    var a=GetSetYapisi8()
    a.ad="Ali"
    a.soyad="KAHRAMAN"
    a.cep_no=1231432
    a.boy=1.84
    println(a.ad+" "+a.soyad)
}