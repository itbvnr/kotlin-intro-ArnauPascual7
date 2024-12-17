/*data class Rectangle(var width: Double, var height: Double) {
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
}*/
class Persona(val name: String) {
    init {
        assert(name == "Pedro") {"El nom no pot ser Pedro"}
    }
}
fun main(args: Array<String>) {
    /*val rect = Rectangle(8.0, 2.0)
    val a = rect
    val b = rect.copy()
    println(rect == b)
    println(a.equals(b))*/

    val persona1 = Persona("Juan")
    val persona2 = Persona("Pedro")
    println(persona2.name)
}