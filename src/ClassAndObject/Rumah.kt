package ClassAndObject
/**
 * membuat sebuah klass rumah dengan beberapa parameter
 * */
class Rumah(var tipe :String, val harga:Double, val tahunPembangunan :Int, val pemilik:String){
    /*
    * melakukan inisialisasi clas rumah
    * */
    init {
        this.tipe
        this.harga
        this.tahunPembangunan
        this.pemilik
    }

    /**
     * getters and setters adalah sebuah optional pada kotlin tidak seperti java
     * membuat setters dan getters adalah bad programming pada kotlin
     * kootlin menginginkan kita untuk selalu menggunkaan properties untuk mengakses dan set class
     * */
}


fun main() {
    /**
     * membuat sebuah object Rumah
     * */
    val rumah = Rumah("Mewah",200000000.0,2021,"Muhammad Arief Hidayat")

    //mencetak sebuah object rumah
    println("rumah ${rumah.pemilik} tahun pembangunan ${rumah.tahunPembangunan} dengan harga ${rumah.harga} tipe ${rumah.tipe}")
    val toko = Rumah("tingkat 5",200000000.0,2081,"Muhammad Hidayat")

    println("rumah ${toko.pemilik} tahun pembangunan ${toko.tahunPembangunan} dengan harga ${toko.harga} tipe ${toko.tipe}")

}