package 基础.基本类型

/*
    字符串用String类型表示，
    字符串是不可变的，
    字符串的元素可以使用索引运算符方位：s[i]
    可以用for循环迭代字符串

    可以通过trimMargin()函数去除前导空格
    默认 | 用作边界符，但也可以选择其他字符并作为参数传入，
    比如：trimMargin（">"）
 */

fun main(args: Array<String>) {

    val k = "Hello world!\n"

    val str = "abcdefghijklmnop"
    for (c in str) {
        print(c)
    }
    val msg = """
        for (c in str) {
        print(c)
    }
 """
    println(msg)

    //
    val text = """
        |Tell me and I forget
        |Teach me and I remember
        |Involve me and I Learn
        |(Benjamin Franklin)
        """.trimMargin()
    print(text)

    val text2 = """
        >Tell me and I forget
        >Teach me and I remember
        >Involve me and I Learn
        >(Benjamin Franklin)
        """.trimMargin(">")
    print(text2)


    //字符串模版
    val s = "abc"
    val p = "$s.length is ${s.length}"
}