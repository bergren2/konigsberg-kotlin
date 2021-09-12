package konigsberg.kotlin.euler

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Problem22Tests {
    @Test
    fun solvesBaseCase() {
        assertEquals(53, Problem22("\"COLIN\"").solution())
        assertEquals(125, Problem22("\"COLIN\",\"BOB\"").solution())
    }

    @Suppress("RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
    @Test
    fun solvesFileCase() {
        val fileContent = this.javaClass.getResource("/p022_names.txt").readText()

        assertEquals(871_198_282, Problem22(fileContent).solution())
    }
}