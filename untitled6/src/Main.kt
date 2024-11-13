fun main() {
    println("Введите количество строк:")
    val rows = readln().toInt()
    println("Введите количество столбцов:")
    val cols = readln().toInt()
    val mass = Array(rows) { IntArray(cols) }
    for (i in 0..<rows) {
        for (j in 0..<cols) {
            println("Введите трехзначное число для [$i][$j]:")
            mass[i][j] = readln().toInt()
        }
    }
    val tab = mutableSetOf<Int>()
    for (row in mass) {
        for (num in row) {
            val a = num.toString()
            tab.addAll(a.toCharArray().map { it.toString().toInt() })
        }
    }
    println("Двумерный массив:")
    for (row in mass) {
        for (num in row) {
            print("$num ")
        }
        println()
    }
    println("В массиве использовано ${tab.size} различных цифр")
}