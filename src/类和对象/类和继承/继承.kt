package 类和对象.类和继承

import com.sun.glass.ui.View
import java.awt.Graphics
import java.awt.Shape
import javax.naming.Context
import javax.swing.text.AttributeSet
import javax.swing.text.Position

/*
    Kotlin中所有类都有一个共同的超类Any，
    这对于没有任何超类型声明的类是默认超类
 */
class Example//从Any隐式继承

class Example1:Any()

/*
    Any不是java.lang.Object：尤其是：
    它除了equals()，hashCode()，toString()
    外没有任何的成员

    要声明一个显示的超类型，我们把类型放到类头的冒号之后
 */

open class Base(p: Int)

class Derived(p: Int) : Base(p)

/*
    如果该类有一个主构造函数：其基类可以用主构造函数就地初始化

    如果没有主构造函数，那么每个次构造函数必须使用super关键字初始化其
    基层类，或者委托给另一个构造函数做到这一点，
    在这种情况下，不同的次构造函数可以调用基类的不同构造函数
 */

//class MyView: View {
//
//    constructor(ctx:Context):super(ctx)
//
//    constructor(ctx:Context,attr:AttributeSet):super(ctx,attr)
//}

/*
    类上的open标注与java中的final相反，它允许其他类从这个类继承。

 */