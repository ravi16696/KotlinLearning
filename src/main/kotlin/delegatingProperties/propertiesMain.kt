import kotlin.reflect.KProperty

//delegation pattern
class Student {
    var firstName : String? by delegateName()
//        set(value) {
//            if (value != null && value.length > 5) {
//                field = value.trim().toUpperCase()
//            }
//        }
    var lastName : String? by delegateName()
//        set(value) {
//            if(value != null && value.length > 5) {
//                field = value.trim().toUpperCase()
//            }
//        }

    var checksign : Boolean = true
}

class delegateName {
    var formattedValue: String? = null

    operator fun setValue(
        thisRef: Any?,
        property: KProperty<*>,
        value: String?
    ) {
        val student = thisRef as Student
        if (value != null && value.length > 5) {
            if(student.checksign)
                formattedValue = value.trim().toUpperCase()
        }
    }

    operator fun getValue(
        thisRef: Any?,
        property: KProperty<*>
    ) : String? {
        return formattedValue;
    }
}



fun main() {

    val student = Student()
    student.firstName = "asdfasdfa"
    student.lastName = "     ..asd"
    println("firstName : ${student.firstName}")
    println("lastName : ${student.lastName}")

}