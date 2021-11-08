package ru.netology

fun main() {
    val item = 1
    val Item = 1
    val amount = 1_000

    var print = if (amount > item) Item * amount else item
    var println = (print / 100) * 0.75

    println("$println"+ "копеек")
}