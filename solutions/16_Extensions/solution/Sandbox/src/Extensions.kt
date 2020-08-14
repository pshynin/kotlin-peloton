private val String.numVowels
    get() = count { "aeiou".contains(it) }

fun String.addEnthusiasm(amount: Int = 1): String = this + "!".repeat(amount)

fun <T> T.easyPrint(): T {
    println(this)
    return this
}

infix fun String?.printWithDefault(default: String) {
    print(this ?: default)
}

fun main() {
    "Madrigal has left the building".addEnthusiasm().easyPrint()
    42.easyPrint()
    "How many vowels?".numVowels.easyPrint()

    val nullableString: String? = null
    nullableString printWithDefault "Default string"
}