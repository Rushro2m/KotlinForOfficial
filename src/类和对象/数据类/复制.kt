package 类和对象.数据类

fun main(args: Array<String>) {
    val jack = User(name = "Jack", age = 3)
    val olderJack = jack.copy(name = "oldJack", age = 1)
}