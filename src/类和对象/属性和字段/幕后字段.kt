package 类和对象.属性和字段

class Xing {
    var counter = 0
        set(value) {
            if (value >= 0) {
                field = value
                print(field.toString())
            }
        }

    private var _table: Map<String, Int>? = null
    public val table: Map<String, Int>
        get() {
            if (_table == null) {
                _table = HashMap()
            }
            return _table ?: throw AssertionError("Set ot null by another thread")
        }
}

fun main(args: Array<String>) {
    val xing = Xing()
    xing.counter = 3

    xing.table
}