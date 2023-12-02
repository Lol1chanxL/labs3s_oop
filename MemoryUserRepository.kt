import repositories.UserRepository

class MemoryUserRepository : UserRepository, MemoryRepository<User>() {
    val list: ArrayList<User> = ArrayList()

    override fun getByID(id: Int): User? {
        return list.first { it.mId == id }
    }

    override fun getByName(name: String): User? {
        return list.first { it.mName == name }
    }

    override fun getByEmail(email: String): User? {
        return list.first { it.mEmail == email }
    }

    override fun getByCity(city: String): ArrayList<User> {
        return list.filter { it.mCity == city } as ArrayList<User>
    }

    override fun getByGender(gender: Gender): ArrayList<User> {
        return list.filter { it.mGender == gender } as ArrayList<User>
    }

    override fun add(item: User) {
        list.add(item)
    }

    override fun update(item: User) {
        val index = list.indexOf(item)
        list[index] = item
    }

    override fun delete(item: User) {
        list.remove(item)
    }

    override fun get(where: String, orderBy: String): ArrayList<User> {
        when(where){
            "city" -> {
                return getByCity(city = orderBy)
            }
            "gender" -> {
                if (orderBy == "Male") return getByGender(Gender.Male)
                else return getByGender(Gender.Female)
            }

        }
        return ArrayList()
    }


}