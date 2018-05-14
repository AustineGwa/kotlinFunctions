/**
 * Created by gwaza on 5/13/2018.
 */

fun main(vararg :Array<String>){

    var output = getSum(10, 20)
    println(output)
    println("max value is  ${maxOf(10, 20)}")

    checkRange(10)



}

fun getSum(a:Int, b:Int):Int {
    var mySum :Int = a + b
    return mySum
}

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun checkRange(x:Int) {

    val y = 9
    if (x in 1..y + 1) {
        println("fits in range")
    }
}