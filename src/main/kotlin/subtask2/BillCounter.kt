package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val annaBill: Int;
        var commonBill = 0;

        for (i in bill.indices) {
            commonBill += bill[i];
        }

        annaBill = (commonBill - bill[k]) / 2;

        return if (annaBill == b) {
            "Bon Appetit";
        } else {
            (b - annaBill).toString();
        }
    }
}
