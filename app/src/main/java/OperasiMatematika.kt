fun main() {
    // Tugas : persegi,persegi panjang, jajargenjang,layang-layang,
    // trapesium,lingkaran,segitiga,belah ketupat
    val bil1 = 3
    val bil2 = 5
    val radius = 18
    val sisi = 4
    val panjang = 6
    val luas = 4
    val a = 5
    val t =3
    val d1 =2
    val d2 =7
    val c=10
    val f =9
    val b =8
    val r =4
    val k =5
    val d3 =6
    val d4 =5

    //penjumlahan
    val result1 =bil1 +bil2
    //pengurangan
    val result2 = bil1 - bil2
    //perkalian
    val result = bil1 * bil2
    //pembagian
    val result4 : Double = bil2. toDouble () / bil1. toDouble()
    val luas_lingkaran : Double = 3.14 * (radius.toDouble () * radius.toDouble () )
    val luas_persegi = sisi * sisi
    val persegi_panjang = panjang * luas
    val jajargenjang = a * t
    val layang_layang = d1 * d2 /2
    val trapesium = (c +b) * f /2
    val segitiga = (r * k) /2
    val belah_ketupat = (d3 * d4) /2
    println ("Hasil operasi aritmatika antara bilangan 1 dan 2 " +
            "adalah sbb\npenjumlahan $result1 \npengurangan $result2 /n " +
            "perkalian $result \npembagian $result4 \n" +
            "luas lingkaran $luas_lingkaran \nluas persegi $luas_persegi \n" +
            "persegi panjang $persegi_panjang \n" +
            "jajargenjang $jajargenjang \nlayang layang $layang_layang \n" +
            "trapesium $trapesium \nsegitiga $segitiga \nbelah ketupat $belah_ketupat ")


}