package 开始.基础语法

/*
    使用 in 运算符来检测
    某个数字是否在指定区间
 */

fun main(args: Array<String>) {

    val x = 10
    val y = 9
    if (x in 1..y + 1) {
        println("fits in range")
    }

    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("lastIndex is ${list.lastIndex}")
        println("list size is out of valid list indices	range too")
    }

    //区间迭代
    if (x in 1..5) {
        print(x)
    }

    //数列迭代
    for (x in 1..10 step 2) {
        print(x)
    }
    for (x in 9 downTo 0 step 3) {
        print(x)
    }

}