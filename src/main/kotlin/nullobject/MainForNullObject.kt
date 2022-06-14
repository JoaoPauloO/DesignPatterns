package nullobject

const val TWO = 2
const val ZERO = 0

fun main(args: Array<String>) {
    for (i in 1..10) {
        when (val person = getPerson(i)) {
            is PersonNonNull -> {
                println("Person is non null $person")
            }
            is PersonNull -> {
                println("Person is null $person")
            }
        }
    }
}

// HERE
fun getPerson(number: Int): Person {
    return if (number % TWO == ZERO) {
        PersonNonNull(
            name = "João Paulo",
            age = 25
        )
    } else {
        PersonNull()
    }
}