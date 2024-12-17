data class Rectangle(var width: Double, var height: Double) {
    val area get() = width * height

    override fun toString(): String{
        return super.toString() + "Area: " + area
    }

    override fun equals(other: Any?): Boolean {
        if (other is Rectangle) {
            return width == other.width
        }
        else return false
    }
}
class HowBigIsMyPicsa(val diameter: Double) {
    val radius: Double get() = diameter / 2
    val surface: Double get() = radius * radius * Math.PI

    fun picsaPrinter(surface: Double): String {
        return "Area: $surface"
    }
}
class BusinessCardPrinter(val name: String, val surname: String, val office: Int) {
    fun cardPrinter(name: String, surname: String, office: String): String {
        return "Empleat: $name $surname - Despatx: $office"
    }
}
fun main(args: Array<String>) {
    /*val rect = Rectangle(8.0, 2.0)
    val a = rect
    val b = rect.copy()
    println(rect == b)
    println(a.equals(b))*/
    /* Exercici 0 - HowBigIsMyPicsa */
    var diameter: Double = readln().toDouble()
    var picsa = HowBigIsMyPicsa(diameter)
    println(picsa.picsaPrinter(picsa.surface))
    /* Exercici 1 - BusinessCardPrinter */
    var name: String = readln()
    var surname: String = readln()
    var office: Int = readln().toInt()
    var card = BusinessCardPrinter(name, surname, office)
    println(card.cardPrinter(card.name, card.surname, card.office.toString()))
}