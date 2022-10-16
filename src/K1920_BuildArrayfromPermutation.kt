fun buildArray(nums: IntArray): IntArray {
    var numsNew:IntArray = intArrayOf()
    for (i in 0 until nums.size) {
        numsNew[i] = nums[nums[i]]
    }
    return numsNew
}