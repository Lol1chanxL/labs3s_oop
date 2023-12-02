package repositories

interface IRepository<T> {
    fun add(item: T)
    fun update(item: T)
    fun delete(item: T)
    fun get(where: String, orderBy: String): ArrayList<T>
}

