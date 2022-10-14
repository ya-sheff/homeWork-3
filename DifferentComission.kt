var typeCard = "Maestro"   // Введит тип карты: Maestro, Mastercard, Visa, Мир, VK Pay
var summa = 75000        // Введите сумму

fun main() {
    when (typeCard) {
        "Maestro" -> println(maestroMastercard())
        "Mastercard" -> println(maestroMastercard())
        "Visa" -> println(visaMir())
        "Мир" -> println(visaMir())
        "VK Pay" -> println(vkPay())
    }
}

fun maestroMastercard() {
    val comissionMM = 0.6
    val minComissionMM = 20
    val masterMaestro = (((summa * comissionMM) / 100) + summa) + minComissionMM
    val res = if (typeCard == "Mastercard" && summa > 75000 || typeCard == "Maestro" && summa > 75000) masterMaestro
    else summa

    when (typeCard) {
        "Maestro" -> println("Сумма перевода с комиссией: ${res.toFloat()} руб.")
        "Mastercard" -> println("Сумма перевода с комиссией: ${res.toFloat()} руб.")
    }
}

fun visaMir() {
    val comissionVM = 0.75
    val minComissionVM = 35
    val visaMir = ((summa * comissionVM) / 100)
    val res2 = if (visaMir < minComissionVM) summa + minComissionVM else summa + visaMir

    when (typeCard) {
        "Visa" -> println("Сумма перевода с комиссией: ${res2.toFloat()} руб.")
        "Мир" -> println("Сумма перевода с комиссией: ${res2.toFloat()} руб.")
    }
}

fun vkPay() {
    val res3 = summa
    when (typeCard) {
        "VK Pay" -> println("Сумма перевода по VK Pay без комиссии: ${res3.toFloat()} руб.")
    }
}









