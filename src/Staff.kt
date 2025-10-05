class Staff(
    id: Int,
    name: String,
    email: String? = null,
    var position: String
) : Person(id, name, email) {

    var assignedRoom: Room? = null
    var management: Management? = null

    // Fungsi untuk menampilkan info staff
    fun showInfo() {
        println("ID: $id, Nama: $name, Jabatan: $position, Email: $email")
    }
}
