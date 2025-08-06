package org.example

class Calculadora {
    fun sumar(a: Double, b: Double): Double = a + b
    fun restar(a: Double, b: Double): Double = a - b
    fun multiplicar(a: Double, b: Double): Double = a * b
    fun dividir(a: Double, b: Double): Any {
        return if (b == 0.0) " No se puede dividir por cero" else a / b
    }
}