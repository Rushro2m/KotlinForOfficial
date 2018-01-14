package 开始.习惯用法

import java.io.File

/*
    Kotlin中对一些判断条件进行了缩写处理
    if not null : ?
    if not null and else : ?  :
    if null执行一个语句： ？：
    if not null 执行代码

 */

fun main(args: Array<String>) {
    val files = File("Test").listFiles()
    println(files?.size)

    println(files?.size ?: "没有此文件")


//    val values = mapOf("a" to "apple", "e" to "email")
//    val email = values["email"] ?: throw IllegalAccessException("Email is Missing")
//    println(email)

    val value = "163.com"
    value?.let {
        println("已经查找到Email,地址为:" + it)
    }


}