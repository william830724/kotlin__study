package kotlinBook

import java.awt.List
import java.util.ArrayList

//interface
interface Roamable{
    fun roam()
}


//animal >> canine + hippo >>  wolf
//
abstract class Animal : Roamable{
    //abstract constant
//    open val image = ""
//    open val food =""
//    open val habitat = ""
    abstract val image:String
    abstract val food: String
    abstract val habitat :String
    open var hunger = 10
    open var test =""

    //modify to abstract fun
//    open fun makeNoice(){
//        println("The Animal is making a noise")
//    }
//    open fun eat(){
//        println("The Animal is eating")
//    }

    abstract fun makeNoice()
    abstract fun eat()

    //override interface function
    override fun roam(){
        println("The Animal is roaming")

    }
    fun sleep(){
        println("The Animal is sleeping")
    }
}

class Hippo : Animal(){
    override val image ="hippo.jpg"
    override val food: String = "grass"
    override val habitat: String = "water"

    init {
        test ="test"
    }

    override fun makeNoice() {
        println("Grunt! Grunt!")
    }

    override fun eat(){
        println("The Hippo is eating food")
    }

//    override fun sleep(){
//        println("test")
//    }

}



abstract class Canine() : Animal(){
    override fun roam() {
        super.roam()
        println("The Canine is roaming")
    }
}

class Wolf :Canine(){
    override val image = "Wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoice() {
        println("Hoooooowl!")
    }

    override fun eat(){
        println("The Wolf is eating $food")
    }

}

class Vehicle : Roamable{
    override fun roam() {
        println("The Vechicle is roaming")
    }
}

class Vet{
    fun getShot(animal: Animal){
        println("${animal.food} is his food")
        animal.makeNoice()
    }
}

fun main(){
    //call wolf class
    var w = Wolf();
    //call wolf class's roam
    w.makeNoice()
    //call canine's roam
    w.roam()
    //call Animal's sleep
    w.sleep()

//    var animal:Animals = Wolf()

    val animal: Animal = Wolf()
    animal.eat()

    val animals = arrayOf(Hippo(),Wolf())
    for(item in animals){
        item.roam()
        item.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo();
    vet.getShot(wolf)
    vet.getShot(hippo)

    //"is" example
    val roamable = arrayOf(Hippo(),Wolf(),Vehicle())
    for(item in roamable){
        item.roam()

        if(item is Animal){
            item.eat()
        }
    }
    if(roamable is Animal &&  roamable.hunger > 5){
        // todo
    }
    if(roamable !is Animal || roamable.hunger >= 5){
        // todo
    }

    //when >> java's switch
    var x : Int = 0
    when(x){
        0 -> println("x is zero")
        1,2 -> println("x is 1 or 2 ")
        3,4 -> {
            println("x is 3 or 4")
        }
        else -> println("")
    }

    var test :Animal = Wolf()
    when(test){
        is Wolf -> {
            // to do something
        }
        is Hippo ->{
            // to do something
        }
        is Animal ->{
            // to do something
        }
    }

    var r : Wolf = Wolf()
    r.eat()
    var r1 = r as Wolf
    r1.eat()
    if(r1 is Wolf){
        //to do some
    }

    var roam :Roamable = Wolf()
    var w1 = roam as Wolf
    roam.eat()
    w1.eat()

    val roamables = arrayOf(Hippo(),Wolf(),Vehicle())
    for (item in roamables){
        item.roam()
        if(item is Animal){
            item.eat()
        }
    }



}

class myClass : Any(){
    var myArray :Array<Any> = arrayOf(Wolf(),Hippo())
}


//open class test(name :String ,number :Int){
//
//}
//class test1(name_param: String ,number_param: Int) : test(name_param ,number_param){
//
//}