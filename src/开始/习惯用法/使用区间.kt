package 开始.习惯用法

/*
    区间的判断
    使用 in 对数据进行判断
    判断其是否在某个区间内
 */

fun main(args: Array<String>) {

    for (i in 1..10) {
        print("$i ")
    }

    println()
    //左闭右开区间
    for (i in 1 until 5) {
        print("$i ")
    }

    println()
    for (x in 1..11 step 2) {
        print("$x ")
    }

    println()
    for (x in 1..10) {
        print("$x ")
    }

    println()
    val x = 3
    if (x in 1..10) {
        print("$x ")
    }
}