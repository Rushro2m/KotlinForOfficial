package 开始.基础语法

fun main(args: Array<String>) {
    val items = listOf("apple", "banana", "kiwi")

    //遍历集合
    for (item in items) {
        println(item)
    }

    //使用 in 运算符判断集合内是否包含某实例
    when {
        "orange" in items -> println("orange")
        "apple" in items -> println("apple is fine too")
    }

    //使用Lambda表达式来过滤（filter）和映射（map）集合：
    val fruits = listOf("banana", "avocado", "apple", "kiwi")
    fruits
            //过滤
            .filter { it.startsWith("a") }
            //排序
            .sortedBy { it }
            //字母转换为大写
            .map { it.toUpperCase() }
            //打印
            .forEach { println(it) }

}