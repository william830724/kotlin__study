package kotlinBook

//class Recipes {
    data class Recipe(val title: String,
                      val mainIngredient: String,
                      val isVegetraian: Boolean = false,
                      val difficulty:String = "Easy"){
    }
    //main constructor
    class Mushroom(val size:Int,
                   val isMagic: Boolean){
        constructor(isMagin_param: Boolean)
            : this(size = 0,isMagic = isMagin_param){
                // side constructor
            }
    }

    fun findRecipes(title: String = "",
                    ingredient: String = "",
                    isVegetarian: Boolean = false,
                    difficulty: String = "") : Array<Recipe>{
        //code
        return arrayOf(Recipe(title,ingredient,isVegetarian,difficulty))
    }

    //overload in kotlin
    fun addNumbers(a: Int,b: Int): Int{
        return a + b
    }
    fun addNumbers(a: Double,b: Double): Double{
        return a + b
    }
//}


fun main(){
    val r1 = Recipe("Thai Curry","Chicken")
    val r2 = Recipe(title = "Thai Curry",mainIngredient = "Chicken")
    val r3 = r1.copy(title = "Chicken Bhuna ")
    println("r1 hash code: ${r1.hashCode()}")
    println("r2 hash code: ${r2.hashCode()}")
    println("r3 hash code: ${r3.hashCode()}")
    println("r1 toString: ${r1.toString()}")
    println("r1 == r2? ${r1 == r2}")
    println("r1 === r2? ${r1 ===r2}")
    println("r1 == r3? ${r1 == r3}")
    val  (title,mainIngredient,Vegetraian,difficulty) = r1 //解構 r1 >> in the val
    println("title is $title and vegetraian is $Vegetraian")

    val m1= Mushroom(6,false)
    println("m1 size is ${m1.size} and isMagic is ${m1.isMagic}")
    val m2 = Mushroom(true)
    println("m2 size is ${m2.size} and isMagic is ${m2.isMagic}")

    println(addNumbers(2,5))
    println(addNumbers(1.6,7.3))
}