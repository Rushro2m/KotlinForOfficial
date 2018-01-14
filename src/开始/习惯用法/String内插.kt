package 开始.习惯用法

/*
    String内插，
    就是将变量插入到String字符串中,
    通过$符号将变量插入
 */

fun person(name: String, age: Int) {
    println("name-->$name,age-->$age")
}

fun main(args: Array<String>) {
    person("张三", 24)
}
