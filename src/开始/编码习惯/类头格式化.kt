package 开始.编码习惯

/*
    有少数几个参数的类可以写成一行
 */

open class Human(id: Int, name: String)

/*
    具有较长类头的类应该格式化，
    以使每个主构造函数参数位于带有缩进的单独一行中，
    此外，右括号应该另起一行。
    如果我们使用继承，囊嗯超类构造函数调用或者实现
    接口列表应位于与括号相同的行上：

    对于多个接口，应首先放置超类构造函数调用，
    然后每个接口应位于不同的行中：

    构造函数可以使用常规缩进或连续缩进（双倍的常规缩进）
 */
class People(
        id: Int,
        name: String,
        surname: String
) : Human(id, name),
        Bar {
    //...
}