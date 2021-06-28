class test {
}

fun main(){
//        var name :String = "";
//        name = null.toString();
//        var name1: String? = "";
//        name1 = null;
//        if (name1 != null) {
//            print(name1.length)
//        };

    var test1: String? = null;
//    println(test1?.toUpperCase()?.replace("Y","")?: -1)
//    println(test1?.length?:-1);


//    println(test1?.length)
    var test2: Int = 1;
    var test3 = 1;
    var test4 = test3.toDouble();
    var test5 : Long = test4.toLong();
//    print(test5)

    var testArray: Array<String>  = arrayOf("name1","name2")
    var testArray2 = arrayOf("name1","name2");
    var testArray3 = arrayOf(1,2,3,4,5);
    var testArray4 = doubleArrayOf(100.0,200.0);
    var test6 = null;
    var test7:Any ="test";

//    println(test6 is String);
//    println(test7 is String)
//    println(test3 is Int);
    val test8 = 1;
//    println(test8 is String);
//    println(test8 as? String);
//    println(test8 as Int);
//    println(test8 as? Int  ?: -1);
//    println(test8 as? String ?.)
//    println(test8 is String);
//    if(test8 is String)return;
//    println(test8 as? String ?: "test8 don't cast to String");

    var name = "william ";
    var age = "5"
//    println("my name is $name age is $age")
//    println("my name is " + name + " ")
//    println("my name's length is ${name.length} age's lenght  is ${age.length}")
//    println(" 1 + 1 = ${1 + 1}")

    var x =1000;
//    if (x > 1 ) x =0 else  x=2
//    if(x >1 ){
//        x =0
//    }
//    when (x){
//        1 -> x +1;
//        in 2..10 -> x +2;
//        19,100 -> x +3;
//        else -> {
//            x +3
//        }
//    }
    when{
        x ==1 -> x +1;
        x in 2..10 -> x+2 ;
        x == 19 -> x+ 3
        x ==100 -> x +3
        else -> {
            x = 3
        }
    }
//    println(x)

    var y = 3;
//    for(y in 0..9){
//        print(y)
//    }
//    for(y in 0.rangeTo(9)){
//        print(y)
//    }

    // 0<=y<10
//    for(y in 0 until 10){
//        print(y)
//    }

//    for(y in 10 downTo 0 step 2) print(y)
//    for(y in 10.rangeTo(20) step 2) print(y)
//    val array:List<String> = listOf("name1","name2","name3")
//    val array2 = listOf("name1","name2","name3")
//    for (test in array2){
//        println(test)
//    }

    val names = listOf("Tony", "Tom", "Tiffany")
//    for ((index, name) in names.withIndex()) {
//        println("$index: $name")
//    }
//    println(names.withIndex())
//    for((index,name) in names.withIndex()){
//        println("$index:$name")
//    }
//    names.size;
//    println(names.indices)
//    for(index in names.indices){
//        println("$index : ${names[index]}")
//    }
//    for()

    var i = 5
//    while(i>0){
//        print(i)
//        i--
//    }
//    do{
//        print(i)
//        i--
//    }while (i>0)

    //離開迴圈
    /*
    * break  >> 當前迴圈
    * continue >> 跳下一個
    * return >> 全部回圈跳出*/

    fun test(){}
    fun test1() : Unit{}
    fun test(a: Int){}
    fun test(a: Int,b: String){}
    fun test(a: String): Int{return 1}
    fun test(a: Boolean) = a;
    fun test(a: String = "",b: Int =0,c: String=""){print(b)}
//    test("",,"")

//    fun sum(a: Int = 0, b: Int = 0) {
//        print(a + b)
//    }
//    sum(1, 2) // [結果] 3
//    sum(1) // [結果] 1
//    sum()

    // 參數 b 有指定預設值
//    fun sum(a: Int, b: Int = 10, c: Int) {
//        println(a + b + c)
//    }
//    // 所有參數必須依序指定值
//        sum(1, 2, 3)
//    // 使用參數名稱指定值，略過有預設值的 b
//        sum(a = 1, c = 3)
//    // 只要以名稱指定參數的值，就可以忽略原始參數的順序
//        sum(c = 1, a = 2, b = 3)

//    fun test(a: Int ,b: Int){
//        println(a +b)
//    }
//    fun test1(a:Int,b: Int=0) = println(a + b)
//    test(1,2)
//    test1(b=0,a=0)

    fun plus(a: Int, b: Int): Int {
        val result = a + b
        // 區域函式
        fun showResult() {
            // 區域函式可以存取外部函式的變數
            println(result)
        }
        // 呼叫區域函式
        showResult()
        return result
    }
    val test = plus(1,1)

    println("test = ${plus(1,2)}")

}