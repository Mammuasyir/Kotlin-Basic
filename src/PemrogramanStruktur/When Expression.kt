package PemrogramanStruktur

fun main() {
    /**
     * when expression adalah salah satu percabanan dalam pemrograman kotlin
     * dalam bahasa pemrograman lain mirip seperti switch case
     * when Expression (swich case) + Readline???
     * */

    /*aplikasi tebak tebakan umur*/

    println("saya sekolah di sd neger indonesia kelas 5 tebak umur saya 10 tahun kedepan")
    val jawaban = readLine()!!.toInt() //menggunakan input keyboard

//    umur 23

    /*
    * menggunakan when expresion
    * */
    when(jawaban){
        18 -> print("anda salah menebak umur")
        19 -> print("waduuh kurang dikiiiitt lagi kanggg ")
        20 -> print("kurang sangat amat dikit kang")
        22 -> print("kurang sangat amat dikit sekali kang")
        23 -> print("yuuup horeee anda benar")
        else -> {
            print("jauh banget kan tebakannya")
        }
    }
}