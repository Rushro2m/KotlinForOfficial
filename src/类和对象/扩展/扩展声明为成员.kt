package 类和对象.扩展

class DD {
    fun bar() {
        println("bar")
    }
}

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
