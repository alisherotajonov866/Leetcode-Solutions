import java.util.*
class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        var max = 0
        for (candy in candies) {
            if (candy>=max) max = candy
        }
        for (i in candies.indices) {
            candies[i]+=extraCandies
        }
        var myList = LinkedList<Boolean>()
        for (candy in candies) {
            if (candy>=max){
                myList.add(true)
            }else myList.add(false)
        }
        return myList
    }
}