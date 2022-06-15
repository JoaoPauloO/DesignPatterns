package hookmethod

class FiatArgo : Car() {
    override fun accelerate() {
        println("Fiat Argo")
        println("no noise...")
    }
}