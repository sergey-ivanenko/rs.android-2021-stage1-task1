package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        return makeHappyArray(sadArray);
    }

    private fun makeHappyArray(sadArray: IntArray): IntArray {
        val happyArray:ArrayList<Int> = ArrayList();
        var countSadElementsInArray = 0;

        for (i in sadArray.indices) {
            if(i == 0 || i == sadArray.size - 1) {
                happyArray.add(sadArray[i]);
                continue;
            }
            if (sadArray[i - 1] + sadArray[i + 1] >= sadArray[i]) {
                happyArray.add(sadArray[i]);
                continue;
            }
            countSadElementsInArray++;
        }

        return if (countSadElementsInArray == 0) {
            happyArray.toIntArray();
        } else {
            makeHappyArray(happyArray.toIntArray());
        }
    }
}
