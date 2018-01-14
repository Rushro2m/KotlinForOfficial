package 开始.基础语法

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(x: String, y: String) {
    val a = parseInt(x)
    val b = parseInt(y)

    if (a != null && b != null) {
        println(a * b)
    }else{
        println("either '$x' or '$y' is not a number")
    }
}

fun main(args: Array<String>) {
    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("a", "b")
}