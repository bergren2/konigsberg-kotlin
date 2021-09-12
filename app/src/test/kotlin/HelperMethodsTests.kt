import HelperMethods.isPalindrome
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HelperMethodsTests {
    @Test
    fun palindromeFunctionTests() {
        assertEquals(true, isPalindrome(1))
        assertEquals(true, isPalindrome(11))
        assertEquals(false, isPalindrome(12))
        assertEquals(true, isPalindrome(121))
        assertEquals(false, isPalindrome(123))
        assertEquals(true, isPalindrome(1221))
        assertEquals(false, isPalindrome(1224))
    }
}