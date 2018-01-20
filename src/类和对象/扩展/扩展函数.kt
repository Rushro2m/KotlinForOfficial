package 类和对象.扩展

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

fun main(args: Array<String>) {
    val l = mutableListOf(1, 2, 3)
    l.swap(0, 1)
    print(l)
}