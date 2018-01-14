package 开始.基础语法

fun maxOf(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

fun maxNum(a: Int, b: Int) = if (a > b) a else b

fun main(args: Array<String>) {

    println("max of 0 and 42 is	${maxOf(0, 42)}")

    println(maxNum(3, 5))
}