package 基础.控制流


/*
    If 是一个表达式，即它会返回一个值，
    因此，就不需要三元运算符（条件？然后：否则）
    因为if就能胜任这个角色

    如果使用if作为表达式而不是语句，
    那么该表达式要与else分支
 */

fun maxInt(a: Int, b: Int): Int {
    //传统用法
    var max = a
    if (a > b) max = a
    return max
}


fun main(args: Array<String>) {

    //作为表达式用法
    val a = 3
    val b = 4
    val max = if (a > b) a else b
    println(max)

    //If的分支可以是代码块，最后的表达式作为该块的值：
    val max2 = if (a > b) {
        print("choose a")
        a
    } else {
        print("choose b")
        b
    }
}