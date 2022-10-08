fun restoreString(s: String, indices: IntArray): String {
   var newString = CharArray(indices.size)
     var cnt = 0
    for (index in indices) {
        newString[index] = s[cnt]
        cnt++
    }
    return newString.joinToString("")
}

fun main() {
    var s = "codeleet"
    var indices = intArrayOf(4,5,6,7,0,2,1,3)
    println(String.format(restoreString(s, indices)))
}