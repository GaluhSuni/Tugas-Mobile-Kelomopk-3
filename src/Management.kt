class Management(
    principal: Teacher,                // Kepala sekolah (1)
    val managerList: MutableList<Teacher> = mutableListOf(), // Daftar manajer (1..*)
    val fieldManager: Staff                // Manajer lapangan (1)
) {
    // Fungsi untuk menampilkan info manajemen
    fun showManagementInfo() {
        println("=== Informasi Manajemen ===")
        println("Principal : ${principal.name}")
        println("Field Manager : ${fieldManager.name} (${fieldManager.position})")
        println("Daftar Manager:")
        managerList.forEach { println("- ${it.name}") }
    }

    // Fungsi untuk menambah manager baru
    fun addManager(teacher: Teacher) {
        managerList.add(teacher)
        println("Manager ${teacher.name} berhasil ditambahkan.")
    }

    var principal: Teacher = principal
        get() {
            println("Mengambil data principal: ${field.name}")
            return field
        }
        set(value) {
            println("Mengubah principal dari ${field.name} menjadi ${value.name}")
            field = value
        }
}
