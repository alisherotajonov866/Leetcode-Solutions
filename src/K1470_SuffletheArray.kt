fun shuffle(nums: IntArray, n: Int): IntArray {

    var newArray = IntArray(0)
    for (i in 0 until n){
        newArray+=nums[i]
        newArray+=nums[n+i]
    }
    return newArray

}