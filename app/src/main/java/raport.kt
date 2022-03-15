fun main () {
    raport ("vero" ,  "A", "B", "B", "B")

}

fun raport (name : String,  uiux : String, web :String, android : String, comthink : String ) {
    println(
        "Nilai semester 1 dari siswi atas nama ${name}," +
                "adalah sebagai berikut  \nui/ux ${uiux} \nweb ${web}\n" +
                "android ${android} \ncomthink ${comthink}")

}
