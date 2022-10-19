fun main() {
    typeCardSumma(75001, "Мир")
}

fun typeCardSumma(transferAmount: Int, typeCard: String = "VK pay", summaLastTransfer: Int = 0) {
    println("Укажите тип карты: $typeCard")
    println("Сумма перевода: $transferAmount руб.")
    println("Сумма предыдущих переводов в этом месяце: $summaLastTransfer руб.")

    val comissionMM = 0.6
    val minComissionMM = 20
    val masterMaestro = (((transferAmount * comissionMM) / 100) + transferAmount) + minComissionMM
    val res =
        if (typeCard == "Mastercard" && transferAmount > 75000 || typeCard == "Maestro" && transferAmount > 75000) masterMaestro
        else transferAmount

    val comissionVM = 0.75
    val minComissionVM = 35
    val visaMir = ((transferAmount * comissionVM) / 100)
    val res2 = if (visaMir < minComissionVM) transferAmount + minComissionVM else transferAmount + visaMir

    val res3 = transferAmount

    when (typeCard) {
        "VK pay" -> println("\nСумма перевода по VK pay без комиссии: ${res3.toFloat()} руб.")
        "Maestro" -> println("\nСумма перевода с комиссией: ${res.toFloat()} руб.")
        "Mastercard" -> println("\nСумма перевода с комиссией: ${res.toFloat()} руб.")
        "Visa" -> println("\nСумма перевода с комиссией: ${res2.toFloat()} руб.")
        "Мир" -> println("\nСумма перевода с комиссией: ${res2.toFloat()} руб.")
    }
}