fun main() {
    val math = Subject("Matematika", "MATH101")
    val physics = Subject("Fisika", "PHY102")

    val curriculum = Curriculum("Kurikulum 2025")
    curriculum.addSubject(math)
    curriculum.addSubject(physics)

    curriculum.displayCurriculum()
}