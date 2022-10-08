fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    var cnt:Int
    var smallerNumbersCount = IntArray(nums.size)
    for (i in nums.indices) {
        cnt = 0
        for (j in nums.indices) {
            if (nums[i]>nums[j]){
                cnt++
            }
        }
        smallerNumbersCount[i]+=cnt
    }
    return smallerNumbersCount
}