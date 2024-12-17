class CirPizza(val diameter: Double) {
    val radius: Double get() = diameter / 2
    val surface: Double get() = radius * radius * Math.PI

    override fun toString(): String {
        return "Area: ${surface}"
    }
    override fun equals(other: Any?): Boolean {
        if (other is RecPizza) {
            return surface == other.surface
        } else return false
    }
}
class RecPizza(val Height: Double, val Width: Double) {
    val surface: Double get() = Height * Width

    override fun toString(): String {
        return "Area: ${surface}"
    }
}
fun main(args: Array<String>) {
    println("Diametre de la Pizza rodona:")
    val diameter: Double = readln().toDouble()
    val cirPizza = CirPizza(diameter)

    println("Alçada de la Pizza rectangular:")
    val height: Double = readln().toDouble()
    println("Amplada de la Pizza rectangular:")
    val width: Double = readln().toDouble()
    val recPizza = RecPizza(width, height)
}