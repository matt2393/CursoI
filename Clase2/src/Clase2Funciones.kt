
fun main() {
    factorial(5)
    factorial(6)
    factorial(3)
    factorial(7)

    val f1 = factorial2(5)
    val f2 = factorial2(3)
    val res = f1 + f2
    println(res)
}

fun factorial(x: Int){
    var fac = 1
    for(i in 1..x) {
        fac *= i
    }
    println(fac)
}
fun factorial2(x: Int): Int {
    var fac = 1
    for(i in 1..x) {
        fac *= i
    }
    return fac
}

