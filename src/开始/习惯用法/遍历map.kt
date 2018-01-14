package 开始.习惯用法

fun print(x: HashMap<String, String>) {
    for ((k, v) in x) {
        println("key -->$k,value-->$v")
    }
}

fun main(args: Array<String>) {
    val items = hashMapOf("a" to "apple", "b" to "banana", "o" to "orange")
    print(items)
}