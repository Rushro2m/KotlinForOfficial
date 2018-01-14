package 基础.基本类型

/*
    布尔用Boolean类型表示，它有两个值：true和false
    若需要可空类型引用会被装箱
    内置的布尔运算符有：
    || 短路逻辑或
    && 短路逻辑与
    ！ 逻辑非
 */

fun main(args: Array<String>) {
    val x = true
    val y = false
    println(x || y)
    println(x && y)
    println(!x)
}