package ru.netology

fun main() {

    println("Введите сумму перевода: ")
    var amount = readln().toDouble()    // Ввод суммы перевода
    var min = 35                        // Минимальная комиссия
    var comission = amount * 0.0075     // Расчет комиссии

    if (comission < min) {
        comission = min.toDouble()
    }

    println("Комиссия за перевод: $comission")
}