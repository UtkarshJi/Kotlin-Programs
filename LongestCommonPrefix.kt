//program to find
class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        // Find the minimum length string in the array
        val minLen = strs.minOf { it.length }

        // Initialize the longest common prefix
        var lcp = ""

        // Iterate through characters up to the length of the shortest string
        for (i in 0 until minLen) {
            // Take the current character from the first string
            val currentChar = strs[0][i]

            // Check this character against all other strings
            for (str in strs) {
                if (str[i] != currentChar) {
                    return lcp
                }
            }

            // If the current character is common to all strings, add it to the prefix
            lcp += currentChar
        }

        return lcp
    }
}

// Example usage
fun main() {
    val solution = Solution()
    println(solution.longestCommonPrefix(arrayOf("flower", "flow", "flight")))  // Output: "fl"
    println(solution.longestCommonPrefix(arrayOf("dog", "racecar", "car")))    // Output: ""
}
