package 基础.返回和跳转

/*
    return ：默认从最直接包围它的函数或者匿名函数返回
    break：终止最直接包围它的循环
    continue：继续下一次最直接包围它的循环
 */


fun main(args: Array<String>) {
    /*
        所有这些表达式可以看作更大表达式的一部分
        表达式的类型是Nothing
     */
    val s = Person("张三").name ?: return

}