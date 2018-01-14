package 开始.习惯用法

//函数的默认参数

fun foo(x: Int = 0, y: String = "") {
    println("$x is $y")
}

fun fzz(x: Int, y: String) {
    println("$x is $y")
}

fun main(args: Array<String>) {
    foo(3, "three")
    fzz(4, "four")
}