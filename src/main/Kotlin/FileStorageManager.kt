import java.io.File

class FileStorageManager: StorageManager {

    private lateinit var lines: List<String>

    fun getLines(): List<String> {
        return this.lines
    }

    override fun read(file_name: String): List<String> {
        lines = File(file_name).readLines()
        return lines
    }

    override fun length(file_list: List<String>): Int {
        return file_list.size
    }
}