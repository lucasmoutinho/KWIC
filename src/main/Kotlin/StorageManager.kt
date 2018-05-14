interface StorageManager {
    fun init()
    fun write(file_name: String)
    fun read(file_name: String) : List<String>
    fun length(): Int
}