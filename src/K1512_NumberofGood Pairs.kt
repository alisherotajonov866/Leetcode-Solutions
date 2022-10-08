fun numIdenticalPairs(nums: IntArray): Int {
    var cnt=0
    for (i in 0..nums.size-2) {
        for (j in i+1 until nums.size) {
            if (nums[i]==nums[j]){
                cnt++
            }
        }
    }
    return cnt
}