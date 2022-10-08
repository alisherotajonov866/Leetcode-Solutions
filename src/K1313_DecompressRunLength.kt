fun decompressRLElist(nums: IntArray): IntArray {
        var myList = mutableListOf<Int>()
        for (i in nums.indices step 2) {
            repeat(nums[i]) {
                myList.add(nums[i + 1])
            }
        }
        return myList.toIntArray()
    }