package 基础.控制流

/*
    while 和 do..while和java中并无区别

 */

fun put(x: Int): Int {
    var x1 = x
    while (x1 > 0) {
        x1--
    }
    return x1
}


fun con(x: Int):Int{
    var x1 = x
    do {
        x1--
    } while (x1 > 0)
    return x1
}


fun main(args: Array<String>) {
    println(put(3))
    println(con(4))
}