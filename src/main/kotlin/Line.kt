internal class Line(val a: Double, val b: Double, val c: Double) {
    private fun isParallel(l: Line): Boolean {
        if (a == 0.0 && b == 0.0) return false

        return (a == l.a && b == l.b) || (a == -l.a && b == -l.b)
    }
    fun intersect(l: Line): Point? {
        if (isParallel(l)) return null

        val x = (l.b * c - b * l.c) / (l.a * b - a * l.b)
        val y = (l.a * c - a * l.c) / (a * l.b - l.a * b)

        return Point(x, y)
    }
}
