fun main () {
    persegi ( 2.0)
    persegiPanjang(4.0, 5.0)
    jajarGenjang (alas =6.0, tinggi =8.0)
    layangLayang (diagonal1 = 3.0, diagonal2 =5.0 )
    trapesium (a =4.0, b =5.0, t =3.0)
    lingkaran (radius =3.0, r=4.0)
    belahketupat (d1 =4.0, d2 =2.0)
    segitiga (alas =3.0, tinggi =9.0)
}

fun segitiga(alas :Double, tinggi :Double) {
    val result7 =alas * tinggi /2
    println ("alas segitiga adalah $result7")

}

fun belahketupat( d1 :Double, d2 :Double) {
    val result6 = d1 * d2/2
    println ("luas belah_ketupat adalah $result6")

}

fun lingkaran(radius :Double, r :Double) {
    val result5 = radius * radius
    println ("luas lingkaran adalah Sresult5")

}

fun trapesium(a :Double, b:Double, t:Double) {
    val result4 =(a + b) * t /2
    println ("luas trapesium adalah $result4")

}

fun layangLayang(diagonal1 :Double, diagonal2 :Double){
    val result3 = diagonal1 *diagonal2 /2
    println ("luas layang_layang adalah $result3")


}

fun jajarGenjang(alas :Double, tinggi :Double){
    val result2 = alas * tinggi
    println ("luas jajargenjang adalah $result2")

}

fun persegiPanjang(panjang :Double, lebar :Double) {
    val result1 = panjang * lebar
    println ("luas persegi_panjang adalah $result1")

}

fun persegi(sisi: Double) {
    val result = sisi * sisi
    println ("luas persegi adalah $result")

}
