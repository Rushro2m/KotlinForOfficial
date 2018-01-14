package 基础.控制流

/*
    when 取代了类 C 语言的 switch

   when将它的参数和所有的分支条件顺序比较，
   直到某个分支满足条件。when既可以被当作表达式使用，
   也可以被当作语句使用，则忽略个别分支的值。
   如果其他分支都不满足条件，将会求值else分支。
   如果when作为一个表达式使用，则必须有else分支，除非编译器
   能够检测出所有的可能情况都已经覆盖了。

    如果很多分支需要相同的方式处理，则可以把多个分支条件放在一起，用逗号分隔

    也可以使用任意表达式（而不只是常量）作为分支条件
 */

fun putX(x: Int) {
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }
}

fun putY(x: Int) {
    when (x) {
        0, 1 -> print("x == 0 or x == 1")
        else -> print("otherwise")
    }
}

//fun putA(x:Int) {
//
//    when (x) {
//        parseInt(x) -> {
//            print("s encodes x")
//        }
//        else -> {
//            print("s does not encode")
//        }
//    }
//}

fun PutB(x: Any) {
    when (x) {
        in 1..10 -> print("x is in the range")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }
}

/*
    when也可以用来取代if -else - if 链。
    如果不提供参数，所有的分支条件
    都是简单的布尔表达式，而当一个分支的条件为真时，
    则执行该分支
 */

fun hasPrefix(x: Any) = when (x) {
    is String -> x.startsWith("prefix")
    else -> false
}


