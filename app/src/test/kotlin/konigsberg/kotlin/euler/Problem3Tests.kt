package konigsberg.kotlin.euler

import org.junit.Test
import kotlin.test.assertEquals

class Problem3Tests {
    @Test
    fun solves() {
        assertEquals(2, Problem3(4).solution())
        assertEquals(5, Problem3(5).solution())
        assertEquals(3, Problem3(6).solution())
        assertEquals(5, Problem3(20).solution())
        assertEquals(29, Problem3(13195).solution())
        assertEquals(6857, Problem3(600851475143).solution())
    }
}