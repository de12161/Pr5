import kotlin.math.abs
import kotlin.math.acos
import kotlin.math.pow
import kotlin.math.sqrt

internal class Line(private val a: Double, private val b: Double, private val c: Double) {
    private fun angle(l: Line): Double {
        val cos = abs(a * l.a + b * l.b) / sqrt(a.pow(2) + b.pow(2)) * sqrt(l.a.pow(2) + l.b.pow(2))
        return acos(cos)
    }
    fun intersect(l: Line): Point? {
        val a = angle(l)
        if (a == 0.0 || a.isNaN()) return null

        val x = (l.b * c - b * l.c) / (l.a * b - a * l.b)
        val y = (l.a * c - a * l.c) / (a * l.b - l.a * b)

        return Point(x, y)
    }
}
