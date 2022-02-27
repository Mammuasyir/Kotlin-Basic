package Variable

/**
 * Variable scope adalah cakupan sebuah variable akses
 * cakupan variable dibagi menjadi 2 yaitu golbal dan local
 * */

//deklarasi variable Variable.getNama type Global
var Nama :String? = null

fun main() {
    Nama
    var ayam = "dfafa"
    myName() //memanggil fungsi Variable.myName
}

fun myName(){
    Nama
//    ayam
    Nama = "Arief Hidayat" // memberi nilai pada variable Variable.getNama
    print("Variable.getNama : $Nama") //cetak variabel Variable.getNama
}