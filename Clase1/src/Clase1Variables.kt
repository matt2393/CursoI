/**
 * 1 Byte = 8 bits
 * ENTERO - BYTE (2^8), SHORT (2^16) ,INT (2^32), LONG (2^64)
 * REALES(punto flotante) - FLOAT (2^16), DOUBLE (2^64)
 * BOOLEANOS - BOOLEAN (TRUE, FALSE)
 * CARACTERES - CHAR  'a' (solo una letra, signo o número)
 * CADENA DE CARACTERES - STRING  "buenos dias 222" (varias letras, signos y números)
 */
var x: Int = 2000000000
var y: Long = 9000000000000000000
var z: Float = 1234.5555550000000000000000000000000000f
var w: Double = 12344.000000000000000000000000000000000000000000000000000000000000000000

var c: Char = 'a'
var s: String = "a.dsadadadmoo222%·"

val h: Int = 7000
fun main() {
    println(x)
    // estamos cambiando de valor
    //x = x - 10
    x -= 10
    println(x)
    println(h)
    //no se puede cambiar de valor por que es "val"
    //h = 100
    //Cuando se infiere el tipo de dato, no se puede cambiar
    // de tipo de dato
    var t = 200
    //t = 2.5
    var k: Int? = null
    println(k)
    k = 2
    ///
    //
    //
    var res = k!! + 10

    var resultado = m!! + 10

    println()
    var nota = 10
    val comprobacion = nota >= 51
    // condicional
    // puede o no tener ELSE
    if(comprobacion) {
        nota += 10
        println("Aprobado")
    } else {
        println("Reprobado")
    }
}
