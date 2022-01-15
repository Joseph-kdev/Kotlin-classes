fun printFilteredStrings(list:List<String>,predicate: ((String) -> Boolean)?) {
    list.forEach {
        if (predicate?.invoke(it) == true){
            println(it)
        } 
    }
}
val predicate: (String) -> Boolean = {
    it.startsWith(prefix = "j")
}

fun getPrintPredicate(): (String) -> Boolean{
    return {it.startsWith("j")}
}

fun main() {
    val list = listOf("kotlin","java","c++","javascript")
    printFilteredStrings(list, getPrintPredicate())

    printFilteredStrings(list,predicate = null)
}