package 开始.编码习惯

fun main(args: Array<String>) {
    val list = listOf(9, 10, 11, 12, 13)
    val a = list
            .filter { it > 10 }
            .map { it -> it * 2 }
    println(a.forEach { print("$it--") })
}