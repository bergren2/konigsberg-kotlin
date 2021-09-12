package konigsberg.kotlin.euler

import HelperMethods.properDivisorsOf

class Problem21(private val limit: Int) {
    fun solution(): Int {
        var sums = mutableMapOf<Int, Int>()
        var amicableNumbers = mutableSetOf<Int>()

        // calculate all the sums
        for (i in 2..limit) {
            sums[i] = properDivisorsOf(i).sum()
        }

        // find the amicable numbers
        // ignore perfect numbers like 6 and 28
        sums.keys.forEach { num1 ->
            val num2 = sums[num1]

            if (num2 != null && sums[num2] == num1 && num1 != num2) {
                amicableNumbers.addAll(setOf(num1, num2))
            }
        }

        return amicableNumbers.sum()
    }
}