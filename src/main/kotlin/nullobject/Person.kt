package nullobject

open class Person(
    val name: String,
    val age: Short,
) {
    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }
}