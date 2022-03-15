//Soal renungan
/* Ibu beli belajaan di supermarket
400.000 -> diskon 4 %
800.000 -> diskon 9 %
1.600.000 -> diskon 19 %
2.000.000 -> diskon 25 %
3.000.000 -> diskon 40 %
total uang yang harus dibayar
* bit.ly/edit-cat */




fun main () {
    val price = 3000000


    if (price >= 400000 && price < 800000){
         val resultDiskon = price * 4/100
        val finalPrice = price - resultDiskon
        print ("Total bayar adalah $finalPrice")
    }else if(price >= 800000 && price < 1600000){
       val resultDiskon = price * 9/100
       val finalPrice = price - resultDiskon
        print ("Total bayar adalah $finalPrice")
    }else if (price >= 1600000 && price < 2000000){
      val resultDiskon = price * 19/100
        val finalprice = price - resultDiskon
        print ("Total bayar adalah $finalprice")
    } else if (price >= 2000000 && price <3000000) {
        val resultDiskon =price * 25 / 100
        val finalprice = price - resultDiskon
        print ("Total bayar adalah $finalprice")
    }else price >= 3000000
    val resultDiskon = price * 40 / 100
    val finalprice = price - resultDiskon
    print ("Total bayar adalah $finalprice")

}