package 开始.习惯用法

fun foo(param: Int) {
    if (param == 1) {
        println("one")
    } else if (param == 2) {
        println("two")
    } else {
        println("three")
    }
}

fun main(args: Array<String>) {
    foo(2)
}