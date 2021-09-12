package konigsberg.kotlin.euler

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Problem21Tests {
    @Test
    fun solves() {
        assertEquals(504, Problem21(285).solution())
        assertEquals(31_626, Problem21(10_000).solution())
    }
}