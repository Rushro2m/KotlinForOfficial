package 开始.习惯用法

fun transform(color: String): Int {
    return when (color) {
        "RED" -> 0
        "GREEN" -> 2
        "BLUE" -> 3
        else -> throw  IllegalAccessException("no have this color")
    }
}

fun main(args: Array<String>) {
    println(transform("GREEN"))
}