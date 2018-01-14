package 基础.基本类型

/*
    字符用Char类型表示，它们不能直接当作数字
    字符字面值用单引号括起来：'1'
    特殊字符可以用反斜杠定义
    转义序列： \t \b \r \ \" \\  \$
 */
//可以显式吧字符转换为Int数字
fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9')
        throw IllegalAccessException("Out of range")
    return c.toInt() - '0'.toInt()
}

fun main(args: Array<String>) {

    val a = 'c'
    val b = '1'
    println(a.isLetter())
    println(b.isDigit())

    decimalDigitValue('a')
}