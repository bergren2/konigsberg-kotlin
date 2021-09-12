package konigsberg.kotlin.euler

class Problem3(private val number: Long) {
    fun solution(): Long {
        // divide by small primes to get large composites
        var largestCompositeFactor = number

        var factor = 2L
        while (largestCompositeFactor != factor) {

            if (largestCompositeFactor % factor == 0L) {
                largestCompositeFactor /= factor
                factor = 2
            } else {
                factor += 1
            }
        }

        return largestCompositeFactor
    }
}