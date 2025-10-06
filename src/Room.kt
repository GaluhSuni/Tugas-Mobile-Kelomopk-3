class Room(
    val id: String,
    val name: String,
    val tableList: MutableList<Table> = mutableListOf(),
    val chairList: MutableList<Chair> = mutableListOf(),
    var CSStaff: Staff? = null // staff in charge of the room
) {
    fun addTable(t: Table) = tableList.add(t)
    fun addChair(c: Chair) = chairList.add(c)

    //tambahkan set untuk mengubah CSStaff
    override fun toString() = "Room($name, tables=${tableList.size}, chairs=${chairList.size})"
}