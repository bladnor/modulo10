

import ch.exasoft.easybilling.Modulo10RecursivCheckdigitCalculator.calculateCheckDigit
import org.assertj.core.api.Assertions
import org.junit.Test


class Modulo10RecursivCheckdigitCalculatorTest {


    @Test
    fun `Assert that check digit is 8`() {
        val checkDigit = calculateCheckDigit("70004152")
        Assertions.assertThat(checkDigit).isEqualTo(8)
    }
    @Test
    fun `Assert that check digit is 3`() {
        val checkDigit = calculateCheckDigit("6451234567")
        Assertions.assertThat(checkDigit).isEqualTo(3)
    }
    @Test
    fun test3() {
        val checkDigit = calculateCheckDigit("6541234567")
        Assertions.assertThat(checkDigit).isEqualTo(0)
    }
    @Test
    fun test4() {
        val checkDigit = calculateCheckDigit("5461234567")
        Assertions.assertThat(checkDigit).isEqualTo(2)
    }
}