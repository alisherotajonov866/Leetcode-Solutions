fun mostWordsFound(sentences: Array<String>): Int {
        var cnt:Int = 1
        var max = 0
        for (i in sentences) {
            cnt = 1
            for (c in i) {
                if (c==' ') cnt++
            }
            if (cnt>max){
                max = cnt
            }
        }
        return max
    }
fun main() {
    val sentences = arrayOf("i love you","island","iroman","i love English grammer")
    println(mostWordsFound(sentences))
}