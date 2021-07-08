package kotlinBook


//complex
class Dog1(name_param:String,weight_param:Int,breed_param: String){
//    constructor  >> for the param
    var name = name_param
    var weight = weight_param
    var breed = breed_param.toUpperCase()

    //if the variable is want't to init >> to add lateinit or you will not
    //only var can use
    lateinit var test: String
    lateinit var test1: String

//    if want more complex
    init {
        println("Dog $name has been created")
    }
}

class Dog(var name:String, var weight:Int, val type:String) {

    fun bar(){
        println("bark")
    }
    var weightInKgs: Double = 4.4
        get() = weight/2.2

    var wieghtTest:Int = 5
        get() = wieghtTest * 10

    var test:String = "test"
        get() = field
    set(value){
        field = value
    }

}


fun main(){
    var dog = Dog("",1,"")
    print(dog.test)
}

//fun main(){
//    var dog = Dog("name",33,"mixed")
//    println(dog.name)
//    println(dog.weight)
//    println(dog.type)
//    println(dog.bar())
//
//    var dogs = arrayOf(Dog("name1",33,"mixed"),Dog("name2",44,"mixed"))
//    dogs[1].name = "test1"
//    println(dogs[1].name)
//}