class Curriculum(
    val subjectList: MutableList<Subject>
) {
    fun addSubject(subject: Subject) {
        subjectList.add(subject)
    }

    fun showSubjects() {
        println("Daftar Subject dalam Kurikulum:")
        subjectList.forEach { println(it.subjectName) }
    }
}
