package strategy

class SubtractCalculator (
    private val value1: Double,
    private val value2: Double
) : ValueCalculator {
    override fun calculate(): Double {
        println("Operator equals -")
        return value1 - value2
    }
}