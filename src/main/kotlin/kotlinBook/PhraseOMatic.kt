package kotlinBook

class PhraseOMatic {
}

fun main(){
    val wordArray1 = arrayOf("24/7","multi-tier","B-to-B","dynamic","prevasive")
    var wordArray2 = arrayOf("empowered","leveraged","aligned","targeted")
    var wordArray3 = arrayOf("porcess","paradigm","solution","portal","vision")

    val arraySize1 = wordArray1.size
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size

    val rand1 = (Math.random() * arraySize1).toInt()
    val rand2 = (Math.random() * arraySize2).toInt()
    val rand3 = (Math.random() * arraySize3).toInt()

    val pharse = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]} "

    println(pharse)

    //使用String 模版 引用變數
    var x = 42
    var value = "value of x is $x"
    println(value)

    var myArray = arrayOf(1,2,3)
    var arraySIze = "myArray has ${myArray.size} items"
    var firstItem = "the first item is ${myArray[0]}"

    println(firstItem)
    var result = "myArray is ${if (myArray.size >10) "large" else "small" }"
    println(result)

    myArray[1] = 3
    println(myArray[1])
    myArray.set(1,4)
    println(myArray[1])


    println("max values is ${max(1,3)}" )



//    fun getGameChoice (optionsParam:Array<String>):String{
//        return optionsParam[(Math.random() * optionsParam.size).toInt()]
//    }
    fun getGameChoice (optionsParam:Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]

    val options = arrayOf("Rock","Paper","Scissors")
    println(getGameChoice(options))

    var testArray1 = arrayOf("1TEST","2test","3test")
    for (item in testArray1) println(item)
    for( test in testArray1.indices) println("Index $test has items ${testArray1[test]}")
    for ((test,item) in testArray1.withIndex()) println("test $test has items $item")

}

fun max (a: Int ,b: Int): Int {
    val maxValue = if(a >b) a else b;
    return maxValue
}

//不回傳型態 不回傳值 >> 預設用Unit
fun min(a:Int): Unit{
    return Unit
}
fun min (){
    return Unit;
}