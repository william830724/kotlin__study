package kotlinBook

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

class NullValues {
    class Wolf{
        var hunger = 10
        val food = "meat"

        fun eat(){
            println("The Wolf is eating $food")
        }
    }
    class MyWolf(){
        var wolf :Wolf? = Wolf()

        fun myFunction(){
            wolf?.eat()
        }
    }
    fun getAlphaWolf(): Wolf?{
        return Wolf()
    }
}

fun main(args: Array<String>){
    var w:NullValues.Wolf? = NullValues.Wolf()
    if(w != null){
        w.eat()
    }

    var x = w?.hunger
    println("The value of x is $x")
    var y = w?.hunger ?: -1
    println("The value of y is $y")

    var myWolf = NullValues.MyWolf()
    myWolf?.wolf?.hunger = 8
    println("The value of myWolf?.wolf?.hunger is ${myWolf?.wolf?.hunger}")

    var myArray = arrayOf("Hi","Hello",null)
    for (item in myArray){
        item?.let { println(it) }
    }

    w = null
//    var z = w!!.hunger

    try {
        setWorkRatePercentage(100)
    }catch (e: IllegalArgumentException){
        println("")
    }


}

fun myFunction(str: String){
    try {
        val x = str.toInt()
        println(x)
        println("myFunction has ended")
    }catch (e: NumberFormatException){
        //if error occor step 1
        println("Bummer")
        e.printStackTrace()

    }finally {
        // setp 2
        println("")
    }
}

fun setWorkRatePercentage(x: Int){
    if(x !in 0..100){
        throw IllegalArgumentException("Percentage not in range 0..100: $x")
    }
}

