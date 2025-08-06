package org.example



fun main() {
    val cal = Calculadora()

    println(" Ingrese el primer valor:")
    val numero1 = readln().toDouble()

    println(" Ingrese el segundo valor:")
    val numero2 = readln().toDouble()

    println(" Seleccione la operación a realizar:")
    println("1. Sumar")
    println("2. Restar")
    println("3. Multiplicar")
    println("4. Dividir")

    val opcionValida = readln()

    val resultado = when (opcionValida) {
        "1" -> cal.sumar(numero1, numero2)
        "2" -> cal.restar(numero1, numero2)
        "3" -> cal.multiplicar(numero1, numero2)
        "4" -> cal.dividir(numero1, numero2)
        else -> " Opción inválida"
    }

    println(" Resultado de la operación: $resultado")
}
