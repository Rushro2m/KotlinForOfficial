package 开始.基础语法


fun main(args: Array<String>) {
    val rectangle = Rectangle(5.0, 2.0)
    val triangle = Triangle(3.0, 4.0, 5.0)
    println("Area of rectangle is ${rectangle.calculateArea()},	its perimeter is ${rectangle.perimeter}")
    println("Area of triangle is ${triangle.calculateArea()},its perimeter is ${triangle.perimeter}")
}


abstract class Shape(private val sides: List<Double>) {
    val perimeter: Double get() = sides.sum()
    abstract fun calculateArea(): Double
}

interface RectangleProperties {
    val isSquare: Boolean
}

class Rectangle(
        private var height: Double,
        private var length: Double
) : Shape(listOf(height, length, height, length)),
        RectangleProperties {
    override val isSquare: Boolean
        get() = length == height

    override fun calculateArea(): Double =
            height * length
}

class Triangle(
        private var sideA: Double,
        private var sideB: Double,
        private var sideC: Double
) : Shape(listOf(sideA, sideB, sideC)) {
    override fun calculateArea(): Double {
        val s = perimeter / 2
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }
}