package jp.example.design.template_method

abstract class Name(private val firstName: String, private val lastName: String) {
    fun fullName(): String {
        return buildName(firstName, lastName)
    }

    abstract fun buildName(firstName: String, lastName: String): String
}

class JapaneseName(firstName: String, lastName: String): Name(firstName, lastName) {
    override fun buildName(firstName: String, lastName: String): String = "$lastName $firstName"
}

class AmericanName(firstName: String, lastName: String): Name(firstName, lastName) {
override fun buildName(firstName: String, lastName: String): String = "$firstName $lastName"
}
