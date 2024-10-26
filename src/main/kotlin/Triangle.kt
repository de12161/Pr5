internal class Triangle(val p1: Point, val p2: Point, val p3: Point) {
    fun orthocenter() = perpendicular(p1, p2).intersect(perpendicular(p1, p3))
}
