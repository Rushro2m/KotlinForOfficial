package 基础.返回和跳转

/*
    Kotlin有函数字面量、局部函数和对象表达式。
    因此Kotlin的函数可以被嵌套。
    标签限制的return允许我们从外层函数返回。
    最重要的一个用途就是从Lambda表达式中返回。

 */

fun foo() {
    val ints = listOf(0, 1, 2, 3, 4, 5, 6)
    ints.forEach {
        if (it == 3)
        //从Lambda函数中返回，结束这个循环函数
            return
        print(it)
    }
}

/*
    需要从Lambda表达式中返回，
    我们必须给它加标签并用以限制return
 */
fun fzz() {
    val ints = listOf(0, 1, 2, 3, 4, 5, 6)
    ints.forEach lit@ {
        if (it == 0) return@lit
        print(it)
    }
}

/*
    通常情况下使用隐式标签更方便。
    该标签与接受改标签Lambda的函数同名。
 */
fun fxx() {
    val ints = listOf(0, 1, 2, 3, 4, 5, 6)
    ints.forEach {
        if (it == 0) return@forEach
        print(it)
    }
}

/*
    或者，我们用一个匿名函数替代Lambda表达式。
    匿名函数内部的return语句从该匿名函数自身返回
    当要返回一个值的时候，解析器会有限选用标签限制的return，
    即return@a 1，意为"从标签@a返回1"，而不是返回一个标签标注的表达式（@a 1）
 */
fun fyy() {
    val ints = listOf(0, 1, 2, 3, 4, 5, 6)
    ints.forEach(fun(value: Int) {
        if (value == 0) return
        print(value)
    })
}

fun main(args: Array<String>) {
//    foo()
//    fzz()
//    fxx()
    fyy()
}