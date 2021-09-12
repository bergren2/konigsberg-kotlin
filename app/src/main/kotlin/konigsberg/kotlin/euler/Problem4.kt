package konigsberg.kotlin.euler

import java.math.BigInteger

class Problem4(private val numberOfDigits: Int) {
    fun solution(): Int {
        val lowerBound = BigInteger.valueOf(10).pow(numberOfDigits - 1).toInt()
        val upperBound = BigInteger.valueOf(10).pow(numberOfDigits).toInt() - 1

        var largest = 0
        for (i in upperBound downTo lowerBound) {
            for (j in upperBound downTo lowerBound) {
                val number = i * j
                if (isPalindrome(number) && number > largest) {
                    largest = number
                }
            }
        }

        return largest
    }

    fun isPalindrome(number: Int): Boolean {
        val numberString = number.toString()

        val lastIndex = numberString.length - 1
        val limit = lastIndex / 2
        for (i in 0..limit) {
            if (numberString[i] != numberString[lastIndex - i]) {
                return false
            }
        }

        return true
    }
}