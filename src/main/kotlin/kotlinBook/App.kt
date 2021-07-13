import kotlinBook.Recipe

//fun main(args:Array<String>){
//    print("tset")
//}
fun main(){
//    println("Pow!!!")
//    var x = 1
//    println("Before the loop. x = $x.")
//    while(x <4 ){
//        println("In the loop.x = $x.")
//        x = x+1
//    }
//    println("After the loop. x = $x. ")
    var x = 3
    var y = 1
//    if(x >y){
//        println("x is greater than y")
//    }else{
//        println("x is not greater than y")
//    }

    //if 運算式
//    println(if (x >y) "x is greater than y " else "x is not greater than y")

    //can get variable not set this data
    var z:String
    var z1:Int

    var z2 :Int = 1
    z2 = 1.5.toInt()
    var z3:Double  = 1.5
    var z5 = z3.toInt()

    var x1:Char
    var x2:String

    var x3:Boolean

    var x4:Float
    var x5:Double

    var x9:Byte
    var x6:Short
    var x8:Int
    var x7:Long

    var r1= Recipe("Tha","",false)
    var r2 = r1.copy(isVegetraian = false)
    //兩個箱等
    var title = r2.component1();
    var titleTest = r2.title
    var r3 = Recipe("test r3","",false)
    var (r3_title,r3_isVegetarian )= r3
    println(r3_title) // test r3
    println(r3_isVegetarian) //false
    println(r1 === r2 ) // false (not same object)



}