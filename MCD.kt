//Euclides (MCD)

fun mcd(a: Int, b: Int): Int {
    if (b == 0) return a
    return mcd(b, a % b)
}

fun main() {
    val a = 12
    val b = 18
    println("El MCD de $a y $b es: ${mcd(a, b)}")
}
