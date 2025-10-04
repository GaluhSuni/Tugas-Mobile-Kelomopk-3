class TeacherBoard(
    val id: Int,
    val teacherList: MutableList<Teacher> = mutableListOf(),
    val leader: Teacher? = null
) {
    fun addTeacher(teacher: Teacher) = teacherList.add(teacher)
    override fun toString() = "TeacherBoard(teachers=${teacherList.size}, leader=${leader?.name})"
}