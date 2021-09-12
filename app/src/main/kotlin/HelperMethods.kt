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
}