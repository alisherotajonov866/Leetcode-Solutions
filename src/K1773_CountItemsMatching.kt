fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
    var cnt = 0
    when(ruleKey){
        "type" ->
            for (item in items) {
                if (item[0] == ruleValue)
                cnt++
            }
        "color" ->
            for (item in items) {
                if (item[1] == ruleValue)
                cnt++
            }
        "name" ->
            for (item in items) {
                if (item[2] == ruleValue)
                cnt++
            }
    }
    return cnt
}