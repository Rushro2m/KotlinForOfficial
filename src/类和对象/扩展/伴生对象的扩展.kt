package 类和对象.扩展

class MyClass {
    companion object {}
}

fun MyClass.Companion.foo() {
    print("11111111111")
}

fun main(args: Array<String>) {
    MyClass.foo()
}