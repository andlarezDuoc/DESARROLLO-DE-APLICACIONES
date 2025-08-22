fun main () {
    for (i in 1..20) {
        if (i == 5) {
            continue
        } else if (i in 11..19) {
            continue
        } else {
            println(i)
        }
    }
}
