package konigsberg.kotlin

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    fun toIntArray(): IntArray {
        return if (next == null) {
            intArrayOf(`val`)
        } else {
            intArrayOf(`val`) + next!!.toIntArray()
        }
    }
}