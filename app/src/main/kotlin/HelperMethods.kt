object HelperMethods {
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

    fun areAmicableNumbers(number1: Int, number2: Int): Boolean {
        if (number1 != number2 &&
            properDivisorsOf(number1).sum() == number2 &&
            properDivisorsOf(number2).sum() == number1
        ) {
            return true
        }

        return false
    }

    fun properDivisorsOf(number: Int): Set<Int> {
        val properDivisors = mutableSetOf(1)
        for (i in 2..(number / 2)) {
            if (number % i == 0) {
                properDivisors.addAll(listOf(i, number / i))
            }
        }

        return properDivisors
    }
}