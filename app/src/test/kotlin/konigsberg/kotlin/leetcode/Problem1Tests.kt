package konigsberg.kotlin.leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class Problem1Tests {
    @Test
    fun solvesExample1() {
        val classUnderTest = Problem1(intArrayOf(2, 7, 11, 15), 9)
        assertArrayEquals(intArrayOf(0, 1), classUnderTest.solution())
    }

    @Test
    fun solvesExample2() {
        val classUnderTest = Problem1(intArrayOf(3, 2, 4), 6)
        assertArrayEquals(intArrayOf(1, 2), classUnderTest.solution())
    }

    @Test
    fun solvesExample3() {
        val classUnderTest = Problem1(intArrayOf(3, 3), 6)
        assertArrayEquals(intArrayOf(0, 1), classUnderTest.solution())
    }
}