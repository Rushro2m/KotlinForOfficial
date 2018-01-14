package 开始.习惯用法

import java.nio.file.Files
import java.nio.file.Paths


/*
    一个对象调用多个方法时
    可以使用with
    在with（）｛｝内部
    依次填入需要调用的方法
 */

class Turtle {
    fun penDown() {}
    fun penUp() {}
    fun turn(degree: Double) {
        println(degree)
    }

    fun forward(pixels: Double) {
        println(pixels)
    }
}

fun main(args: Array<String>) {
    val myTurtle = Turtle()
    with(myTurtle) {
        penDown()
        for (i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }

    //java 7 的try with resources
    //读取指定文件中的内容
    val stream = Files.newInputStream(Paths.get("raw\\json.txt"))
    stream.buffered().reader().use { reader -> println(reader.readText()) }

}
