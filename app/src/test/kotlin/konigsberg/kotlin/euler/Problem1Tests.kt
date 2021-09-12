package konigsberg.kotlin.euler

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Problem1Tests {
    @Test
    fun solvesBaseCase() {
        val classUnderTest = Problem1(10)
        assertEquals(23, classUnderTest.solution())
    }

    @Test
    fun solvesLargerCase() {
        val classUnderTest = Problem1(1000)
        assertEquals(233168, classUnderTest.solution())
    }
}