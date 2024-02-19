fun main(args: Array<String>) {
   
  // Konsola veri girişi yaparak sonucunda toplu bir veri çıkışı alıyoruz.
  
    print("Adınız:")
    var name : String = readLine()!!

    print("Soyadınız:")
    var surname : String = readLine()!!

    print("Yaşınız:")
    var age : Int = readLine()!!.toInt()

    println("Adınız : $name")
    println("Soyadınız : $surname")
    println("Yaşınız : $age")
}
