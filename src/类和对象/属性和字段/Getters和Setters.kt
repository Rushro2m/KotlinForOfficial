package 类和对象.属性和字段

class Ming {
    var allByDefault: Int? = 1
    var initialized = 1

    val simple: Int?
        get() = 1
    val inferredType = 1


    val size = 1
    val isEmpty: Boolean
        get() = this.size == 0

    var stringPrint: String
        get() = this.toString()
        set(value) {
            print(value)
        }

    var setterVisibility:String = "abc"
        private set


}

fun main(args: Array<String>) {
    val ming = Ming()
    ming.stringPrint = "小明"
}