package 类和对象.扩展

fun Any?.toString(): String {
    if (this == null) return "null"
    return this.toString()
}

fun main(args: Array<String>) {
    println(true.toString())
}