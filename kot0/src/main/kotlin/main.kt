
fun sayHello(greeting:String, vararg itemsToGreet :String) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}
fun greetPerson(greeting: String = "hello", name:String = "kotlin") = println("$greeting $name")

fun main(args: Array<String>) {
    val person = Person()
    person.printInfo()
}