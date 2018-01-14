package 类和对象.类和继承

/*
    类和其中某些成员可以声明为abstract。
    抽象成员在本类中国可以不用实现，
    需要注意的事，我们并不需要open来标注一个抽象类
    或者函数，

    我们可以用一个抽象成员覆盖一个非抽象的开放成员
 */

open class BaseOne {
    open fun f() {}
}

abstract class One : BaseOne() {
    override abstract fun f()
}

