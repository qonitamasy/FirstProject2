import java.util.*

fun main () {
    val reader = Scanner (System .`in`)
    println ("pilihlah skala suhu yang kamu inginkan dengan angka 1,2,atau 3 !\n " +
            "1.fahrenheit\n" +
            "2.kelvin\n" +
            "3.reamur\n" +
            "inputkan pilihanmu:\n"
    )
    val bil1 = reader.nextInt()

    if (bil1 ==1) {
        val skalaKonversi = "fahrenheit"
        print ("masukkan dalam skala celcius yang ingin kamu konversikan !\n " +
                "masukkan suhu (celcius):")
        val bil2 =reader .nextInt()
        print ("masukkan celcius :")
        val suhuAwal = bil2
        val suhuAkhir =(suhuAwal * 9/5)+32
        print ("hasil konversi suhu $suhuAwal celcius menjadi $suhuAkhir $skalaKonversi")

    }else if (bil1 ==2) {
            val skalaKonversi = "kelvin"
            print ("masukkan dalam skala celcius yang ingin kamu konversikan !\n " +
                    "masukkan suhu (celcius):")
            val bil2 =reader .nextInt()
            print ("masukkan celcius :")
            val suhuAwal = bil2
            val suhuAkhir =suhuAwal +273
        print ("hasil konversi suhu $suhuAwal celcius menjadi $suhuAkhir $skalaKonversi")


    }else if (bil1 ==3) {
            val skalaKonversi = "reamur"
            print("masukkan dalam skala celcius yang ingin kamu konversikan !\n " +
                        "masukkan suhu (celcius):")
            val bil2 = reader.nextInt()
            print("masukkan celcius :")
            val suhuAwal = bil2
            val suhuAkhir = suhuAwal * 4 / 5
            print("hasil konversi suhu $suhuAwal celcius menjadi $suhuAkhir $skalaKonversi")

        }
    }


