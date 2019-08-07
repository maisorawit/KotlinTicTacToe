fun main(){
    val arr1d = arrayOf( 1, 2, 3, 4, 5)
    for(a in arr1d){
        print(a)
    }
    println()

    val arr1d2 = Array(5, {i -> 0})
    arr1d2[2] = 1
    for(a in arr1d2){
        print(a)
    }
    println()

    for(i in arr1d2.indices){
        print(arr1d2[i])
    }
    println()

}