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