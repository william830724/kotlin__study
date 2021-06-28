package ch2

class app {
}

//fun >> function
//main >> 類似java  public staitc void main
//setting >> enable lightin >> 字型渲染 >> 更好看到符號
// println >>system.out.println

//變數 迴圈 條件判斷式

//Kotlin Playground >> 線上幫忙compile kotlin
//REPL >>　tool kotlin >> kotlin repl >> compile kotlin >> 直接用mian 比較快吧
//Kotlin Script >> 不同於.. .kt >> 類似js >> 一行行執行(new >> kotlin script)
//
//Scratch File
//Kotlin Worksheet >> new kotlin worksheet

//管理專案 >> package


//point varible Name : Int .... = value

//>> 快捷鍵 main 就直接帶入以下
//fun main() {
//
//}


//    println()
//    print("")
//    println()

//第二章

//第一張已經放在github page上面
//move to medium
//
//統整後筆記
//https://docs.google.com/document/d/1SaMpkyyk-t-EOWjDXmqXyS4K5PkkSDRSpj9-1DnT9gI/edit#
//
//第二張 變數 常數 類型
//

val level: Int = 3
val level1: String = "string"

fun main(){


//    val msg : String = "hello"
//    val boolean : Boolean = true;
//    var thar: Char = 'f';
//    var test:List<Int> = arrayListOf(1,2,3)
//    println(msg);
//    println(thar);
//    println(test);
//  變數宣告
//    val valTest: String ="S";
//    valTest = "String";
//    val >> 不可重新賦予一個值 (final 修飾子?)
//    var test1: String = "stirng";
//    test1 = "test";
//    var >> 都可以改(variable)

//    變數推斷
//    val xxx = "String";
//    xxx += 3; >> 背認為String >> 出錯
//    var yyy = 1;
//    yyy += 3;

//    tool >> kotlin >> show kotlin byteCode >> decompile 就變成java code了
//    可以直接看kotlin >> java 的code
//    kotlin >> java >> java byte code
//    compile 過才有 bytecode

    var a :Int = 5;
    var b :Float = a.toFloat();

    println(a.compareTo(b))
    println(a)
    println(b)
}

//全域變數
var TEST = "function outside valuableName  is upperValue ";
fun test(){
    println(TEST);
}

var eee: String = "";
fun test2(variable : ArrayList<String>){

}

val yyy: Int = 1;

