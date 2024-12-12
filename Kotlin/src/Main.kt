fun main() {
    val option: Int = readln().toInt()
    when (option) {
        1 -> println("Area: ${howBigIsMyPizza()}")
        2 -> println("Volum: ${airVolumeCalculator()}")
        3 -> println("Major d'edat: ${isLegalAge()}")
        4 -> println("És major: ${isGreater()}")
        5 -> println("Existeix un bitllet: ${isValidNote()}")
        else -> println("Invalid Option")
    }
}
fun howBigIsMyPizza(): Double {
    println("How Big is MyPizza\nDiametre:")
    val diameter: Double = readln().toDouble()
    val radius: Double = diameter / 2.0
    val surface: Double = Math.PI * radius * radius
    return surface
}
fun airVolumeCalculator(): Double {
    println("Air Volume Calculator\nAlçada, Amplada, Llargaria:")
    val height: Double = readln().toDouble()
    val width: Double = readln().toDouble()
    val length: Double = readln().toDouble()
    val volume: Double = height * width * length
    return volume
}
fun isLegalAge(): Boolean {
    println("Is Legal Age\nEdat:")
    val age: Int = readln().toInt()
    return age >= 18
}
fun isGreater(): Boolean {
    println("Is Greater\nDos nombres:")
    val num1: Int = readln().toInt()
    val num2: Int = readln().toInt()
    return num1 > num2
}
fun isValidNote(): Boolean {
    println("Is Valid Note\nNombre:")
    val euros = arrayOf(5, 10, 20, 50, 100, 200, 500)
    val num: Int = readln().toInt()
    return euros.contains(num)
}