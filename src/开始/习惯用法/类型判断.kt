package 开始.习惯用法

/*
    对变量的类型进行判断
    通过过字符 is
    判断其是否为某种类型
 */

fun type(x: Any) {
    when (x) {
        is Number -> println("$x is Number")
        is String -> println("$x is String")
        else -> println("don't know type")
    }
}

fun main(args: Array<String>) {
    type(3)
    type("Hello")
    type('c')
}