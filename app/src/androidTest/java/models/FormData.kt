
import Validations.ValidationResult

class FormData (
    private val studentId:String,
    private val year:String,
    private val semester:String,
    private val agree: Boolean,
        )

{    fun validateStudentId(): ValidationResult {
        return if(studentId.isEmpty()){
            ValidationResult.Empty("Student ID is empty")
        }else if(!studentId.startsWith("IT")){
            ValidationResult.Invalid("Should be starting with IT")
        }else if(studentId.length<10){
            ValidationResult.Invalid("Student ID should have 10 characters")
        }else if(studentId.length>10){
            ValidationResult.Invalid("Student ID should have 10 characters")
        }else{
            ValidationResult.Valid
        }
    }
    fun validateYear(): ValidationResult {
        return if(year.isEmpty()){
            ValidationResult.Empty("Year is empty")
        }else{
            ValidationResult.Valid
        }
    }

    fun validateSemester(): ValidationResult {
        return if(semester.isEmpty()){
            ValidationResult.Empty("Semester is empty")
        }else{
            ValidationResult.Valid
        }

    }

    fun validateAgreement():ValidationResult{
        return if(!agree){
            ValidationResult.Invalid("You must agree for the terms and conditions")
        }else{
            ValidationResult.Valid
        }
    }
}

