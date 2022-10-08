fun romanToInt(s: String): IntArray {
    var romanArray = IntArray(s.length)
    for (i in s) {
        when(i){
            'M' -> romanArray+=1000
            'D' -> romanArray+=500
            'C' -> romanArray+=100
            'L' -> romanArray+=50
            'X' -> romanArray+=10
            'V' -> romanArray+=5
            'I' -> romanArray+=1
        }
    }
    return romanArray

}


fun main() {
   var myString = "III"
    var myArray = romanToInt(myString)
    for (i in myArray) {
        println(i)
    }
}