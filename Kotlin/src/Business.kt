class Business(val name: String, val surname: String, val office: Int) {
    override fun toString(): String {
        return "Empleat: ${this.name} ${this.surname} - Despatx: ${this.office}"
    }
}
fun main(args: Array<String>) {
    println("Nom:")
    val name: String = readln()

    println("Cognom:")
    val surname: String = readln()

    println("Despatx:")
    val office: Int = readln().toInt()

    val card = Business(name, surname, office)
    println(card.toString())
}