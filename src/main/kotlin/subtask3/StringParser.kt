package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val arrString = ArrayList<String>()
        var count = 0

        inputString.forEachIndexed { index, element ->
            if (element == '[' || element == '<' || element == '(') {
                val end = when (element) {
                    '<' -> '>'
                    '[' -> ']'
                    '(' -> ')'
                    else -> ' '
                }
                for (i in index + 1 until inputString.length) {
                    if (inputString[i] == element) {
                        count++
                    }
                    if (inputString[i] == end) {
                        if (count == 0) {
                            arrString.add(inputString.substring(index + 1 until i))
                        } else {
                            count--
                        }
                    }
                }
            }
        }

        return arrString.toTypedArray()
    }
}
