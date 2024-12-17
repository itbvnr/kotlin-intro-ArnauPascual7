fun main() {
    val option: Int = readln().toInt()
    when (option) {
        1 -> howBigIsMyPizza()
        2 -> airVolumeCalculator()
        3 -> isLegalAge()
        4 -> isGreater()
        5 -> isValidNote()
        else -> println("Invalid Option")
    }
}
fun howBigIsMyPizza() {
    println("How Big is MyPizza\nDiametre:")
    val diameter: Double = readln().toDouble()
    val radius: Double = diameter / 2.0
    val surface: Double = Math.PI * radius * radius
    println("Area: ${surface}")
}
fun airVolumeCalculator() {
    println("Air Volume Calculator\nAlçada, Amplada, Llargaria:")
    val height: Double = readln().toDouble()
    val width: Double = readln().toDouble()
    val length: Double = readln().toDouble()
    val volume: Double = height * width * length
    println("Volum: ${volume}")
}
fun isLegalAge() {
    println("Is Legal Age\nEdat:")
    val age: Int = readln().toInt()
    if (age >= 18) println("Major d'edat")
    else println("Menor d'edat")
}
fun isGreater() {
    println("Is Greater\nDos nombres:")
    val num1: Int = readln().toInt()
    val num2: Int = readln().toInt()
    if (num1 > num2) println("${num1} és major")
    else if (num1 < num2) println("${num2} és major")
    else println("Són iguals ${num1} = ${num2}")
}
fun isValidNote() {
    println("Is Valid Note\nNombre:")
    val euros = arrayOf(5, 10, 20, 50, 100, 200, 500)
    val num: Int = readln().toInt()
    if (euros.contains(num)) println("És un bitllet")
    else println("NO és un bitllet")
}