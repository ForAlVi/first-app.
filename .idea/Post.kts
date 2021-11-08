package ru.netology

fun main(){
    val itemPrice = 100
    val itemCont = 10
    val discount = 100
    val discountStart = 1_000
    val discountstart = 10_000

    val totalPrice = itemPrice * itemCont
    val result = if (totalPrice > discountStart) totalPrice - discount else totalPrice
    var melomane = (discountstart / 100) * 1
    var percentage = (discountstart / 100) * 5 + melomane
    println("Total Price: $result")
    println("Percentage: $percentage")
}