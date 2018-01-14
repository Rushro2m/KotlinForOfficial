package 开始.习惯用法


fun main(args: Array<String>) {
    //定义为只读map
    val map = mapOf("a" to "apple", "b" to "banana", "o" to "orange")
    //访问key = a 的value值
    println(map["a"])
    map.keys.forEach { println(it) }
    map.values.forEach { print(it) }
}