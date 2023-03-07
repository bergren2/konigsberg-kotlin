package konigsberg.kotlin.euler

import org.junit.Test
import kotlin.test.assertEquals

class Problem23Tests {
    @Test
    fun solves() {
        assertEquals(1, Problem23(1).solution())
        assertEquals(276, Problem23(23).solution())
        assertEquals(276, Problem23(24).solution())
        assertEquals(4179871, Problem23(28123).solution())
    }
}