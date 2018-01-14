package 开始.习惯用法

//两种方式是等同的
fun theAnswer() = 42

fun theAnswer2(): Int {
    return 42
}

fun transform2(color: String): Int = when (color) {
    "RED" -> 0
    "GREEN" -> 1
    "BLUE" -> 2
    else -> throw IllegalAccessException("don't have this color")
}

fun main(args: Array<String>) {
    println(theAnswer())
    println(theAnswer2())
    println(transform2("RED"))
}