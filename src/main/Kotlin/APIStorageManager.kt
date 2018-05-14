import java.io.File

class APIStorageManager: StorageManager {

    private lateinit var lines: List<String>

    private fun makeRequest(url: String){

    }

    fun getLines(): List<String> {
        return this.lines
    }

    override fun read(query: String): List<String> {
        val url = "http://dblp.org/search/publ/api?q=${query}&format=json"
        this.makeRequest(url)
        return this.lines
    }

    override fun length(file_list: List<String>): Int {
        return file_list.size
    }
}