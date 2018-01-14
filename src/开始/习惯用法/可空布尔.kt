package 开始.习惯用法

fun ftt(b: Boolean?) {
    if (b == true) {
        println("true")
    } else {
        print("false or null")
    }
}

fun main(args: Array<String>) {
    ftt(true)
    ftt(null)
}