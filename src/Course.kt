class Course(
    val id: String,
    val name: String,
    val studentList: MutableList<Student> = mutableListOf(),
    val teacherList: MutableList<Teacher> = mutableListOf(),
    var subject: Subject? = null
) {
    fun addStudent(s: Student) = studentList.add(s)
    fun addTeacher(t: Teacher) = teacherList.add(t)
    override fun toString() = "Course($name, students=${studentList.size}, teachers=${teacherList.size})"
}