package ClassAndObject
/**
 * membuat class animal dan class Kucing yang merupakan inheritance dari Animal,
 * membuat object dari kelas yang telah dibuat
 * */

/**
 * membuat class Animal dengan hak akses open
 * */
open class Animal(){
//    deklarasi variable
    var name:String? =null
    var color:String? =null
    var jumlahKaki:Int? =null

//    membuat konstruktor
    constructor(name:String,color:String,jumlahKaki:Int):this() {
        this.color = color
        this.name = name
        this.jumlahKaki = jumlahKaki

    }
}

/**
 *melakukan inherintance atau pewarisan sifat animal kepada kucing
 * */
class Kucing():Animal(){

}

fun main() {
    var animal = Animal("ayam","ijo",20) //    pembuatan object
    println("${animal.jumlahKaki}")
    var kucing = Kucing() //    pembuatan object kucing dari klas Kucing
    kucing.jumlahKaki = 7
    print("${kucing.jumlahKaki}")
}