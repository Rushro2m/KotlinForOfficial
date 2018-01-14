package 类和对象.可见性修饰符

open class Outer {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4

    protected open class Nested {
        public val e: Int = 5
    }
}

class Subclass : Outer() {
    //b被open修饰，可以直接访问
    override val b: Int
        get() = 5

    val xx = Outer()
    //修饰符是protected或者private
    private var yy = Outer.Nested()

    fun foo() {
        //c，d，e可见，但是需要通过对应对象
        println(xx.c)
        println(xx.d)
        print(yy.e)
    }
}

class Unrelated(o: Outer) {
    val kk = o
    fun stringPrint() {
        //a，b不可见，c，，d可见
        print(kk.c)
        print(kk.d)
    }
}