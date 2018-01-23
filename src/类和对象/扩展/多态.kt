package 类和对象.扩展

open class Z {
}

class Z1 : Z() {
}

open class X {
    open fun Z.foo() {
        println("Z.foo in X")
    }

    open fun Z1.foo() {
        println("Z1.foo in X")
    }

    fun caller(z: Z) {
        z.foo()//调用扩展函数
    }
}

class X1 : X() {
    override fun Z.foo() {
        println("Z.foo in X1")
    }

    override fun Z1.foo() {
        println("Z1.foo in X1")
    }
}

fun main(args: Array<String>) {
    X().caller(Z())//输出Z.foo in X
    X1().caller(Z())//输出Z.foo in X1 --分发接收者虚拟解析
    X().caller(Z1())//输出Z.foo in X -- 扩展接受者静态解析
}