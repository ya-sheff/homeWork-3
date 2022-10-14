fun main() {
    println(agoToText())
}

fun agoToText() {

    var seconds = 10800

    val minutes = seconds / 60
    val hours = seconds / 3600

    val min1 = "минуту"
    val min2 = "минуты"
    val min3 = "минут"

    val h1 = "час"
    val h2 = "часа"
    val h3 = "часов"

    val resMin = if (minutes % 100 == 11) min3
    else if (minutes % 10 == 1) min1
    else if (minutes % 10 == 2 || minutes % 10 == 3 || minutes % 10 == 4) min2
    else min3

    val resHour = if (hours % 10 == 1) h1
    else if (hours % 10 == 2 || hours % 10 == 3 || hours % 10 == 4) h2
    else h3

    when (seconds) {
        in 0..60 -> println("Был(а) только что")
        in 61..3600 -> println("Был(а) $minutes $resMin назад")
        in 3601..86400 -> println("Был(а) $hours $resHour назад")
        in 86401..172800 -> println("Был(а) вчера")
        in 172801..259200 -> println("Был(а) позавчера")
        else -> println("Был(а) давно")
    }

}




