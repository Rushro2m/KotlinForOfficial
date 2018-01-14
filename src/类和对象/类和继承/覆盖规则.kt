package 类和对象.类和继承

/*
    zai
 */

open class A {
    open fun f() {
        print("A")
    }

    fun a() {
        print("a")
    }
}

interface B {
    fun f() {
        print("B")
    }

    fun b() {
        print("b")
    }
}

class C() : A(), B {
    override fun f() {
        super<A>.f()
        super<B>.f()
    }
}

fun main(args: Array<String>) {
    val a = C()
    a.a()
    a.f()
    a.b()
}