import HelperMethods.areAmicableNumbers
import HelperMethods.isPalindrome
import HelperMethods.properDivisorsOf
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class HelperMethodsTests {
    @Test
    fun palindromeFunctionTests() {
        assertTrue(isPalindrome(1))
        assertTrue(isPalindrome(11))
        assertFalse(isPalindrome(12))
        assertTrue(isPalindrome(121))
        assertFalse(isPalindrome(123))
        assertTrue(isPalindrome(1221))
        assertFalse(isPalindrome(1224))
    }

    @Test
    fun amicableNumberTests() {
        assertTrue(areAmicableNumbers(220, 284))
        assertTrue(areAmicableNumbers(284, 220))
        assertTrue(areAmicableNumbers(1184, 1210))
        assertTrue(areAmicableNumbers(1210, 1184))
        assertFalse(areAmicableNumbers(4, 5))
        assertFalse(areAmicableNumbers(5, 4))
    }

    @Test
    fun properDivisorsTests() {
        assertEquals(setOf(1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110), properDivisorsOf(220))
        assertEquals(setOf(1, 2, 4, 71, 142), properDivisorsOf(284))
    }
}