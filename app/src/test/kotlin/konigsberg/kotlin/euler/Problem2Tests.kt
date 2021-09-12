package konigsberg.kotlin.euler

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Problem2Tests {
    @Test
    fun solvesBaseCase() {
        val classUnderTest = Problem2(90)
        assertEquals(44, classUnderTest.solution())
    }

    @Test
    fun solvesLargerCase() {
        val classUnderTest = Problem2(4_000_000)
        assertEquals(4_613_732, classUnderTest.solution())
    }
}