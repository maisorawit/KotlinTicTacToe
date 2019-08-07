fun main() {
//    val array2d1 = arrayOf(
//        arrayOf( 1, 2, 3, 4, 5),
//        arrayOf( 6, 7, 8, 9, 10),
//        arrayOf( 11, 12, 13, 14, 15),
//        arrayOf( 16, 17, 18, 19, 20),
//        arrayOf( 21, 22, 23, 24, 25)
//    )
//
//    for( row in array2d1){
//        for( col in row){
//            print("$col ")
//        }
//        println()
//    }
//
//    array2d1[1][1] = 0
//
//    for( i in array2d1.indices){
//        for( j in array2d1[i].indices){
//            print("${array2d1[i][j]} ")
//        }
//        println()
//    }

    val table = arrayOf(
        arrayOf(' ', '1', '2', '3'),
        arrayOf('1', '-', '-', '-'),
        arrayOf('2', '-', '-', '-'),
        arrayOf('3', '-', '-', '-')
    )

    println("Welcome to OX Game")
    for(row in table){
        for(col in row){
            print("$col ")
        }
        println()
    }

    val rowInput = 2
    val colIntput = 2
    table[rowInput][colIntput] = 'X'

    for(row in table){
        for(col in row){
            print("$col ")
        }
        println()
    }

    val array2d2 = Array(5, {Array(5,{0})})
    for(row in array2d2){
        for(col in row){
            print("$col ")
        }
        println()
    }



}