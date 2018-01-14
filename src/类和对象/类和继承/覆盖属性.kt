package 类和对象.类和继承

/*
    属性覆盖与方法覆盖类似，在超类中声明后在派生类中重新声明的属性
    必须以override开头，并且他们必须具有兼容的类型，
    每个声明的属性可以由具有初始化器的属性或者
    具有getter方法的属性覆盖。
 */

open class Foo {
    open val x: Int
        get() {
            return 11
        }
}

class Bar1 : Foo() {
    override val x: Int
        get() = super.x
}

/*
     也可以用一个var属性覆盖一个val属性，
     但反之不行，这是允许的，因为一个val属性本质
     上声明了一个getter方法，而将其覆盖为var只是在
     子类中额外声明一个setter方法

     可以在主构造函数中使用override关键字作为
     属性声明的一部分
 */

open interface Zoo {
    val count: Int
}

class Bar(override val count: Int) : Zoo

class Bar2 : Zoo {
    override val count: Int = 0
}

fun main(args: Array<String>) {
    val cat = Bar1()
    println(cat.x.toString())
}