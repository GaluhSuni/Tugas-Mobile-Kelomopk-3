class Chair(
    val id: Int,                   // ID unik untuk setiap kursi
    val material: String,          // Bahan kursi
    var isOccupied: Boolean = false // Status kursi (default: tidak ditempati)
) {
    // Fungsi untuk menandai kursi sedang digunakan
    fun occupy() {
        if (!isOccupied) {
            isOccupied = true
            println("Kursi $id sekarang sedang digunakan.")
        } else {
            println("Kursi $id sudah digunakan.")
        }
    }

    // Fungsi untuk menandai kursi sudah tidak digunakan
    fun release() {
        if (isOccupied) {
            isOccupied = false
            println("Kursi $id sekarang tersedia.")
        } else {
            println("Kursi $id sudah kosong.")
        }
    }

    // Menampilkan informasi kursi dalam bentuk string
    override fun toString(): String {
        return "Kursi(id=$id, bahan='$material', sedangDipakai=$isOccupied)"
    }
}








