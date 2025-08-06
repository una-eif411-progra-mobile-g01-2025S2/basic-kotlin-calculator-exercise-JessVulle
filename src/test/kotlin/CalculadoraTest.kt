package org.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CalculadoraTest {

    private val calc = Calculadora()

    @Test
    fun testSuma() {
        val resultado = calc.sumar(4.0, 4.0)
        assertEquals(8.0, resultado)
    }

    @Test
    fun testResta() {
        val resultado = calc.restar(10.0, 5.0)
        assertEquals(5.0, resultado)
    }

    @Test
    fun testMultiplicacion() {
        val resultado = calc.multiplicar(3.0, 5.0)
        assertEquals(15.0, resultado)
    }

    @Test
    fun testDivisionValida() {
        val resultado = calc.dividir(10.0, 2.0)
        assertEquals(5.0, resultado)
    }

    @Test
    fun testDivisionPorCero() {
        val resultado = calc.dividir(1.0, 0.0)
        assertEquals(" No se puede dividir por cero", resultado)
    }
}
