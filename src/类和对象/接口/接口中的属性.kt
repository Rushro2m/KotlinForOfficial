package 类和对象.接口

interface Father {
    val prop: Int

    val propertyWithImplementation: String
        get() = "foo"

    fun foo() {
        print(prop)
    }
}

class Son : Father {
    override val prop: Int
        get() = 20
}