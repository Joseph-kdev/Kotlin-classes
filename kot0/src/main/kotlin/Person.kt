class Person(val firstName:String ="Peter",val lastName:String = "Parker"){
    var nickName: String? = null
        set(value) {
            field = value
            println("new nickname is $value")
        }
    get() {
        println("returned value is $field")
        return field
    }
    fun printInfo(){
        var nickNameToPrint = nickName ?: "no nickname"
        println("$firstName ($nickNameToPrint) $lastName")
    }
}