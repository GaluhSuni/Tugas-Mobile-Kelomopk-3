class StudentOrganisation(
    val id: Int,
    val name: String,
    val leader: Student,
    val member: MutableList<Student> = mutableListOf() // leaders multiplicity [0..*]
) {
    fun addmember(s: Student) = member.add(s)

    //tambahkan set untuk mengubah leader
    override fun toString() = "StudentOrganisation($name, leaders=${member.size})"
}