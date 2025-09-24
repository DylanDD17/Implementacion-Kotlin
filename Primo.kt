//# Primo

fun esPrimo(n: Int): Boolean {
    if (n < 2) return false

    for (i in 2 until n) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}

fun main() {
    println("¿Es primo 7? = ${esPrimo(7)}")  // true
    println("¿Es primo 10? = ${esPrimo(10)}") // false
    println("¿Es primo 2? = ${esPrimo(2)}")  // true
    println("¿Es primo 1? = ${esPrimo(1)}")  // false
}
