fun main(){
    val repository = MemoryUserRepository()
    repository.add(User(1, "Pavel", "Bobnev@mail.ru", "Iphone", "Kaliningrad", Gender.Male))
    repository.add(User(2, "Boris", "bg@gmail.com", "Iphone12", "Kaliningrad", Gender.Male))
    repository.add(User(3, "Michail", "mc@gmail.com", "Ziaomi", "Kaliningrad", Gender.Male))

    print(repository.getByGender(Gender.Male))

}