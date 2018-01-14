package 基础.基本类型

/*
    Kotlin提供了几种内置型来表示数字
    - Double    64
    - Float     32
    - Long      64
    - Int       32
    - Short     16
    - Byte      8
 */

/*
    字面常量
 */
//十进制
val a = 123
val b = 123L

//十六进制
val c = 0x0f

//二进制
val d = 0b00001011

//默认double
val e = 123.5
val f = 123.5e10

//Float用f或者F
val g = 123.5F
val i = 123.5f

//使用下划线使数字常量更加易读
val oneMillion = 1_000_000
val creditCardNumber = 1234_9012_3456L
val socialSecurityNumber = 999_99_9999L
val hexBytes = 0xFF_EC_DE_5E
val bytes = 0b11010010_01101001_10010100_10010010


//不能隐式转换，通过对应方法进进行转换
val x: Int? = 1
val y: Long? = a.toLong()

val l = 1L + 3

fun main(args: Array<String>) {
    val h: Int = 10000
    println(h === h)
    val boxedH: Int? = h
    val anotherBoxedH: Int? = h
    println(boxedH === anotherBoxedH)

    println(boxedH == anotherBoxedH)

    println(1 shr 2)
    println(1.shr(2))
    println(2 shl 1 shr 2)
    println(2.shl(1).shr(2))

    println(f)
}

