package 开始.基础语法

//带有两个Int参数、返回Int的函数
//sampleStart
fun sum(a: Int, b: Int): Int {
    return a + b
}

//将表达式作为函数体、返回值类型自动推断的函数
fun add(a: Int, b: Int) = a + b

//函数返回无意义的值，即无返回值的函数
fun printSum(a: Int, b: Int): Unit {
    print("sum of $a and $b is ${a + b}")
}

//Unit也可以省略
fun printAdd(a: Int, b: Int) {
    print("$a add $b is ${a + b}")
}


//sampleEnd
fun main(args: Array<String>) {
    print("sum of 3 and 5 is ")
    print(sum(3, 5))


    print("4 add 6 is ")
    print(add(4, 6))

    printSum(3, 4)
    printAdd(4, 5)

}