fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
    val myList = mutableListOf<Int>()
    for (i in 0 until nums.size) {
        myList.add(index[i],nums[i])
    }
    return myList.toIntArray()
}