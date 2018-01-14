package 基础.基本类型

/*
    数组在Kotlin中用Array类来表示
    定义了set和get函数和size属性，
 */

fun main(args: Array<String>) {
    val ao = arrayOf(1, 2, 3, 4)
    val aon = arrayOfNulls<String>(3)
    val a = Array(5, { i -> (i * i).toString() })

    val x: IntArray = intArrayOf(1, 3, 4)
    x[0] = x[1] + x[2]
    println(x[0])
}


