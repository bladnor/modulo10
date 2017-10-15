import Modulo10RecursivCheckdigitCalculator.calculateCheckdigit
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test


class Modulo10RecursivCheckdigitCalculatorTest {


    @Test
    fun `Assert that check digit is 8`() {
        val checkDigit = calculateCheckdigit("70004152")
        Assertions.assertThat(checkDigit).isEqualTo(8)
    }

    @Test
    fun `Assert that check digit is 3`() {
        val checkDigit = calculateCheckdigit("6451234567")
        Assertions.assertThat(checkDigit).isEqualTo(3)
    }

    @Test
    fun `Assert that check digit is 0`() {
        val checkDigit = calculateCheckdigit("6541234567")
        Assertions.assertThat(checkDigit).isEqualTo(0)
    }

    @Test
    fun `Assert that check digit is 2`() {
        val checkDigit = calculateCheckdigit("5461234567")
        Assertions.assertThat(checkDigit).isEqualTo(2)
    }
}