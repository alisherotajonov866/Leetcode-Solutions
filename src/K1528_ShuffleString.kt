fun restoreString(s: String, indices: IntArray): String {
   var newString = CharArray(indices.size)
     var cnt = 0
    for (index in indices) {
        newString[index] = s[cnt]
        cnt++
    }
    return newString.joinToString("")
}