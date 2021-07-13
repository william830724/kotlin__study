package kotlinBook

class nullableTest {

    fun getAlphaWolf(): Wolf?{
        return Wolf()
    }


}
fun main(){
    var array = arrayOf("Hi","Hello",null)
    for(item1 in array){
        item1?.let {
            println(item1)
        }
    }

    var test = nullableTest()
    //origin
    var alpha = test.getAlphaWolf()
    if(alpha != null){
        alpha.eat()
    }
    // new
    test.getAlphaWolf()?.let { it.eat() }
//    test.getAlphaWolf()?.let { wolf: Wolf ->  }

    var w: Wolf? = Wolf()
    if(w != null)w.hunger else -1
    w?.hunger ?: -1


    var x = w!!.hunger
    println(x)

    var y :Wolf? = Wolf()
    y = null
    y = null
    var z :Animal? = Wolf()
    z = null
    var z1: String? = ""
    z1 = null
    var z2 :Int? = 1
    z2 = null
    fun z1(x: String?) : Int?{
        return null
    }
    fun z2(x: Int?) :Boolean?{
        return null
    }
    var z3 :Array<String?> = arrayOf("HI",null)
    var z4 = arrayOf("Hi???,",null)
    if(z != null){
        z.eat()
    }
    if(z!=null && z.hunger > 8){
        w.eat()
    }
//    if(z?.hunger!! > 8){
//        z?.eat()
//    }
    var z6 :Wolf? = Wolf()
    z6 = null

    println("z6 = ${z6?.hunger} ")

    class MyWolf{
        var a :Wolf? = Wolf()
    }
    var myWolf :MyWolf? = MyWolf()
//    myWolf= null
    println("myWolf = ${myWolf?.a?.hunger}")
    myWolf?.a?.hunger = 19999
    println("myWolf = ${myWolf?.a?.hunger}")
    if(myWolf?.a?.hunger != null){
        println(myWolf?.a?.hunger)
    }
    myWolf?.a?.let { println("myWolf is ${it.hunger}" )  }
    myWolf?.let { println("a is ${it.a?.hunger}") }

    var z7 :Wolf?= Wolf()
    z7?.let { println("w7 = ${it.hunger}") }
    z7.let { println("w7.hunger = ${it?.hunger}") }
    println("w7.hunger = ${z7?.hunger}")

    var array1 = arrayOf("hi",null,"Hellooo")
    for(item in array1){
        item?.let { println("item is $it") }
    }

    fun myFun():String?{
        return "String "
    }
    //let if object is null {} not to do
    myFun()?.let { println("myFun return is $it") }

    fun myFun2(): Wolf?{
        return Wolf()
    }
    myFun2()?.let { println("myFun2 return ${it.hunger}") }
    myFun2()?.let {
        it.hunger = 1000000
        println("myFun after is ${it.hunger}")
    }
    var w1 :Wolf? = Wolf()
    if(w1 != null)w.hunger else -1
    w1 = null
    println("w.hunger is ${w1?.hunger?: -1}")
}
