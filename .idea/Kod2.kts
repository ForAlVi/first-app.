package ru.netology

fun main() {
    val amount = 1_000
    val translations = 0
    val translation = 5_500

    var print = if (amount > translations) translation * amount else translations
    var println = (print / 100) * 0.75

    println("$println" + "копеек")
}