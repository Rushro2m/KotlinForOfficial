package 类和对象.扩展

//扩展接收者
class DD {
    fun bar() {
        println("bar")
    }
}

//分发接收者
class CC {
    fun baz() {
        println("baz")
    }

    fun DD.foo() {
        bar()
        baz()
        toString()//调用DD.toString()
        this@CC.toString()//调用CC.toString()
    }

    fun caller(dd: DD) {
        dd.foo()
    }
}
