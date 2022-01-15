fun main() {
    val list = listOf("Kotlin","Java","C++","Javascript",null,null)
    val msg = list
        .filterNotNull()
        .associate { it to it.length }

    val language = list.filterNotNull().findLast{it.startsWith(prefix = "foo")}.orEmpty()
    println(language)
    }
