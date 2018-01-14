package 开始.习惯用法


fun Any?.changeToString(): String {
    return if (this == null) "null"
    else return toString()
}

fun main(args: Array<String>) {
    val name = 'c'
    val age = 22
    println(name.changeToString())
    println(age.changeToString())
}