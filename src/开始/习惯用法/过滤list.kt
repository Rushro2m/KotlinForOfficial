package 开始.习惯用法


val list = listOf(1, 3, 4, 5, 6, 7, 8, 9, 10)

//两种实现方式是等同的
val positives = list.filter { x -> x > 5 }
val positives2 = list.filter { it > 5 }

fun main(args: Array<String>) {
    println(positives.forEach { print(it) })
    println(positives2.forEach { print(it) })
}