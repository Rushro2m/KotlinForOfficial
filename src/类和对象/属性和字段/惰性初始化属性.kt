package 类和对象.属性和字段

/*
    一般地，属性声明为非空类型必须在构造函数中初始化。 然而，这经常不方便。例如：属性
可以通过依赖注入来初始化， 或者在单元测试的 setup 方法中初始化。 这种情况下，你不能
在构造函数内提供一个非空初始器。 但你仍然想在类体中引用该属性时避免空检查。
为处理这种情况，你可以用 lateinit 修饰符标记该属性：

 */

public class MyTest{
    lateinit var subject:TestSubject

    @SetUp fun setup(){
        subject = TestSubject()
    }

    @Test fun test(){
        subject.method()
    }
}

annotation class Test

annotation class SetUp

class TestSubject {
    fun method(){

    }
}
