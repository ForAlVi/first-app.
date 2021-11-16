package ru.netology

fun main(){
    print("Введите вариант: ")
    val time = readLine()

    var minutes = time / 60

    when(time){
        if (time >= 60)
            println("$minutes минут назад")
        else
            println("minutes = 0")

            if (minutes >= 60)
            println("$watch часов назад")
        else
            println("watch = 0")

        if (watch >= 60)
            println("$day сегодня")
        else
            println("day = 0")

        if (day >= 60)
            println("$yesterday вчера")
        else
            println("yesterday = 0")

        if (yesterday >= 60)
            println("$Tame давно")
        else
            println("Tame = 0")
    }
}
