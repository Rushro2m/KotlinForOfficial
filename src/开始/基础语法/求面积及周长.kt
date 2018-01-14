package 开始.基础语法

abstract class Shape2(private val sizes: List<Double>) {
    val girth: Double get() = sizes.sum()
    abstract fun area(): Double
}

//是否为正方形
interface Square {
    val isSquare: Boolean
}

//是否为正三角形
interface Equilateral {
    val isEquilateral: Boolean
}

class Four(
        private val height: Double,
        private val length: Double)
    : Shape2(listOf(height, length, height, length)), Square {
    override val isSquare: Boolean
        get() = height == length

    override fun area(): Double {
        return height * length
    }
}

class Three(
        private val s1: Double,
        private val s2: Double,
        private val s3: Double)
    : Shape2(listOf(s1, s2, s3)), Equilateral {
    override fun area(): Double {
        val s = girth / 2
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3))
    }

    override val isEquilateral: Boolean
        get() = s1 == s2 && s2 == s3
}

fun main(args: Array<String>) {

    val a = Four(3.0, 4.0)
    val b = Three(3.0, 4.0, 5.0)

    println("矩形的周长为：${a.girth},面积为：${a.area()},此矩形是否为正方形：${a.isSquare}")
    println("三角形的周长为：${b.girth},面积为：${b.area()},此三角形是否为正三角形：${b.isEquilateral}")
}