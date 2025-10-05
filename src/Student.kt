class Student(
    id: Int,
    name: String,
    email: String? = null,
    val studentNumber: String
) : Person(id, name, email) {
    override fun toString() = "Student($studentNumber, $name)"
}