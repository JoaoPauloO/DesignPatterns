package hookmethod

fun main (args: Array<String>) {
    var car: Car
    car = getCar(1)
    car.accelerate()
    car = getCar(2)
    car.accelerate()
}

// HERE
fun getCar(option: Int): Car {
    return if (option == 1) {
        Fiat147()
    } else {
        FiatArgo()
    }
}