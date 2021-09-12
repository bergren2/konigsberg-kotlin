package konigsberg.kotlin.euler

// "MARY","PATRICIA","LINDA",...
class Problem22(private val names: String) {
    fun solution(): Int {
        val alphabetizedNames = names.split(",").map { name ->
            name.replace("\"", "").uppercase()
        }.sorted()

        var sum = 0
        alphabetizedNames.forEachIndexed { index, name ->
            sum += (index + 1) * valueOfName(name)
        }

        return sum
    }

    private fun valueOfName(name: String): Int {
        var sum = 0

        name.forEach { letter ->
            sum += letter.code - 64
        }

        return sum
    }
}