package repositories

import Gender
import User

interface UserRepository : IRepository<User> {

    fun getByID(id: Int): User?
    fun getByName(name: String): User?
    fun getByEmail(email: String): User?

    fun getByCity(city: String): ArrayList<User>
    fun getByGender(gender: Gender): ArrayList<User>



}