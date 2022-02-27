package ClassAndObject
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

open class Kendaraanl {
    open fun Klakson() {
        println("The kendaraan makes a sound")
    }
}
class mobill:Kendaraanl() {
   override fun Klakson() {
        println("The mobil says: wee wee")
    }
}
class sepedah:Kendaraanl() {
    override fun Klakson() {
        println("The sepedah says: Sepdah")
    }
}
object MyMainClass {
    @JvmStatic fun main(args:Array<String>) {
        var myKendaran = Kendaraanl() // Create a Animal object
        var myMobil = mobill() // Create a mobill object
        var mySepedah = sepedah() // Create a sepedah object

        myKendaran = mySepedah
        myKendaran.Klakson()

        myKendaran = myMobil
        myKendaran.Klakson()
    }
}