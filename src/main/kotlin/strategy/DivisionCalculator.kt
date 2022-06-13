package strategy

class DivisionCalculator(
    private val value1: Double,
    private val value2: Double
) : ValueCalculator {
    companion object {
        private const val ZERO = 0.0
    }
    override fun calculate(): Double {
        if(value1 == ZERO || value2 == ZERO) {
            throw DivideByZeroException("Cannot divide by zero.")
        }
        return value1 / value2
    }
}