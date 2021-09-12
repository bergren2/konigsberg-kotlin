package konigsberg.kotlin.euler

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Problem4Tests {
    @Test
    fun palindromeFunctionTests() {
        var classUnderTest = Problem4(1)
        assertEquals(true, classUnderTest.isPalindrome(1))
        assertEquals(true, classUnderTest.isPalindrome(11))
        assertEquals(false, classUnderTest.isPalindrome(12))
        assertEquals(true, classUnderTest.isPalindrome(121))
        assertEquals(false, classUnderTest.isPalindrome(123))
        assertEquals(true, classUnderTest.isPalindrome(1221))
        assertEquals(false, classUnderTest.isPalindrome(1224))
    }

    @Test
    fun solves() {
        assertEquals(9, Problem4(1).solution())
        assertEquals(9009, Problem4(2).solution())
        assertEquals(906_609, Problem4(3).solution())
    }
}