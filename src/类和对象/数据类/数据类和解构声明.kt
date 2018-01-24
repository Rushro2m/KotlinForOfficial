package 类和对象.数据类

fun main(args: Array<String>) {
    val jane = User("Jane", 35)
    val (name, age) = jane
    println("$name,$age years of age")
}