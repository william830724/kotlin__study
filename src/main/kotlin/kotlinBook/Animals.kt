package kotlinBook

import java.awt.List
import java.util.ArrayList


//animal >> canine + hippo >>  wolf
//
abstract class Animals {
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

    open fun roam(){
        println("The Animal is roaming")

    }
    fun sleep(){
        println("The Animal is sleeping")
    }
}

class Hippo : Animals(){
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
        println("The HIippo is eating food")
    }

}



abstract class Canine() : Animals(){
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

class Vet{
    fun getShot(animal: Animals){
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

    val animal: Animals = Wolf()
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




}

//open class test(name :String ,number :Int){
//
//}
//class test1(name_param: String ,number_param: Int) : test(name_param ,number_param){
//
//}