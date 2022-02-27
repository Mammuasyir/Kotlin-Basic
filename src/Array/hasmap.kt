package Array
/**
 * Hasmap pada pemrograman kotlin
 * */

fun main(args: Array<String>) {
    /*
       Hashmap = Key-value pairs

     */
    //(1 -> Mary)
    //(Mary -> Married)

    var hashmap = HashMap<String, String>()
    hashmap.put("Mary", "Married")
    hashmap.put("Paulo", "Married")
    hashmap.put("John", "Single")


    for (key in hashmap.keys) println(hashmap.get(key))



    // println(hashmap.get("John"))




}
