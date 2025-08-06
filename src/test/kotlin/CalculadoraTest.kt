package org.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CalculadoraTest {

    private val cal = Calculadora()

    @Test
    fun testSuma() {
        val resultado = cal.sumar(4.0, 4.0)
        assertEquals(8.0, resultado)
    }

    @Test
    fun testResta() {
        val resultado = cal.restar(10.0, 5.0)
        assertEquals(5.0, resultado)
    }

    @Test
    fun testMultiplicacion() {
        val resultado = cal.multiplicar(3.0, 5.0)
        assertEquals(15.0, resultado)
    }

    @Test
    fun testDivisionValida() {
        val resultado = cal.dividir(10.0, 2.0)
        assertEquals(5.0, resultado)
    }

    @Test
    fun testDivisionPorCero() {
        val resultado = cal.dividir(1.0, 0.0)
        assertEquals(" No se puede dividir por cero", resultado)
    }
}
