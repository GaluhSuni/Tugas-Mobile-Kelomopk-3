class Teacher(
    id: Int,
    name: String,
    email: String? = null,
    val teacherCode: String
) : Person(id, name, email) {
    override fun toString() = "Teacher($teacherCode, $name)"
}