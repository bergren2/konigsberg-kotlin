package konigsberg.kotlin.euler

import HelperMethods.properDivisorsOf

class Problem23(private val limit: Int) {
    private enum class Kind {
        DEFICIENT,
        PERFECT,
        ABUNDANT
    }

    fun solution(): Int {
        val kindsOfNumbers = mutableMapOf<Int, Kind>()

        // calculate kinds
        for (i in 1..limit) {
            val sum = properDivisorsOf(i).sum()
            when {
                sum < i -> kindsOfNumbers[i] = Kind.DEFICIENT
                sum == i -> kindsOfNumbers[i] = Kind.PERFECT
                sum > i -> kindsOfNumbers[i] = Kind.ABUNDANT
            }
        }

        // grab abundant numbers
        val abundantNumbers = kindsOfNumbers.filterValues { v -> v == Kind.ABUNDANT }.keys

        val validNumbers = mutableSetOf<Int>()
        for (i in 1..limit) {
            abundantNumbers.forEach { number ->
                val secondNumber = i - number
                if (abundantNumbers.contains(secondNumber)) {
                    validNumbers.add(i)
                }
            }
        }

        return kindsOfNumbers.keys.sum() - validNumbers.sum()
    }
}