package strategy

const val SUM = "+"
const val SUBTRACT = "-"
const val DIVISION = "/"
val operators = listOf(SUM, SUBTRACT, DIVISION)

fun main(args: Array<String>) {
    println("Enter with two numeric values")
    println("First value: ")
    val value1 = readln()
    println("Last value: ")
    val value2 = readln()
    println("Which operation do you want?")
    println("Which operation do you want? + to SUM")
    println("Which operation do you want? - to SUBTRACT")
    println("Which operation do you want? / or DIVISION")
    val operator = readln()
    try {
        if (operators.contains(operator)) {
            if (operator == SUM) {
                val result = calculate(
                    SumCalculator(
                        value1 = value1.toDouble(),
                        value2 = value2.toDouble()
                    )
                )
                printResult(result)
            }
            if (operator == SUBTRACT) {
                val result = calculate(
                    SubtractCalculator(
                        value1 = value1.toDouble(),
                        value2 = value2.toDouble()
                    )
                )
                printResult(result)
            }
            if (operator == DIVISION) {
                val result = calculate(
                    DivisionCalculator(
                        value1 = value1.toDouble(),
                        value2 = value2.toDouble()
                    )
                )
                printResult(result)
            }
        } else {
            println("No operations. Choose a valid operation.")
        }
    } catch (ex: DivideByZeroException) {
        println(ex.message)
    } catch (ex: Exception) {
        println("Error: Verify yours input values.")
    }
}

// HERE
fun calculate(calculator: ValueCalculator): Double {
    return calculator.calculate()
}

fun printResult(result: Double) {
    println("Result is: $result")
}