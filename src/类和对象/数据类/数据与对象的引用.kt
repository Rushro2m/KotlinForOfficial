package 类和对象.数据类

fun main(args: Array<String>) {

    val u1 = User("Rushro2m",25)
    val u2 = User("Rushro2m",25)
    val u3 = User("Rushro2m",24)

    println(u1 == u2)  //输出true,  对象数据相同
    println(u1 == u3)  //输出false, 对象数据不同

    // u1,u2,u3都是不同对象,即对象引用(地址)不同
    println(u1 === u2) //输出false, 对象引用(地址)不同
    println(u1 === u3) //输出false, 对象引用(地址)不同
}