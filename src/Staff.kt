class Staff(
    name : String,
    var position : String
) : Person(name){
    var assignedRoom : Room? = null
    var management : Management? = null



}