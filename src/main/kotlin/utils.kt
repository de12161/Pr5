internal fun doubleInput(msg: String): Double {
    var ret: Double?

    while (true) {
        print(msg)
        ret = readln().toDoubleOrNull()

        if (ret == null) {
            println("Неверный ввод")
            continue
        }

        return ret
    }
}

internal fun midpoint(vararg points: Point): Point {
    var sum = Point(0.0, 0.0)

    for (point in points) {
        sum += point
    }

    return sum / points.size.toDouble()
}

internal fun perpendicular(p1: Point, p2: Point): Line {
    val m = midpoint(p1, p2)

    val a = p2.x - p1.x
    val b = p2.y - p1.y
    val c = -a * m.x - b * m.y

    return Line(a, b, c)
}
