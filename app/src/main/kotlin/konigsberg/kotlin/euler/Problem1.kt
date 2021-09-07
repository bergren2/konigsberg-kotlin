package konigsberg.kotlin.euler

class Problem1(private val limit: Int) {
    fun solution(): Int {
        var sum = 0
        for (i in 1 until limit) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i
            }
        }
        return sum
    }
}