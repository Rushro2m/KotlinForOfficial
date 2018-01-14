package 基础.返回和跳转

/*
    在Kotlin中任何表达式都可以用标签（label）来标记。
    标签的格式为标识符后跟@符号，例如：abc@，fooBar@。
    要为一个表达式加标签，我们只要在其前加标签即可。
 */
fun main(args: Array<String>) {

    loop@ for (i in 1..100) {
        //...
    }

    woo@ for (i in 1..4) {
        println("woo" + i)
    }
    /*
        我们可以用标签限制break或者continue：
        标签限制的break跳转到刚好位于该标签指定的循环后面的执行点
     */

    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (i == 50 && j == 50) break@loop
        }
    }

    (1..10)
            .filter { it != 6 }
            .forEach { print(it) }
}