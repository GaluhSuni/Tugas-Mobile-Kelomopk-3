fun main() {
    // buat beberapa subject & curriculum
    val math = Subject("Mathematics", 3, "MTH17")
    val physics = Subject("Physics", 3, "PHY22")
    val curriculum = Curriculum(mutableListOf(math, physics))

    // buat people
    val t1 = Teacher(101, "Budi", "budi@school.id", "T-001")
    val t2 = Teacher(102, "Sari", "sari@school.id", "T-002")
    val s1 = Student(201, "Anton", "anton@mail", "S-201")
    val s2 = Student(202, "Dewi", "dewi@mail", "S-202")
    val staff1 = Staff(301, "Rina", "rina@school.id", "Kepala Staff")

    // Course
    val course = Course("Py-212", "Intro to Science", subject = physics)
    course.addStudent(s1)
    course.addStudent(s2)
    course.addTeacher(t1)

    //buat table dan chair
    val c1 = Chair(1, "wood")
    val c2 = Chair(2, "wood")
    val c3 = Chair(3, "wood")
    val c4 = Chair(4, "wood")
    val table1 = Table(1, "wood", 2)
    val table2 = Table(2, "wood", 2)

    // Room with furniture
    val roomA = Room("K.202", "Class D", CSStaff = staff1)
    roomA.addTable(table1)
    roomA.addTable(table2)
    roomA.addChair(c1)
    roomA.addChair(c2)
    roomA.addChair(c3)
    roomA.addChair(c4)

    // Organisations & management
    val org = StudentOrganisation(1, "Debating Club", leader = s1)
    org.addmember(s1)
    org.addmember(s2)

    val management = Management(principal = t2, fieldManager = staff1)
    management.addManager(t2)

    val teacherBoard = TeacherBoard(1)
    teacherBoard.addTeacher(t1)
    teacherBoard.addTeacher(t2)
//    teacherBoard.leader = t2

    // print ringkasan
    println(curriculum)
    println(course)
    println(roomA)
    println(org)
    println(management)
    println(teacherBoard)
}