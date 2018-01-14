package 基础.控制流

/*
    For循环可以对任何提供迭代器（iterator）的对象进行遍历，
    这相当于像C#这样的语言中的foreach循环
 */


fun main(args: Array<String>) {
    val items = listOf(1, 2, 3, 4)
    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        print(items[index])
    }

    for ((index, value) in items.withIndex()) {
        println("the element at $index is $value")
    }
}