package 类和对象.类和继承

/*
 *  Kotlin 中使用关键字class声明类
 *  类由类名、类头（指定其类型参数、主构造函数等）
 *  和由大括号包围的类体构成，类头和类体都是可选的
 *  如果一个类没有类体，可以省略花括号
 */

/*
 *  构造函数：
 *      Kotlin中一个类可以有一个主构造函数和一个或者多个次构造函数
 *      主构造函数是类头的一部分，它跟在类名后
 *
 *      如果主构造函数没有任何注解或者可见性修饰符，
 *      可以省略constructor这个关键子
 */
class Person constructor(var firstName: String) {
}

/*
 *  主构造函数不能包含任何的代码，初始化可以放在init
 *  关键字作为前缀的初始化块中
 */
class Customer(var name: String) {
    init {
        name = "张三"
    }
}

/*
 *  主构造的参数可以在初始化块中使用，
 *  他们也可以在类体声明的属性初始化器中使用
 */

class People(name:String){
    val nameKey = name.toUpperCase()
}

/*
 *     与普通属性一样，主构造函数中声明的属性
 *     可以是可变（var）的或者不可变（val）的
 *     如果构造函数有注解或者可见性修饰符，这个
 *     constructor关键字是必需的，并且这些修饰符在它前面：
 */

class Cat public constructor(name:String){}

fun main(args: Array<String>) {
    val tom = People("111")
    println(tom.nameKey)
}
