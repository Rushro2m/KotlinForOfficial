package 开始.基础语法

val PI = 3.1415926
var z = 0

fun incrementX() {
    z += 1
}

fun main(args: Array<String>) {

    //局部变量
    val a: Int = 1//立即赋值
    val b = 2//自动推断其类型
    val c: Int//如果没有初始值类型不能省略
    c = 3//明确赋值
    print("a=$a,b=$b,c=$c")

    //可变变量
    var x = 5
    x += 1
    print("x = $x")

    println("z = ${z};PI = ${PI}")
    incrementX()
    println("incrementX()")
    println("z =${z},PI = ${PI}")
}