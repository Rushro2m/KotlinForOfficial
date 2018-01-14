package 开始.基础语法

/*
    is 运算符检测一个表达式是否某一类型的一个实例。
    如果一个不可变的局部变量或属性判断出为某类型，
    那么检测后的分支中可以直接弹鼓奏该类型使用，
    无需显式转换
 */

fun getStringLength(obj: Any): Int? {
    return if (obj is String) {
        //obj在该分支自动转换为String
        obj.length
    } else {
        //离开类型检测分支后，obj仍然是Any类型
        null
    }
}

fun main(args: Array<String>) {

    fun printLength(obj: Any) {
        println("'$obj'	string length is ${getStringLength(obj) ?: "...err,not	a string"}")
    }

    printLength("Incomprehensibilities")
    printLength(1000)
    printLength(listOf(Any()))

}