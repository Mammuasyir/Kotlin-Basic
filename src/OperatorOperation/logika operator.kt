package OperatorOperation

fun main() {
    /**
     * Logika Operator
     * AND OR dan NOT
     * &&  ||     !
     * || itu bernilai salah jika keduanya bernilai salah, jika tidak maka iya bernilai benar
     * && (And) itu terjadi benar apalbila kedua kondisi itu bernilai benar
     * ! ITU ADALAH KEBALIKAN DARI HASIL KONDISI
     * */

    var nomoroPertama = 2
    val nomorKedua = 3
    val nomorKetiga = 5

//    if ((nomorkedua < nomorketiga) && (nomoropertama < nomorketiga)){
////                 Benar                     Benar
//        print ("kondisi berilai benar")
//
//    }else{
//        print("kondisi bernilai salah")
//    }

    if (!(nomorKedua  > nomorKetiga) ||  !(nomoroPertama > nomorKetiga)){
//                Benar                     BENAR
        print ("kondisi berilai benar")

    }else{
        print("kondisi bernilai salah")
    }
}