class Chair(
   val id: Int,                   // ID unik untuk setiap kursi
    val material: String,         
    var isOccupied: Boolean = false // Status kursi (default: tidak ditempati)
) {
  // Fungsi untuk menandai kursi sedang digunakan
    fun occupy() {
        if (!isOccupied) {
            isOccupied = true
            println("Chair $id is now occupied.")
        } else {
            println("Chair $id is already occupied.")
        }
    }

    // Fungsi untuk menandai kursi sudah tidak digunakan
    fun release() {
        if (isOccupied) {
            isOccupied = false
            println("Chair $id is now available.")
        } else {
            println("Chair $id was already free.")
        }
    }

    // Menampilkan informasi kursi dalam bentuk string
    override fun toString(): String {
        return "Chair(id=$id, material='$material', isOccupied=$isOccupied)"
    }
}





