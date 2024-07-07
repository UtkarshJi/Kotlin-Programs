class Solution {
    fun numWaterBottles(numbottles: Int, numexchange: Int): Int {
        var totaldrunk = numbottles
        var emptybottles = numbottles

        while (emptybottles >= numexchange) {
            val newbottles = emptybottles / numexchange
            totaldrunk += newbottles
            emptybottles = emptybottles % numexchange + newbottles
        }
        return totaldrunk
    }
}

fun main() {
    val obj = Solution()
}
