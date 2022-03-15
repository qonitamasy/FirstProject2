import java.util.*

fun main () {
    val reader = Scanner (System.`in` )
    print ("masukkan bilangan anda")
    val number = reader .nextInt ()



    if (number < 0 ) {
        print ("negatif")
    } else {
        print ("positive")
    }
    
}

