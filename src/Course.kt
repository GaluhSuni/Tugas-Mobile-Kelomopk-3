class Course(
    val studentList: MutableList<Student> = mutableListOf(),
    val teacherList: MutableList<Teacher> = mutableListOf(),
    var subject: Subject? = null
) {

}