interface PersonInfoProvider {
    val providerInfo : String

    fun printInfo(person: Person){
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider{
    fun getSessionId() : String
}
open class BasicInfoProvider :PersonInfoProvider, SessionInfoProvider{

    override val providerInfo: String
        get() = "Basic Info Provider"

    protected open val sessionIdPrefix = "Session"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }

    override fun getSessionId(): String {
        return "Session"
    }
}


fun main() {
    val provider = object : PersonInfoProvider{
        override val providerInfo: String
            get() = "new info provider"

        fun getSessionId() = "id"
    }

    provider.printInfo(Person())
    provider.getSessionId()

    checkTypes(provider)
}

fun checkTypes(infoProvider: PersonInfoProvider) {
    if(infoProvider !is SessionInfoProvider){
        println("not a session info provider")
    } else {
        println("is a session info provider")
        infoProvider.getSessionId()
    }
}