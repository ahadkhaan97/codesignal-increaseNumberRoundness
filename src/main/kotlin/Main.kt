fun main() {
    print(solution(234230))
}

fun solution(n: Int): Boolean {
    val numberString = n.toString()
    var count = 0
    for (i in numberString.length - 1 downTo 1) {
        if (numberString[i] == '0') {
            if (count > 0)
                return true
        } else {
            count++
        }
    }
    return false
}
