import java.util.Scanner
var array = arrayOf(
    arrayOf("-","-","-"),
    arrayOf("-","-","-"),
    arrayOf("-","-","-")
)
var player = "x"
val reader = Scanner(System.`in`)
fun play(){
    while (true) {
        try {
            printTable()
            val result = input()
            if(result==true){
                printTable()
                println("$player win!")
                break
            }else if (result=="draw"){
                printTable()
                println("Draw !")
                break
            }
        } catch (t: Throwable) {
            println("Your input is incorrect")
        }
    }
}
fun printTable(){
    println("0 1 2 3")
    println("1 ${array[0][0]} ${array[0][1]} ${array[0][2]}")
    println("2 ${array[1][0]} ${array[1][1]} ${array[1][2]}")
    println("3 ${array[2][0]} ${array[2][1]} ${array[2][2]}")
}
fun switchPlayer(){
    if(player.equals("x")){
        player = "o"
    }else{
        player = "x"
    }
}
fun checkWinner(): String {
    var result="continue"
    if(array[0][0].equals("x") && array[1][0].equals("x") && array[2][0].equals("x")
        || array[0][1].equals("x") && array[1][1].equals("x") && array[2][1].equals("x")
        || array[0][2].equals("x") && array[1][2].equals("x") && array[2][2].equals("x")
        || array[0][0].equals("x") && array[0][1].equals("x") && array[0][2].equals("x")
        || array[1][0].equals("x") && array[1][1].equals("x") && array[1][2].equals("x")
        || array[2][0].equals("x") && array[2][1].equals("x") && array[2][2].equals("x")
        || array[0][0].equals("x") && array[1][1].equals("x") && array[2][2].equals("x")
        || array[0][2].equals("x") && array[1][1].equals("x") && array[2][0].equals("x")){
        result="x"
    }else if(array[0][0].equals("o") && array[1][0].equals("o") && array[2][0].equals("o")
        || array[0][1].equals("o") && array[1][1].equals("o") && array[2][1].equals("o")
        || array[0][2].equals("o") && array[1][2].equals("o") && array[2][2].equals("o")
        || array[0][0].equals("o") && array[0][1].equals("o") && array[0][2].equals("o")
        || array[1][0].equals("o") && array[1][1].equals("o") && array[1][2].equals("o")
        || array[2][0].equals("o") && array[2][1].equals("o") && array[2][2].equals("o")
        || array[0][0].equals("o") && array[1][1].equals("o") && array[2][2].equals("o")
        || array[0][2].equals("o") && array[1][1].equals("o") && array[2][0].equals("o")){
        result="o"
    }else{
        for (i in array.indices){
            for (j in array[i].indices){
                if(array[i][j]=="-"){
                    result="continue"
                    break;
                }else{
                    result="draw"
                }
            }
        }
    }
    return result
}
fun input():Any {
//    val res = checkWinner()
//    if(res=="x" || res=="o"){
//        return true
//    }else if (res=="draw"){
//        return res
//    }else{
        println("$player turn")
        print("Please input Row Col: ")
        val row = reader.next();
        val col = reader.next();
        if (array[row.toInt()-1][col.toInt()-1] != "-") {
            println("Your input is incorrect")
            input()
        }else{
            array[row.toInt()-1][col.toInt()-1] = player
            val res = checkWinner()
            if(res=="x" || res=="o"){
                return true
            }else if (res=="draw"){
                return res
            }
            switchPlayer()
        }
//    }
    return false
}
fun main() {
    play()
}