fun main(args: Array<String>) {
    //Boolean veri tipleri sadece true ve false alır.
    var isTrue: Boolean = 5 > 4
    println("isTrue:" + isTrue)

    //Char veri tipleri sadece karakter alır. Karakter tek tırnak içinde olmalıdır.
    var char : Char = 'P'

    //String veri tipleri metinler ile çalışmayı sağlar.
    var stringData : String = "Kotlinde stringler \n hem çift hem de üç tırnak içinde olabilir"
    println(stringData)

    var stringData2 : String = """Kotlinde stringler \n hem çift hem de üç tırnak içinde olabilir"""
    println(stringData2)

    var name : String = "Postuldak"
    println("Merhaba adım " + name + " ,Adımda toplam " + name.length + " karakter vardır.")

    println("Merhaba adım   $name ,Adımda toplam  ${name.length}  karakter vardır.")

    //arrayOf() dizi oluşturmak için kullanılır.
    var number = arrayOf(0,1,2,3,4,5,6,7,8,9)
    println(number)

    println("1.elemanı:"+number[0])
    println("5.elemanı:"+number[4])

    println("Dizinin eleman sayıs:"+number.size)

    var weekOfDay = arrayOf("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar")

    println("weekOfDay dizinin 4.elemanı:"+weekOfDay[3])

    var chars = arrayOf('a','x','/','?')



}
