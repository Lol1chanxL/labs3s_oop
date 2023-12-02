import repositories.IRepository

open class MemoryRepository<T> : IRepository<T> {
    private val list  = ArrayList<T>()
    override fun add(item: T) {
        list.add(item)
    }

    override fun update(item: T) {
        val index = list.indexOf(item)
        list[index] = item
    }

    override fun delete(item: T) {
        list.remove(item)
    }

    override fun get(where: String, orderBy: String): ArrayList<T> {
        TODO("Not yet implemented")
    }
}