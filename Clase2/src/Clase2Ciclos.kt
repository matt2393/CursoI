
fun main() {
    //For entre un rango de 1 a 100, de uno en uno
    /*for(i in 1..100) {
        println(i)
    }*/
    //For entre un rango de 1 a 100 expluyendo el ultimo, 100
    /*for(i in 1 until 100) {
        println(i)
    }*/

    //For entre un rango de 1 a 100, de 5 en 5
    /*for(i in 1..100 step 5) {
        println(i)
    }*/
    //For entre un rango de 100 a 1, en reversa
    /*for(i in 100 downTo 1) {
        if(i % 2 == 0) {
            println("$i par")
        } else {
            println("$i impar")
        }
    }*/

    /**
     * WHILE
     */
    // aux = 125
    var aux = 1
    while (aux < 100) {
        println(aux)
        aux *= 5
    }
}