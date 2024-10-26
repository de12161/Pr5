import kotlin.math.pow
import kotlin.math.sqrt

internal class Point(val x: Double, val y: Double) {
    operator fun plus(point: Point) = Point(x + point.x, y + point.y)
    operator fun div(n: Double) = Point(x / n, y / n)
    fun distance(p: Point): Double = sqrt((p.x - x).pow(2) + (p.y - y).pow(2))
}
