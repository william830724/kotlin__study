package kotlinBook

class constructorTest {
    fun test1(){
        //1
        val r = Recipe("Spaghetti", "Beef")
        val r1 = Recipe("Spaghetti", "Beef", true)
        val r2 = Recipe("Spha..", "Beef", true, "Easy")

        //2
        val r4 = Recipe(title = "Spaghetti", mainIngredient = "Beef")
        val r5 = Recipe(mainIngredient = "Beef", title = "Spaghetti")
        val r6 = Recipe(title = "Spahetti", mainIngredient = "Beef", isVegetraian = true)
    }

    fun test(){
        val r1 = Recipe("Thain", "", false)
//        r1.test = "test"
        val r2 = Recipe("Thain", "", false)
//        r2.test = "tet"
        println(r1 == r2)// true >> only compare with constract
    }

    //main constructor
    class Mushroom(val size:Int,val isMagic:Boolean){
        constructor(isMagic_param: Boolean) : this(0,isMagic_param){
            // side constructor code
        }
    }
    fun test2(){
        val m = Mushroom(1,true)
        val m1 =Mushroom(true)
    }

    fun findRecipes(title: String = "",
                    ingredient: String = "",
                    isVegetarian: Boolean = false,
                    difficulty: String = "") : Array<Recipe>{
        //code
        return arrayOf(Recipe("test",""))
    }

    //only title varable the others are default value
    val recipes = findRecipes("Thai curry")
    // other function
    val recipes2 = findRecipes(title = "Thai curry ")

    //Overload in kotlin
    fun addNumbers(a: Int,b: Int): Int{
        return a + b
    }
    fun addNumbers(a: Double,b: Double): Double{
        return a + b
    }


    val x :Int = 0
    fun test3(a :Int = if(x > 0) x else 0,
                b :Int = if(x >0) 0 else x){
        // code
    }

}

fun printlnInt(x: Int?){
    println(x)
}
//fun println(x:String?) : String?{
//    return null
//}

fun main(){
    var w: Wolf = Wolf()
    var w1 = Wolf()
    //default situation >>  kotlin not accept null value
    //w1 = null
    // Wolf type or null
    var w2 :Wolf? = Wolf()
    w2 = null
    var w3 :String? = null
    var myArray: Array<String?> = arrayOf(null,"String",null,"Hi!")
    //auto compile >> myArray: <String?>
    var myArray2 = arrayOf("String",null)
    var w4 = null
//    var w5 :Wolf = null
    println(w3)
    printlnInt(x= null)

    //判斷w != null 才可判斷hunger
    if(w != null && w.hunger > 5){
        w.eat()
    }



}

class  MyWolf(){
    var w:Wolf? = Wolf()
    fun myFun(){
        if(w != null ){
            w?.eat()
        }
        println(w?.hunger)
    }
    // w = null x will be null
    //x be compiled to be Int? (null or Int)
    var x = w?.hunger
    // error x may be a null
//    var x1 = w.hunger
//    w?.let{
//        println(it.)
//    }





}