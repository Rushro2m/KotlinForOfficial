package 类和对象.类和继承

/*
    要创建一个类的实例，我们就像普通函数一样调用构造函数
    需要注意的是，Kotlin中没有new关键字
 */

class Animal(name:String ,age:Int)

fun main(args: Array<String>) {
    val dog = Animal("pipi",3)
    val cat = Animal("花花",3)
}