package 类和对象.扩展

val <T> List<T>.lastIndex: Int
    get() = size - 1

class Foo

val Foo.bar
    get() = 3


fun main(args: Array<String>) {
    val ll = listOf(1, 2, 3, 4, 5)
    println(ll.lastIndex)
    println(Foo().bar)
}
