package kotlinBook

class Songs (val title: String,val artist:String){
    fun play(){
        println("play the song $title by $artist")
    }
    fun stop(){
        println("Stopped playing $title")
    }
}

fun main(){
    val songOne = Songs("the Mesopotamians ","They might Be Giants")
    val songTwo = Songs("Going Underground","The Jam")
    songTwo.play()
    songTwo.stop()
    songOne.play()
}