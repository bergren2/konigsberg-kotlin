package konigsberg.kotlin.euler

class Problem2(private val limit: Int) {
    fun solution(): Int {
        var term1 = 1
        var term2 = 2

        var sum = 0

        while (term2 < limit) {
            if (term2 % 2 == 0) {
                sum += term2
            }

            val temp = term1 + term2

            term1 = term2
            term2 = temp
        }

        return sum
    }
}