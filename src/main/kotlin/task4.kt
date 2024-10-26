fun main() {
    val t = Triangle(
        Point(doubleInput("Введите x1: "), doubleInput("Введите y1: ")),
        Point(doubleInput("Введите x2: "), doubleInput("Введите y2: ")),
        Point(doubleInput("Введите x3: "), doubleInput("Введите y3: "))
    )

    val l1 = perpendicular(t.p1, t.p2)
    val l2 = perpendicular(t.p1, t.p3)

    val o = l1.intersect(l2)

    if (o == null) {
        println("Точки находятся на одной прямой, окружность построить невозможно")
        return
    }

    val r = o.distance(t.p1)

    println("Центр окружности O = {${o.x}, ${o.y}}\nРадиус окружности R = $r")
}
