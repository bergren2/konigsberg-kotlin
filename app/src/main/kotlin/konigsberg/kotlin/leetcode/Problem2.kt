package konigsberg.kotlin.leetcode

import konigsberg.kotlin.ListNode

class Problem2(private val num1: IntArray, private val num2: IntArray) {
    private val node1: ListNode?
    private val node2: ListNode?

    init {
        node1 = ListNode(num1[0])
        var current = node1
        for (i in 1 until num1.size) {
            current!!.next = ListNode(num1[i])
            current = current.next
        }

        node2 = ListNode(num2[0])
        current = node2
        for (i in 1 until num2.size) {
            current!!.next = ListNode(num2[i])
            current = current.next
        }
    }

    fun solution(): IntArray {
        // l1 and l2 guaranteed to be non-empty by problem constraints
        return addTwoNumbers(node1, node2)!!.toIntArray()
    }

    private fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        // case if l1 is null but l2 isn't
        // similarly, if l1 isn't null but l2 is
        // or if both are null, return null
        val node: ListNode?
        val sum: Int?

        if (l1 === null && l2 === null) {
            return null
        } else if (l1 === null && l2 !== null) {
            sum = l2.`val`
        } else if (l1 !== null && l2 === null) {
            sum = l1.`val`
        } else {
            // main case if l1 and l2 are both nodes
            sum = l1!!.`val` + l2!!.`val`
        }

        val remainder = sum % 10
        node = ListNode(remainder)

        if (sum >= 10) {
            val addToNode = if (l1 !== null) l1 else l2
            if (addToNode!!.next === null) {
                addToNode!!.next = ListNode(1)
            } else {
                addToNode!!.next!!.`val` += 1 // assume can't carry more than 1
            }
        }

        node.next = addTwoNumbers(l1?.next, l2?.next)

        return node
    }
}