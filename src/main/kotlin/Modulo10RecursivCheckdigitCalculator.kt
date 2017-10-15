

object Modulo10RecursivCheckdigitCalculator {

    /**
     * Calculates the checksum according to Luhn Algorithm but recursiv
     *
     * Also know as the modulo 10 rekursiv algorithm.
     * It is used by swiss postfinance for cacluating checksums for example in ESR
     *
     *
     * @see https://www.postfinance.ch/content/dam/pfch/doc/cust/download/efin_recdescr_man_de.pdf
     * @see https://en.wikipedia.org/wiki/Luhn_algorithm
     * @see http://www.hosang.ch/modulo10.aspx
     */
    fun calculateCheckdigit(checkNumber: String): Int {
        val table = arrayOf(0, 9, 4, 6, 8, 2, 7, 1, 3, 5)
        var carry = 0
        checkNumber.forEach { carry = table[(it + carry - '0') % 10] }
        return (10 - carry) % 10
    }

}