package 类和对象.扩展

open class C

class D : C()

fun C.foo() = "c"
fun D.foo() = "d"

fun printFoo(c: C) {
    println(c.foo())
}

class XX {
    fun foo() {
        println("member")
    }
}

fun XX.foo() {
    println("extension")
}

fun XX.foo(i: Int) {
    println("i----->" + i)
}

fun main(args: Array<String>) {
    printFoo(D())
    println(XX().foo())
    println(XX().foo(3))
}