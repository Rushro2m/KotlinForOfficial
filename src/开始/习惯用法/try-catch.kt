package 开始.习惯用法

fun test(age: Int): Any? {
    val result = try {
        age < 10
    } catch (e: ArithmeticException) {
        throw IllegalAccessException(e.toString())
    }
    return result
}

fun main(args: Array<String>) {
    println(test(10))
}

