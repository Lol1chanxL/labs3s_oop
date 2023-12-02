data class User(
    var mId: Int,
    var mName: String,
    var mEmail: String,
    var mPhone: String,
    var mCity: String,
    var mGender: Gender
)

enum class Gender { Male, Female }