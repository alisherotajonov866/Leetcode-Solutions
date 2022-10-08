fun finalValueAfterOperations(operations: Array<String>): Int {
    var x = 0
    for (s in operations) {
        if (s =="X++"||s=="++x"){
            x++
        }else x--
    }
    return x
}