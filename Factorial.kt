// Factorial

fun factorial(n: Int): Long {
    require(n >= 0) { "El número debe ser no negativo" }
    var resultado = 1L
    for (i in 1..n) {
        resultado *= i
    }
    return resultado
}

fun main() {
    println("Factorial de 5 = ${factorial(5)}")  // 120
    println("Factorial de 8 = ${factorial(8)}")  // 1
}
