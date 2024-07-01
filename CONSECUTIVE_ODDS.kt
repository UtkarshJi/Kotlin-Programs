//program tocheck for cclass Solution {
    fun threeConsecutiveOdds(arr: IntArray): Boolean {
        for (i in 0 until arr.size - 2) {
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
                return true
            }
        }
        return false
    }
}

fun main() {
    println("Enter the size of the array: ")
    val size = readLine()?.toIntOrNull() ?: return

    val arr = IntArray(size)
    println("Enter the elements of the array: ")
    for (i in 0 until size) {
        arr[i] = readLine()?.toIntOrNull() ?: return
    }

    val solution = Solution()
    if (solution.threeConsecutiveOdds(arr)) {
        println("true")
    } else {
        println("false")
    }
}
