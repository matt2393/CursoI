
var nota = 30


fun main() {
    //switch -> en otros lenguajes
    /*if(nota > 51) {
        if(nota > 80) {
            if(nota > 90) {
                //excelente
            } else {
                //optimo
            }
        } else {
            //aprobado
        }
    } else {
        if(nota > 35) {
            //reforzamiento
        } else {
            // reprobado
        }
    }*/
    when(nota) {
        //51 -> println("")
        in 90..100 -> println("Excelente")
        in 80..89 -> println("Optimo")
        in 52..79 -> println("Aprobado")
        in 36..50 -> println("Reforzamiento")
        in 0..35 -> println("Reprobado")
    }
}