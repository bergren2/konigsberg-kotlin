package konigsberg.kotlin.leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class Problem2Tests {
    @Test
    fun solvesExample1() {
        val classUnderTest = Problem2(intArrayOf(2, 4, 3), intArrayOf(5, 6, 4))
        assertArrayEquals(intArrayOf(7, 0, 8), classUnderTest.solution())
    }

    @Test
    fun solvesExample2() {
        val classUnderTest = Problem2(intArrayOf(0), intArrayOf(0))
        assertArrayEquals(intArrayOf(0), classUnderTest.solution())
    }

    @Test
    fun solvesExample3() {
        val classUnderTest = Problem2(intArrayOf(9, 9, 9, 9, 9, 9, 9), intArrayOf(9, 9, 9, 9))
        assertArrayEquals(intArrayOf(8, 9, 9, 9, 0, 0, 0, 1), classUnderTest.solution())
    }
}