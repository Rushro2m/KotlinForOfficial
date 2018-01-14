package 类和对象.类和继承

/*
    Kotlin力求清晰显式
    Kotlin需要显式标注可覆盖的成员和覆盖后的成员

    Son.v()函数上必须加上override标注，
    如果没写，编译器就会报错，如果函数没有标注open，
    则子类中不允许定义相同签名的函数，不论加不加override，
    在一个final类中，开发成员是禁止的。

    标记为override的成员本身是开放的，也就是说，它可以在
    子类中覆盖，如果你想禁止再次覆盖，使用final关键
 */
open class Father {
    open fun v() {}

    fun nv() {}
}

open class Son() : Father() {
    override fun v() {}
}

open class Daugther() : Father() {
    final override fun v() {}
}

