package ClassAndObject
/**
 * Polimorism adalah sebuah fungsi yang sama dengan parameter yang berbeda
 * */

// fungsi show dengan parameter bertipe String
fun show(nama:String):Unit{
    println("nama "+nama )
}
// fungsi show dengan parameter bertipe Integer
fun show(nomor:Int){
    println("nama "+nomor)
}
// fungsi show dengan parameter bertipe Double
fun show(double:Double){
    println("nama "+ double)
}

fun main() {
    show("muhammad arief hidayat")
    show(1)
}