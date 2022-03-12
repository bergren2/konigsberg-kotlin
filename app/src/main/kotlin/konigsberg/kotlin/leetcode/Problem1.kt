package konigsberg.kotlin.leetcode

class Problem1(private val nums: IntArray, private val target: Int) {
    fun solution(): IntArray {
        for (i in nums.indices)
            for (j in 0 until i)
                if (nums[i] + nums[j] == target)
                    return intArrayOf(i, j).sortedArray()
        throw Exception("We should never reach this with the given problem inputs")
    }
}