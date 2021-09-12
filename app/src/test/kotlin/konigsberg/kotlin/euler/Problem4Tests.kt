package konigsberg.kotlin.euler

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Problem4Tests {
    @Test
    fun solves() {
        assertEquals(9, Problem4(1).solution())
        assertEquals(9009, Problem4(2).solution())
        assertEquals(906_609, Problem4(3).solution())
    }
}