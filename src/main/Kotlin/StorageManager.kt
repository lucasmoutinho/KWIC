interface StorageManager {
    fun read(file_name: String) : List<String>
    fun length(file_list: List<String>): Int

}