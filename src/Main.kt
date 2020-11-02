import java.util.*

private val scanner: Scanner by lazy(LazyThreadSafetyMode.NONE) {
    Scanner(System.`in`)
}
fun main(){
    val player1 = Player()
    val player2 = Player()
    val controller = Controller(object : Callback{
        override fun tampilkanHasil(hasil : String){
            println()
            println("Hasil: ")
            println(hasil)
        }
    })

    println("==================================")
    println("GAME SUIT TERMINAL VERSION")
    println("==================================")
    print("1. Masukkan Pemain 1: ")
    player1.pilihan = scanner.nextLine().toLowerCase()
    print("2. Masukkan Pemain 2: ")
    player2.pilihan = scanner.nextLine().toLowerCase()

    controller.setPlayer1(player1)
    controller.setPlayer2(player2)
    controller.proses()
}